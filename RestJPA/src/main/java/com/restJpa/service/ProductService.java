package com.restJpa.service;

import com.restJpa.entities.Product;
import com.restJpa.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class ProductService {
    final ProductRepository productRepository;

    public Product save(Product product){
        try {
            return productRepository.save(product);
        }catch (Exception exception){
            System.out.println(exception);
        }
        return null;
    }

    public ResponseEntity list(){
        try {
            return new ResponseEntity(productRepository.proCatJoin(), HttpStatus.OK);
        }catch (Exception exception){
            System.out.println(exception);
        }
        return null;
    }

}
