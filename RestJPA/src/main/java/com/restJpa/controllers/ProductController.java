package com.restJpa.controllers;

import com.restJpa.entities.Product;
import com.restJpa.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {

    final ProductService productService;

    @PostMapping("/save")
    public Product save(@RequestBody Product product){
       return productService.save(product);
    }

    @GetMapping("/list")
    public ResponseEntity productList(){
        return productService.list();
    }


    @GetMapping("/list/{cid}")
    public ResponseEntity productList(@PathVariable Long cid){
        return productService.listCat(cid);
    }

    @GetMapping("/listPage/{cid}")
    public ResponseEntity productList(@PathVariable Long cid ,@RequestParam(defaultValue = "0") int page){
        return productService.listCatPage(cid,page);
    }

}
