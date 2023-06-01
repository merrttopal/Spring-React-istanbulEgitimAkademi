package com.works.restControllers;

import com.works.entities.Product;
import com.works.repositories.ProductRepository;
import com.works.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductRestController {

    private final ProductService productService;

    @PostMapping("/save")
    public Product save(@RequestBody /*de serialization*/ Product product){
        return productService.save(product);
    }

    @GetMapping("/list")
    public List<Product> list (){
       return productService.productList();
    }

    @GetMapping("/deleteProduct/{pid}")
    public boolean delete(@PathVariable Long pid){
        return productService.deleteProduct(pid);
    }
    @PostMapping("/update")
    public Product update(@RequestBody Product product){
        return productService.update(product);
    }


}
