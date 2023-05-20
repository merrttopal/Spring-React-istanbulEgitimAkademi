package com.works.jpa.service;

import com.works.jpa.entities.Product;
import com.works.jpa.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {

    final ProductRepository productRepository;

    public Product save(Product product){
        return productRepository.save(product);
    }

    public List<Product> allProduct(Product products){
        return productRepository.findAll();
    }

    public boolean deleteProduct(String stPid){
        try {
            long pid = Long.parseLong(stPid);
            boolean status = productRepository.existsById(pid);
            if(status){
                productRepository.deleteById(pid);
                return true;
            }
        }catch (Exception exception){
            System.err.println(exception);
        }
        return false;
    }

    public Product getSingleProduct(Long pid){
        Optional<Product> optionalProduct = productRepository.findById(pid);
        if (optionalProduct.isPresent()){
            return optionalProduct.get();
        }
        return null;
    }

    public boolean updateProduct(Product product){
        try {
            productRepository.saveAndFlush(product);
            return true;
        }catch (Exception exception){
            System.out.println(exception);
        }

        return false;
    }

}
