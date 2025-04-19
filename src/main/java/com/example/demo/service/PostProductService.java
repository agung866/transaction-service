package com.example.demo.service;

import com.example.demo.model.entity.Product;
import com.example.demo.model.request.PostProductRequest;
import com.example.demo.repository.ProductRepository;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Slf4j
public class PostProductService {

    @Autowired
    private ProductRepository productRepository;

    public void execute(List<PostProductRequest> requests) {

        List<Product> productList = requests.stream().map(request ->
                Product.builder()
                        .categoryName(request.categoryName())
                        .productName(request.productName())
                        .description(request.description())
                        .price(request.price())
                        .image_url(request.image_url())
                        .stock(request.stock())
                        .createdAt(request.createdAt())
                        .createdBy(request.createdBy())
                        .updatedAt(request.updatedAt())
                        .updatedBy(request.updatedBy())
                        .build()
        ).toList();
        productRepository.saveAllAndFlush(productList);
    }
}
