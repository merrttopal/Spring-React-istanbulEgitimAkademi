package com.service;

import com.configs.ResourceNotFoundException;
import com.configs.Standard;
import com.entities.Product;
import com.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor

public class ProductService {
    final ProductRepository productRepository;
    public ResponseEntity list( int page){
        Sort sort = Sort.by("pTitle");
        Pageable pageable = PageRequest.of(page,20,sort);
        Standard standard = new Standard(true,productRepository.findAll(pageable));
        return new ResponseEntity(standard, HttpStatus.OK);
    }

    public ResponseEntity save (Product product){
        try {
            Optional<Product> optionalProduct = productRepository.findBypTitleEquals(product.getPTitle());
            productRepository.save(product);
            Standard standard = new Standard(true,product);
            return new ResponseEntity(standard, HttpStatus.OK);
        }catch (Exception exception){
            Standard standard = new Standard(false,exception.getMessage());
            return new ResponseEntity(standard,HttpStatus.BAD_REQUEST);
        }
    }

    public ResponseEntity drop (Product product){
        try {
            productRepository.delete(product);
            Standard standard = new Standard(true,product);
            return new ResponseEntity(standard, HttpStatus.OK);

        }catch (Exception exception){

            Standard standard = new Standard(false,exception.getMessage());
            return new ResponseEntity(standard,HttpStatus.BAD_REQUEST);
        }
    }
    public ResponseEntity updateProduct( Product productDetails) throws ResourceNotFoundException {
        Optional<Product> product = productRepository.findById(productDetails.getPid());

        try {
            if(product.isPresent()) {
                product.get().setPTitle(productDetails.getPTitle());
                product.get().setPDetail(productDetails.getPDetail());
                product.get().setPrice(productDetails.getPrice());
                product.get().setCategories(productDetails.getCategories());
                productRepository.saveAndFlush(product.get());
                Standard standard = new Standard(true,product);
                ResponseEntity responseEntity = new ResponseEntity(standard,HttpStatus.OK);
                return responseEntity;
            }

        }catch (Exception exception){
            Standard standard = new Standard(false,exception.getMessage());
            return new ResponseEntity(standard,HttpStatus.BAD_REQUEST);
        }
        return null;
    }

    public ResponseEntity productDetail(Long id){
        Optional<Product> product = productRepository.findById(id);

        try{
            if(product.isPresent()){
                ResponseEntity responseEntity = new ResponseEntity<>(product.get(),HttpStatus.OK);
                return responseEntity;
            }

        }catch (Exception ex){
            Standard rest = new Standard(false,ex.getMessage());
            ResponseEntity responseEntity = new ResponseEntity<>(rest,HttpStatus.BAD_REQUEST);
            return responseEntity;
        }
        return null;
    }
}



