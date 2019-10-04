package com.usjtECommerce.USJT.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.usjtECommerce.USJT.model.Categoria;
import com.usjtECommerce.USJT.service.CategoriaService;


@Controller
public class CategoriaDAO {
	@Autowired
	private CategoriaService service;
	

	public void deletarCategoria(Long id) {
		service.delete(id);
	}
	
	public void cadastrarCategoria(Categoria categoria) {
		service.save(categoria);
	}
	
	public List<Categoria> listarCategorias() {
		List<Categoria> categorias = service.findAll();
		return categorias;
	}
}
