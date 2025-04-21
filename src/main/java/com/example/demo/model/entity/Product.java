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
    @Column(name = "created_at", insertable = false, updatable = false)
    private LocalDateTime createdAt;
    @Column(name = "created_by", insertable = false, updatable = false)
    private String createdBy;
    @Column(name = "updated_at", insertable = false, updatable = false)
    private LocalDateTime updatedAt;
    @Column(name = "updated_by", insertable = false, updatable = false)
    private String updatedBy;

}

