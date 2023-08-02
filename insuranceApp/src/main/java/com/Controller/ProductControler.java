package com.Controller;


import com.configs.ResourceNotFoundException;
import com.entities.Product;
import com.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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
    public ResponseEntity save(@RequestBody @Valid Product product){
        return productService.save(product);
    }

    @PostMapping("/update")
    public ResponseEntity update(@RequestBody @Valid Product product) throws ResourceNotFoundException {
        return productService.updateProduct(product);
    }

}
