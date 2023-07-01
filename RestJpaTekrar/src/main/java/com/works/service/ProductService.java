package com.works.service;

import com.works.config.Standard;
import com.works.entities.Product;
import com.works.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    final ProductRepository productRepository;

    public ResponseEntity save (Product product){
        try {
            productRepository.save(product);
            Standard standard = new Standard(true,product);
            return new ResponseEntity(standard, HttpStatus.OK);

        }catch (Exception exception){

            Standard standard = new Standard(false,exception.getMessage());
            return new ResponseEntity(standard,HttpStatus.BAD_REQUEST);
        }
    }


    public ResponseEntity list (){
        Standard standard = new Standard(true,productRepository.findAll());
        return new ResponseEntity(standard, HttpStatus.OK);
    }

}
