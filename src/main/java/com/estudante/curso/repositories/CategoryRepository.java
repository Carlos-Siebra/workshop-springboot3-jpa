package com.estudante.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudante.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
