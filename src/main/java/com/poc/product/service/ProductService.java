package com.poc.product.service;

import com.poc.product.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ProductService {
    public List<Product> getAllProducts();
    public Optional<Product> getProductById(Long id);
    public Product createProduct(Product product);
    public Product updateProduct(Long id, Product updatedProduct);
    public void deleteProduct(Long id);
}
