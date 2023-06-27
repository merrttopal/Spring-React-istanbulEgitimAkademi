package com.restJpa.controllers;

import com.restJpa.models.Product;
import com.restJpa.service.DummyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/dummy")
public class DummyRestController {
    final DummyService dummyService;

    @GetMapping("/allProduct")
    public Object allProduct(){
       return dummyService.getAllProduct();
    }


    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return dummyService.addProduct(product);
    }
}
