package com.example.ktgk.repository;

import com.example.ktgk.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

// Rename to ProductRepository
public interface ProductRepository extends JpaRepository<Product, Long> {
}