package com.example.beanscheck.models;

import lombok.Data;

@Data
public class Product {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String imageUrl;
    private Category category;
}