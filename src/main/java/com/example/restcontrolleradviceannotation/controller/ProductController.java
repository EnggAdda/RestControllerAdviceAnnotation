package com.example.restcontrolleradviceannotation.controller;

import com.example.restcontrolleradviceannotation.entity.Product;
import com.example.restcontrolleradviceannotation.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ProductController {

    @Autowired
    private ProductService  productService;
    @GetMapping("/products")
    List<Product>  getAllProducts(){
        return productService.getProducts();
    }

    @PostMapping("/insertProduct")
    Product insertProduct(@RequestBody Product product) throws NullPointerException{
       return productService.insertProduct(product);
    }


}
