package com.estudante.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudante.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
