package com.restJpa.models;

import lombok.Data;

@Data
public class Products {
    private Product[] products;
    private Long total;
    private Long skip;
    private Long limit;
}
