package com.usjtECommerce.USJT.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usjtECommerce.USJT.model.Produtos;
import com.usjtECommerce.USJT.repository.ProdutosRepo;

@Service
public class ProdutoService {
	@Autowired
	private ProdutosRepo repo;
	
	public List<Produtos> findAll() {
		return repo.findAll();
	}
	
	public void delete(Long id) {
		 repo.deleteById(id);
	}
	
	public void save(Produtos produto) {
		repo.save(produto);
	}
}
