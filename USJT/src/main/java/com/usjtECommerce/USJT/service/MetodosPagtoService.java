package com.usjtECommerce.USJT.service;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.usjtECommerce.USJT.DAO.MetodosPagtoDAO;
import com.usjtECommerce.USJT.model.MetodosPagto;

@Service
public class MetodosPagtoService {
	MetodosPagtoDAO dao = new MetodosPagtoDAO();
	
	public ArrayList<MetodosPagto> getMetodos(Integer id) throws SQLException{
		return dao.getMetodos(id);
	}
}
