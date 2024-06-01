package com.ser.productapp.repo;

import com.ser.productapp.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Long> {

}
