package com.Controller;


import com.entities.Product;
import com.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductControler {

    final ProductService productService;


    @GetMapping("/getPage")
    public ResponseEntity productList(){
        return productService.list(1);
    }

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody Product product){
        return productService.save(product);
    }



}
