package com.Controller;


import com.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductControler {

    final ProductService productService;

    @GetMapping("/getPage")
    public ResponseEntity productList(){
        return productService.list(1);
    }




}
