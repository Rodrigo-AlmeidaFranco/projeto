package com.usjtECommerce.USJT.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usjtECommerce.USJT.model.Usuario;
import com.usjtECommerce.USJT.repository.UsuariosRepo;

@Service
public class LoginService {
	@Autowired
	UsuariosRepo usuarioRepo;

	public boolean logar(Usuario usuario) {
		return usuarioRepo.findOneByLoginAndSenha(usuario.getLogin(), usuario.getSenha()) != null;
	}
	
}
