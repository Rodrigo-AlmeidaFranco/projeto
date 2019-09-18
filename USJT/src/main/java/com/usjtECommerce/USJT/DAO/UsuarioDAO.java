package com.usjtECommerce.USJT.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.usjtECommerce.USJT.model.Pedido;
import com.usjtECommerce.USJT.model.Produtos;
import com.usjtECommerce.USJT.model.Usuario;
import com.usjtECommerce.USJT.repository.PedidoRepo;
import com.usjtECommerce.USJT.repository.ProdutosRepo;
import com.usjtECommerce.USJT.repository.UsuariosRepo;

public class UsuarioDAO {
	@Autowired
	private UsuariosRepo repo;
	
	public List listarCompras() {
		List<Usuario> user = repo.findAll();
		return user;
	}
	
	public Usuario detalhe(Long id ) {
		Usuario user = repo.getOne(id);
		return user;
	}
	
	public void deletar(Long id) {
		repo.deleteById(id);
	}
	
	public void cadastrar(Usuario user) {
		repo.save(user);
	}
	
	
}
