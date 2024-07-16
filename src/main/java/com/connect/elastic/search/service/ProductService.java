package com.connect.elastic.search.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.connect.elastic.search.entity.Product;
import com.connect.elastic.search.repository.ProductRepository;


@Service
public class ProductService {

    @Autowired
    private ProductRepository  productRepository;

    public Iterable<Product> getProducts() {
     return productRepository.findAll();
    }

    public Product insertProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Product product, int id) {
        Product product1  = productRepository.findById(id).get();
        product1.setPrice(product.getPrice());
        return product1;
    }

    public void deleteProduct(int id ) {
        productRepository.deleteById(id);
    }
}