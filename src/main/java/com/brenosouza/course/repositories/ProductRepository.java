package com.brenosouza.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brenosouza.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
