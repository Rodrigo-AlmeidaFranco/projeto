package com.usjtECommerce.USJT.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.usjtECommerce.USJT.connection.ConnectionFactory;
import com.usjtECommerce.USJT.model.Produtos;
import com.usjtECommerce.USJT.model.Usuario;

import java.util.ArrayList;


public class ProdutoDAO {
private Connection connection;
	
	public void DAO() throws SQLException{
 		this.connection = ConnectionFactory.obterConexao();
	}
	
	public void criarProduto(Produtos produto, Usuario user) throws SQLException {
		String sqlCreate = ("INSERT INTO produtos (codigo,cod_usuario,produto,precoC,precoV,cod_fornecedor,cod_categoria) VALUES(?,?,?,?,?,?,?)");
		Connection conn = ConnectionFactory.obterConexao();
        PreparedStatement stmt = conn.prepareStatement(sqlCreate);
		stmt.setInt(1, 0);
		stmt.setInt(2, user.getId_usuario());
		stmt.setString(3, produto.getNome());
		stmt.setDouble(4, 0);
		stmt.setDouble(5, produto.getPrecoVenda());
		stmt.setInt(6, 1);
		stmt.setInt(7, 4);
		
		stmt.execute();
 		stmt.close();
	}
	
	public void Delete(Produtos produto) throws SQLException{
		PreparedStatement stmt = this.connection.prepareStatement("DELETE FROM produtos WHERE codigo = ?");
		stmt.setInt(1, produto.getId_produto());
		
		stmt.execute();
 		stmt.close();
	}
	
	public ArrayList<Produtos> listarProdutos() throws SQLException {
		Produtos produto;
		ArrayList<Produtos> lista = new ArrayList<>();
		String sqlSelect = "SELECT codigo,cod_usuario,produto,precoC,precoV,img,cod_fornecedor,cod_categoria from Produtos";
		// usando o try with resources do Java 7, que fecha o que abriu
		Connection conn = ConnectionFactory.obterConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);
			ResultSet rs = stm.executeQuery();
				while (rs.next()) {
					produto = new Produtos();
					produto.setId_produto(rs.getInt(1));
					produto.setCodUser(rs.getInt(2));
					produto.setNome(rs.getString(3));
					produto.setPrecoCompra(rs.getDouble(4));
					produto.setPrecoVenda(rs.getDouble(5));
					produto.setImg(rs.getString(6));
					produto.setCodFornecedor(rs.getInt(7));
					produto.setCodCategoria(rs.getInt(8));
					
					lista.add(produto);
				}
	
		return lista;
	}
	
	public ArrayList<Produtos> listarProdutos(String nome) throws SQLException {
		Produtos produto;
		ArrayList<Produtos> lista = new ArrayList<>();
		String sqlSelect = "SELECT codigo,cod_usuario,produto,precoC,precoV,cod_fornecedor,cod_categoria from Produtos WHERE produto like";
		// usando o try with resources do Java 7, que fecha o que abriu
		Connection conn = ConnectionFactory.obterConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);
				stm.setString(1, nome);
			ResultSet rs = stm.executeQuery();
				while (rs.next()) {
					produto = new Produtos();
					produto.setId_produto(rs.getInt(1));
					produto.setCodUser(rs.getInt(2));
					produto.setNome(rs.getString(3));
					produto.setPrecoCompra(rs.getDouble(4));
					produto.setPrecoVenda(rs.getDouble(5));
					produto.setCodFornecedor(rs.getInt(6));
					produto.setCodCategoria(rs.getInt(7));
					
					lista.add(produto);
				}

		return lista;
	}
	
	public Produtos produtoDetalhe(Integer id ) throws SQLException {
		Produtos produto = null;
		String sqlSelect = "SELECT * FROM produtos Where codigo = ?";
		Connection conn = ConnectionFactory.obterConexao();
		PreparedStatement stm = conn.prepareStatement(sqlSelect);
		stm.setInt(1, id);
		ResultSet rs = stm.executeQuery();
		
		if (rs.next()) {
			produto = new Produtos();
			produto.setId_produto(rs.getInt(1));
			produto.setCodUser(rs.getInt(2));
			produto.setNome(rs.getString(3));
			produto.setPrecoCompra(rs.getDouble(4));
			produto.setPrecoVenda(rs.getDouble(5));
			produto.setImg(rs.getString(6));
			produto.setCodFornecedor(rs.getInt(7));
			produto.setCodCategoria(rs.getInt(8));
			
		}
		
		return produto;
	}
	
	
}
