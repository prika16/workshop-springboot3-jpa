package com.cursospring.CursoSpringNelio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cursospring.CursoSpringNelio.entities.Order;
import com.cursospring.CursoSpringNelio.entities.User;

@Repository // opcional anotation

public interface OrderRepository extends JpaRepository<Order, Long>{

}
