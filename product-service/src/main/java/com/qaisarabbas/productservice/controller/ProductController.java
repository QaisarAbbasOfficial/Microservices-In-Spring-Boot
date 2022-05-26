package com.qaisarabbas.productservice.controller;

import com.qaisarabbas.productservice.model.Product;
import com.qaisarabbas.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductRepository productRepository;

    @GetMapping("api/products")
    public List<Product> getProduct(){
        return productRepository.findAll();
    }

    @PostMapping("api/products")
    public Product saveProduct(@RequestBody Product product){
        return productRepository.save(product);
    }
}
