package com.works.service;



import com.works.entities.Product;
import com.works.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class ProductService {

    final ProductRepository productRepository;
    public Product save (Product product){
        productRepository.save(product);
        return product;
    }

    public List<Product> productList(){
        return productRepository.findAll();
    }

}
