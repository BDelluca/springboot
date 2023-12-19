package com.educando.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educando.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
  
}
