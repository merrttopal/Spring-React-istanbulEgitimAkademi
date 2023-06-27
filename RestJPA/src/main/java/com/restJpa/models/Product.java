package com.restJpa.models;

import lombok.Data;

@Data
public class Product {
    private Long id;
    private String title;
    private String description;
    private Long price;
    private Double discountPercentage;
    private Double rating;
    private Long stock;
    private String brand;
    private String category;
    private String thumbnail;
    private String[] images;
}
