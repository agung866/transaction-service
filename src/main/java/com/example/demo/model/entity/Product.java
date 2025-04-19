package com.example.demo.model.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;

import lombok.Builder;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private String categoryName;
    private String productName;
    private String description;
    private int stock;
    private BigDecimal price;
    private String image_url;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;
}

