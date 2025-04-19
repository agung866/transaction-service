package com.example.demo.events;

import io.soabase.recordbuilder.core.RecordBuilder;

@RecordBuilder
public record SuccessPaymentEvent(Long orderId,
                                  Long productId, int qty){
}
