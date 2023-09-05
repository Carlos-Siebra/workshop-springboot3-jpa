package com.estudante.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudante.curso.entities.Order;
import com.estudante.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
