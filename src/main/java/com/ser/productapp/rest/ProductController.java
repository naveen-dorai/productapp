package com.ser.productapp.rest;

import com.ser.productapp.entity.Product;
import com.ser.productapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;
        @PostMapping("/createProduct")
    public void createProduct(@RequestBody Product product){
        System.out.println("Inside createProduct()...");
        productService.createProduct(product);
    }

    @GetMapping("/getProduct/{productId}")
    public Product getProductById(@PathVariable Long productId){
        System.out.println("Inside getProductById()...");
        Product product = productService.getProductById(productId);
        return product;
    }

    @DeleteMapping("/deleteProduct/{productId}")
    public void deleteProduct(@PathVariable Long productId){
        System.out.println("Inside deleteProduct()...");
        productService.deleteProduct(productId);

    }

    @GetMapping("/getAllProducts")
    public List<Product> getAllProducts(){
        System.out.println("Inside getAllProducts");
        List<Product> productList = productService.getAllProducts();
        return productList;
    }
}
