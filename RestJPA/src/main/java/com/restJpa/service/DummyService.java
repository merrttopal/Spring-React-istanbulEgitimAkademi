package com.restJpa.service;

import com.restJpa.models.Product;
import com.restJpa.models.Products;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
@RequiredArgsConstructor
public class DummyService {

    final RestTemplate restTemplate;

    public Products getAllProduct(){

        String url = "https://dummyjson.com/products";
        Products obj = restTemplate.getForObject(url, Products.class);
        return obj;

    }
    public Product addProduct(Product product){
        String url = "https://dummyjson.com/products/add";

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity httpEntity = new HttpEntity<>(product,httpHeaders);

        ResponseEntity<Product>  responseEntity = restTemplate.postForEntity(url,httpEntity,Product.class);

        return responseEntity.getBody();
    }

}
