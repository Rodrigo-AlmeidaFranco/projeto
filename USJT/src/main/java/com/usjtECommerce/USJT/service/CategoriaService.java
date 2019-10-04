package com.usjtECommerce.USJT.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usjtECommerce.USJT.model.Categoria;
import com.usjtECommerce.USJT.repository.CategoriaRepo;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepo repo;
	
	public List<Categoria> findAll() {
		return repo.findAll();
	}
	
	public void delete(Long id) {
		 repo.deleteById(id);
	}
	
	public void save(Categoria categoria) {
		repo.save(categoria);
	}
}
