package com.works.restController;

import com.works.entities.Product;
import com.works.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    @PostMapping("/save")
    public ResponseEntity save(@Valid @RequestBody Product product) {

        return productService.save(product);
    }

    @GetMapping("/list")
    public ResponseEntity list() {
        return productService.list();
    }
}
