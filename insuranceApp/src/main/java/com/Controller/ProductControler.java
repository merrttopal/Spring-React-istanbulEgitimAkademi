package com.Controller;


import com.configs.ResourceNotFoundException;
import com.entities.Product;
import com.entities.ProductImage;
import com.repositories.ProductImageRepository;
import com.service.ImageService;
import com.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.IOException;
import java.sql.SQLException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductControler {

    final ProductService productService;
    final ImageService imageService;
    final ProductImageRepository imageRepository;
    Long pid = 0l;

    @GetMapping("/getPage")
    public ResponseEntity productList(){
        return productService.list(1);
    }

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody @Valid   Product product){
        return productService.save(product);
    }

    @PostMapping("/update")
    public ResponseEntity update(@RequestBody @Valid Product product) throws ResourceNotFoundException {
        return productService.updateProduct(product);
    }

    @GetMapping("/drop/{pid}")
    public ResponseEntity drop( Product product){
        return productService.drop(product);
    }

    @PostMapping("/imageAdd")
    public ProductImage imageAdd(@RequestParam("image") MultipartFile file) throws IOException, SQLException {
        ProductImage productImage = new ProductImage();
        productImage.setPid(this.pid);
        byte[] fileBytes = file.getBytes();
        productImage.setImage(fileBytes);
        return imageService.addImage(productImage);
    }

    @ResponseBody
    @GetMapping (value = "/getImage/{index}", produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] getImage( @PathVariable int index ) throws IOException, SQLException {
        return imageRepository.getImageBy(Long.valueOf(index));
    }

}
