package com.works.restControllers;

import com.works.entities.Product;
import com.works.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {
    final ProductService service;

    @PostMapping("/save")
    public Product save(@RequestBody Product product){
        return service.save(product);
    }

    @GetMapping("/list")
    public List<Product> list(){
        return service.list();
    }
}
