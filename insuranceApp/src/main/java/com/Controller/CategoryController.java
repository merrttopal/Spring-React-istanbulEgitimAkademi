package com.Controller;

import com.entities.Categories;
import com.entities.Product;
import com.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/category")
public class CategoryController {

    final CategoryService service;

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody @Valid Categories cat){
        return service.save(cat);
    }

    @GetMapping("/getPage")
    public ResponseEntity productList(){
        return service.list(1);
    }

}
