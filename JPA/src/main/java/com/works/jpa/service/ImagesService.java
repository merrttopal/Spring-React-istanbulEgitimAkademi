package com.works.jpa.service;

import com.works.jpa.entities.ProductImage;
import com.works.jpa.repositories.ProductImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ImagesService {
    final ProductImageRepository imageRepository;

    public ProductImage addImage(ProductImage productImage){
        imageRepository.save(productImage);
        return productImage;
    }
    public List<ProductImage> list(Long pid){
        return imageRepository.findByPidEquals(pid);
    }

}
