package com.cursospring.CursoSpringNelio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cursospring.CursoSpringNelio.entities.Category;

@Repository // opcional anotation
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
