package com.service;

import com.configs.Standard;
import com.entities.Categories;
import com.repositories.CategoriesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryService {

    final CategoriesRepository repository;
    public ResponseEntity save (Categories cat){
        try {
            repository.save(cat);
            Standard standard = new Standard(true,cat);
            return new ResponseEntity(standard, HttpStatus.OK);

        }catch (Exception exception){

            Standard standard = new Standard(false,exception.getMessage());
            return new ResponseEntity(standard,HttpStatus.BAD_REQUEST);
        }
    }

    public ResponseEntity list( int page) {

        try {
            Pageable pageable = PageRequest.of(page, 3);
            Standard standard = new Standard(true, repository.findAll());
            return new ResponseEntity(standard, HttpStatus.OK);

        } catch (Exception exception) {
            Standard standard = new Standard(false,exception.getMessage());
            return new ResponseEntity(standard,HttpStatus.BAD_REQUEST);

        }
    }

    public ResponseEntity drop (Categories cat){
        try {
            repository.delete(cat);
            Standard standard = new Standard(true,cat);
            return new ResponseEntity(standard, HttpStatus.OK);

        }catch (Exception exception){
            Standard standard = new Standard(false,exception.getMessage());
            return new ResponseEntity(standard,HttpStatus.BAD_REQUEST);
        }
    }

}
