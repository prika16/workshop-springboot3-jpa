package com.cursospring.CursoSpringNelio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursospring.CursoSpringNelio.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
