package com.usjtECommerce.USJT.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.usjtECommerce.USJT.model.Pedido;
import com.usjtECommerce.USJT.model.Produtos;
import com.usjtECommerce.USJT.repository.PedidoRepo;
import com.usjtECommerce.USJT.repository.ProdutosRepo;

public class ProdutosDAO {
	@Autowired
	private ProdutosRepo repo;
	
	public List listarCompras() {
		List<Produtos> produtos = repo.findAll();
		return produtos;
	}
	
	public Produtos detalheCompra(Long id ) {
		Produtos produtos = repo.getOne(id);
		return produtos;
	}
	
	public void deletarCompra(Long id) {
		repo.deleteById(id);
	}
	
	public void cadastrarCompra(Produtos produtos) {
		repo.save(produtos);
	}
	
	
}
