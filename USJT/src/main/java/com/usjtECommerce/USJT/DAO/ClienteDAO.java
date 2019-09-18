package com.usjtECommerce.USJT.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.usjtECommerce.USJT.model.Cliente;
import com.usjtECommerce.USJT.model.Compra;
import com.usjtECommerce.USJT.repository.ClienteRepo;
import com.usjtECommerce.USJT.repository.ComprasRepo;

public class ClienteDAO {
	@Autowired
	private ClienteRepo repo;
	
	public List listar() {
		List<Cliente> cliente = repo.findAll();
		return cliente;
	}
	
	public Cliente detalhe(Long id ) {
		Cliente cliente = repo.getOne(id);
		return cliente;
	}
	
	public void deletar(Long id) {
		repo.deleteById(id);
	}
	
	public void cadastrar(Cliente cliente) {
		repo.save(cliente);
	}
	
	
}
