package com.usjtECommerce.USJT.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.usjtECommerce.USJT.model.Pedido;
import com.usjtECommerce.USJT.repository.PedidoRepo;

public class PedidoDAO {
	@Autowired
	private PedidoRepo repo;
	
	public List listarCompras() {
		List<Pedido> pedido = repo.findAll();
		return pedido;
	}
	
	public Pedido detalheCompra(Long id ) {
		Pedido pedido = repo.getOne(id);
		return pedido;
	}
	
	public void deletarCompra(Long id) {
		repo.deleteById(id);
	}
	
	public void cadastrarCompra(Pedido pedido) {
		repo.save(pedido);
	}
	
	
}
