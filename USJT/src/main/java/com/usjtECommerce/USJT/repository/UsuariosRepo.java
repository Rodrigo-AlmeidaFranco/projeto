package com.usjtECommerce.USJT.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usjtECommerce.USJT.model.Usuario;

public interface UsuariosRepo extends JpaRepository<Usuario, Long>{
	public Usuario findOneByLoginAndSenha (String login, String senha);
}
