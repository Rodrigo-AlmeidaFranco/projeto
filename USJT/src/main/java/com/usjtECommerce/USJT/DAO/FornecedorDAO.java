package com.usjtECommerce.USJT.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.usjtECommerce.USJT.model.Fornecedor;
import com.usjtECommerce.USJT.repository.FornecedorRepo;

public class FornecedorDAO {
	@Autowired
	private FornecedorRepo repo;
	
	public List listar() {
		List<Fornecedor> fornecedor = repo.findAll();
		return fornecedor;
	}
	
	public Fornecedor detalhe(Long id ) {
		Fornecedor fornecedor = repo.getOne(id);
		return fornecedor;
	}
	
	public void deletar(Long id) {
		repo.deleteById(id);
	}
	
	public void cadastrar(Fornecedor fornecedor) {
		repo.save(fornecedor);
	}
	
	
}
