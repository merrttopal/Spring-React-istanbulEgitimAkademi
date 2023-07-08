package com.works.services;

import com.works.entities.Product;
import com.works.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;

@Service
@RequiredArgsConstructor

public class ProductService {
    final ProductRepository productRepository;

    public Product save( Product product){
        return productRepository.save(product);

    }
    public List<Product> list(){
        return productRepository.findAll();
    }

}
