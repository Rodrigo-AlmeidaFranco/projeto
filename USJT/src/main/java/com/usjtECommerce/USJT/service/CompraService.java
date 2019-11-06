package com.usjtECommerce.USJT.service;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.usjtECommerce.USJT.DAO.ComprasDAO;
import com.usjtECommerce.USJT.model.Compra;
import com.usjtECommerce.USJT.model.Pedido;
import com.usjtECommerce.USJT.model.Usuario;


@Service
public class CompraService {
	ComprasDAO dao =  new ComprasDAO();
	
	public ArrayList<Compra> listaCompra(Integer id) throws SQLException{
		return dao.listarCompras(id);
	}
	
	
	public void comprar(Usuario cli, ArrayList<Pedido> produto) throws SQLException {
		dao.comprar(produto, cli);
	}
}
