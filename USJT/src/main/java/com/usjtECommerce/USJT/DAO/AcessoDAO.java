package com.usjtECommerce.USJT.DAO;

import org.springframework.beans.factory.annotation.Autowired;

import com.usjtECommerce.USJT.model.Acesso;
import com.usjtECommerce.USJT.repository.AcessoRepo;

public class AcessoDAO {
	@Autowired
	private AcessoRepo repo;
	

	public void deletarDeletar(Long id) {
		repo.deleteById(id);
	}
	
	public void cadastrarAcesso(Acesso acesso) {
		repo.save(acesso);
	}
	
	
}
