package com.marektech.productservice.controller;

import com.marektech.productservice.dto.ProductRequest;
import com.marektech.productservice.dto.ProductResponse;
import com.marektech.productservice.model.Product;
import com.marektech.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest) {
        productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus
    public List<ProductResponse> getAllProducts() {
        return productService.getAllProducts();
    }
}
