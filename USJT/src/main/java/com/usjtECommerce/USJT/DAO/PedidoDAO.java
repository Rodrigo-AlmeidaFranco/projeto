package com.usjtECommerce.USJT.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.time.*;

import com.usjtECommerce.USJT.connection.ConnectionFactory;
import com.usjtECommerce.USJT.model.Categoria;
import com.usjtECommerce.USJT.model.Pedido;
import com.usjtECommerce.USJT.model.Produtos;
import com.usjtECommerce.USJT.model.Usuario;

public class PedidoDAO {
	
	public ArrayList<Pedido> listarPedido(Integer id) throws SQLException {
		Pedido ped;
		ArrayList<Pedido> lista = new ArrayList<>();
		String sqlSelect = " SELECT DISTINCT PRODUTOS.img, PRODUTOS.produto, PRODUTOS.precoV, pedido.codigo FROM pedido as pedido\r\n" + 
				"				        INNER JOIN produtos AS PRODUTOS ON produtos.codigo = pedido.cod_produto \r\n" + 
				"				       WHERE pedido.cod_usuario = ? and pedido.statusPedido = ?";
		// usando o try with resources do Java 7, que fecha o que abriu
		Connection conn = ConnectionFactory.obterConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);
				stm.setInt(1, id);
				stm.setInt(2, 0);
			ResultSet rs = stm.executeQuery();
				while (rs.next()) {
					ped = new Pedido();
					ped.setImg(rs.getString(1));
					ped.setNome(rs.getString(2));
					ped.setPrecoVenda(rs.getDouble(3));
					ped.setId(rs.getInt(4));
					lista.add(ped);
				}
		return lista;
	}
	
	public ArrayList<Pedido> listarPedidoConfirmado(Integer id) throws SQLException {
		Pedido ped;
		ArrayList<Pedido> lista = new ArrayList<>();
		String sqlSelect = "  SELECT DISTINCT  PRODUTOS.img, PRODUTOS.produto, PRODUTOS.precoV FROM pedido as pedido \r\n" + 
				"        INNER JOIN produtos AS PRODUTOS ON produtos.codigo = pedido.cod_produto \r\n" + 
				"        WHERE pedido.cod_usuario = ? and pedido.statusPedido = ?";
		// usando o try with resources do Java 7, que fecha o que abriu
		Connection conn = ConnectionFactory.obterConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);
				stm.setInt(1, id);
				stm.setInt(2, 1);
			ResultSet rs = stm.executeQuery();
				while (rs.next()) {
					ped = new Pedido();
					ped.setImg(rs.getString(1));
					ped.setNome(rs.getString(2));
					ped.setPrecoVenda(rs.getDouble(3));
					lista.add(ped);
				}
			
		return lista;
	}
	
	public void salvarPedido(Produtos prod,Usuario user) throws SQLException {
		String SqlInsert = "insert into pedido ( cod_usuario, cod_produto, data_pedido, precoC, precoV, statusPedido) Values (?,?,?,?,?,?)";
		
		Connection conn = ConnectionFactory.obterConexao();
		PreparedStatement stm = conn.prepareStatement(SqlInsert);
		stm.setInt(1, user.getId_usuario() );
		stm.setInt(2, prod.getId_produto());
		stm.setString(3,prod.getNome());
		stm.setDouble(4, prod.getPrecoCompra());
		stm.setDouble(5, prod.getPrecoVenda());
		stm.setInt(6, 0);
		
		stm.execute();
	}
}
