package com.cursospring.CursoSpringNelio.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursospring.CursoSpringNelio.entities.Product;
import com.cursospring.CursoSpringNelio.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional <Product> obj= repository.findById(id);
		return obj.get();
	}
	

}
