package com.usjtECommerce.USJT.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.usjtECommerce.USJT.DAO.ProdutoDAO;
import com.usjtECommerce.USJT.model.Produtos;

public class ProdutoService {
	ProdutoDAO dao = new ProdutoDAO();
	
	public ArrayList<Produtos> listarProduto() throws SQLException{
		return dao.listarProdutos();
	}
	
	public ArrayList<Produtos> listarProduto(String produto) throws SQLException{
		return dao.listarProdutos(produto);
	}
	
	public Produtos detalhe(Integer id) throws SQLException {
		return dao.produtoDetalhe(id);
	}
	
}
