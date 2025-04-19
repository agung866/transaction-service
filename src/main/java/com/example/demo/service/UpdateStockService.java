package com.example.demo.service;

import com.example.demo.errorhandling.DataNotFoundException;
import com.example.demo.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.common.events.SuccessPaymentEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UpdateStockService {

    private final ProductRepository productRepository;

    @KafkaListener(topics = "${spring.kafka.topic.payment-success}", groupId = "${spring.kafka.consumer.group-id}")
    public void execute(SuccessPaymentEvent event) {
        log.info("Mengupdate stok untuk order: {}", event.transactionId());
        event.items().forEach(itemDetail -> {
            productRepository.findByProductId(itemDetail.productId()).ifPresent(product -> {
                product.setStock(product.getStock() - itemDetail.quantity());
                productRepository.save(product);
                log.info("Stok produk {} berhasil diperbarui", product.getProductId());
            });
        });
    }
}


