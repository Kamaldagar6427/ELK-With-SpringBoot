package com.connect.elastic.search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.connect.elastic.search.entity.Product;
import com.connect.elastic.search.service.ProductService;

@RestController
@RequestMapping("/apis")
public class ProductController {

    @Autowired
    private ProductService  productService;
    @GetMapping("/findAll")
    public Iterable<Product> findAll(){
       return productService.getProducts();

    }

    @PostMapping("/insert")
    public Product insertProduct(@RequestBody  Product product){
       return productService.insertProduct(product);
    }

}
