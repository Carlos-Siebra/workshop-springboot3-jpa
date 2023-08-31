package com.estudante.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudante.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
