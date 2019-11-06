package com.usjtECommerce.USJT.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.usjtECommerce.USJT.DAO.PerfilDAO;
import com.usjtECommerce.USJT.model.Cliente;

@Service
public class ClienteService {
	PerfilDAO dao = new PerfilDAO();
	
	public Cliente findCliente(Integer id) throws SQLException {
		return dao.getPerfil(id);
	}
}
