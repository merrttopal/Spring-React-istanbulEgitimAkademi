package com.service;

import com.entities.ProductImage;
import com.repositories.ProductImageRepository;
import com.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ImageService {
    final ProductImageRepository productImageRepository;
    final ProductRepository productRepository;

    public ProductImage addImage(ProductImage productImage){
        productImageRepository.save(productImage);
        return productImage;
    }

    public List<ProductImage> list(Long pid){
        return productImageRepository.findByPidEquals(pid);
    }
}
