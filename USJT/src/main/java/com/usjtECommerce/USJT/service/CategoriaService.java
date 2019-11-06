package com.usjtECommerce.USJT.service;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.usjtECommerce.USJT.DAO.CategoriaDAO;
import com.usjtECommerce.USJT.model.Categoria;

@Service
public class CategoriaService {
	
	CategoriaDAO dao = new CategoriaDAO();
	
	public ArrayList<Categoria> listarCategoria() throws SQLException{
		return dao.listarCategoria();
	}
	
}
