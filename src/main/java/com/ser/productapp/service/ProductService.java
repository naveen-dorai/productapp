package com.ser.productapp.service;

import com.ser.productapp.entity.Product;
import com.ser.productapp.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;


    public void createProduct(Product product) {
        productRepo.save(product);

    }

    public Product getProductById(Long productId) {
        Optional<Product> productOptional = productRepo.findById(productId);
        Product product = null;
        if(productOptional.isPresent()){
            product = productOptional.get();
        }
        return product;
    }

    public void deleteProduct(Long productId) {
        productRepo.deleteById(productId);
    }

    public List<Product> getAllProducts(){
        List<Product> productList = productRepo.findAll();
        return productList;
    }
}
