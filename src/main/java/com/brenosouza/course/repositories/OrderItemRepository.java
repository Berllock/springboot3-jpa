package com.brenosouza.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brenosouza.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
