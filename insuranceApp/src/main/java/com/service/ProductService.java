package com.service;

import com.configs.Standard;
import com.entities.Product;
import com.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class ProductService {
    final ProductRepository productRepository;

    public ResponseEntity list( int page){
        Sort sort = Sort.by("price").descending();
        Pageable pageable = PageRequest.of(page,20,sort);

        Standard standard = new Standard(true,productRepository.findAll());
        return new ResponseEntity(standard, HttpStatus.OK);
    }
}
