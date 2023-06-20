package com.restJpa.entities.projections;

/**
 * A Projection for the {@link com.restJpa.entities.Product} entity
 */
public interface ProductInfo {

    Long getPid();
    String getTitle();
    Integer getPrice();
    Long getCid();
    String getCatName();

}