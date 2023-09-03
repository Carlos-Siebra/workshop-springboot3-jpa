package com.estudante.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudante.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
