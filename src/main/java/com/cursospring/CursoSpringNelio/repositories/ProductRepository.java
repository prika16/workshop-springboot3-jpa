package com.cursospring.CursoSpringNelio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cursospring.CursoSpringNelio.entities.Product;

@Repository // opcional anotation
public interface ProductRepository extends JpaRepository<Product, Long>{

}
