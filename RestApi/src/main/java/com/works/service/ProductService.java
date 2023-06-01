package com.works.service;



import com.works.entities.Product;
import com.works.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Boolean deleteProduct(Long pid){
        try{

            productRepository.deleteById(pid);
            return true;
        }
        catch (Exception e){
            System.err.println(e);
            return false;
        }

    }

    public Product update (Product product){
        Optional<Product> optionalProduct = productRepository.findById(product.getPid());
        if (optionalProduct.isPresent()){
            productRepository.saveAndFlush(product);
            return product;
        }

        return null;
    }

}
