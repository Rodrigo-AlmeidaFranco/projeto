package com.usjtECommerce.USJT.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.usjtECommerce.USJT.model.Categoria;
import com.usjtECommerce.USJT.repository.CategoriaRepo;


public class CategoriaDAO {
	@Autowired
	private CategoriaRepo repo;
	

	public void deletarCategoria(Long id) {
		repo.deleteById(id);
	}
	
	public void cadastrarCategoria(Categoria categoria) {
		repo.save(categoria);
	}
	
	public List listarCategorias() {
		List<Categoria> categorias = repo.findAll();
		return categorias;
	}
}
