package com.usjtECommerce.USJT.service;

import java.sql.SQLException;

import com.usjtECommerce.USJT.DAO.UsuarioDAO;
import com.usjtECommerce.USJT.model.Usuario;

public class LoginService {
	
	UsuarioDAO dao = new UsuarioDAO();
	public boolean verificarLogin(Usuario usuario) throws SQLException {
		return dao.fazerLogin(usuario);
	}
	
	public Usuario sessao(Usuario usuario) throws SQLException {
		return dao.sessaoUsuario(usuario);
	}
	
}
