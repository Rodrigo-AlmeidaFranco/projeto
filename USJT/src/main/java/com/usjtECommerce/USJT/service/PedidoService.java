package com.usjtECommerce.USJT.service;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.usjtECommerce.USJT.DAO.PedidoDAO;
import com.usjtECommerce.USJT.model.Pedido;
import com.usjtECommerce.USJT.model.Produtos;
import com.usjtECommerce.USJT.model.Usuario;

@Service
public class PedidoService {
	PedidoDAO dao = new PedidoDAO();
	
	public ArrayList<Pedido>ListaPedido(Integer id) throws SQLException{
		return dao.listarPedido(id);
	}
	
	public ArrayList<Pedido>ListaPedidoConfirmado(Integer id) throws SQLException{
		return dao.listarPedidoConfirmado(id);
	}
	
	public void SalvarPedido(Usuario user, Produtos prod) throws SQLException {
		 dao.salvarPedido(prod, user);
	}
}
