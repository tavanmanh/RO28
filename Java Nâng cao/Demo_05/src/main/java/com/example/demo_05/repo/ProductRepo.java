package com.example.demo_05.repo;

import com.example.demo_05.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
}
