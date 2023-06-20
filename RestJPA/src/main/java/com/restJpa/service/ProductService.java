package com.restJpa.service;

import com.restJpa.entities.Product;
import com.restJpa.entities.projections.IProCat;
import com.restJpa.repositories.ProductRepository;
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
    public ResponseEntity listCat(Long cid){
        try {
            return new ResponseEntity(productRepository.proCatJoin(cid), HttpStatus.OK);
        }catch (Exception exception){
            System.out.println(exception);
        }
        return null;
    }

    public ResponseEntity listCatPage(Long cid, int page){
        try {
            Sort sort = Sort.by("price").descending(); //  ürün ekleme sıralaması
            Pageable pageable = PageRequest.of(page,3,sort);
            Page<IProCat> proCatPage = productRepository.proCatJoinPage(cid,pageable);
            return new ResponseEntity(proCatPage, HttpStatus.OK);
        }catch (Exception exception){
            System.out.println(exception);
        }
        return null;
    }

}
