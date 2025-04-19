package com.example.demo.model.request;

import io.soabase.recordbuilder.core.RecordBuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@RecordBuilder
public record PostProductRequest(
         String categoryName,
         String productName,
         String description,
         BigDecimal price,
         String image_url,
         LocalDateTime createdAt,
         String createdBy,
         LocalDateTime updatedAt,
         String updatedBy
) {
}
