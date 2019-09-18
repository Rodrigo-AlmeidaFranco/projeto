package com.usjtECommerce.USJT.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.usjtECommerce.USJT.model.Compra;
import com.usjtECommerce.USJT.repository.ComprasRepo;

public class CompraDAO {
	@Autowired
	private ComprasRepo repo;
	
	public List listarCompras() {
		List<Compra> compras = repo.findAll();
		return compras;
	}
	
	public Compra detalheCompra(Long id ) {
		Compra compra = repo.getOne(id);
		return compra;
	}
	
	public void deletarCompra(Long id) {
		repo.deleteById(id);
	}
	
	public void cadastrarCompra(Compra compra) {
		repo.save(compra);
	}
	
	
}
