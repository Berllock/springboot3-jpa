package com.brenosouza.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brenosouza.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
