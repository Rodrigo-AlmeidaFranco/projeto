package com.usjtECommerce.USJT.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.usjtECommerce.USJT.connection.ConnectionFactory;
import com.usjtECommerce.USJT.model.Compra;
import com.usjtECommerce.USJT.model.Pedido;
import com.usjtECommerce.USJT.model.Usuario;

public class ComprasDAO {
	
	public ArrayList<Compra> listarCompras(Integer id) throws SQLException {
		Compra compra;
		ArrayList<Compra> listaCompra =  new ArrayList<Compra>();
		String sqlSelect = "select distinct comp.codigo as id_compra, prod.codigo as id_produto, prod.produto as desc_produto, \r\n" + 
				"				 prod.precoV  from compra as comp \r\n" + 
				"				        inner join pedido as ped on ped.cod_usuario = comp.cod_usuario\r\n" + 
				"				        inner join produtos as prod on ped.cod_produto = prod.codigo\r\n" + 
				"				       where comp.cod_usuario = ?";
		Connection conn = ConnectionFactory.obterConexao();
		PreparedStatement stm = conn.prepareStatement(sqlSelect);
		stm.setInt(1, id);
		ResultSet rs = stm.executeQuery();
		while (rs.next()) {
			compra = new Compra();
			compra.setId_compra(rs.getInt(1));
			compra.setId_produto(rs.getInt(2));
			compra.setNome(rs.getString(3));
			compra.setPrecoVenda(rs.getDouble(4));
			
			if(listaCompra.size() > 5) {
				
			}else {
				listaCompra.add(compra);
			}
			
		}
		
		return listaCompra;
		
	}
	
	public void comprar(ArrayList<Pedido> pedidos, Usuario cli) throws SQLException {
		String sqlInsert = "insert into compra (codigo, cod_usuario,cod_pedido, data_compra,precoV, statusEntrega) Values  "
				+ "(0,?,?,?,?,?);";
		Connection conn = ConnectionFactory.obterConexao();
		PreparedStatement stm = conn.prepareStatement(sqlInsert);
		for(int x =0;x < pedidos.size(); x++) {
			stm.setInt(1, cli.getId_usuario());
			stm.setInt(2, pedidos.get(x).getId());
			stm.setString(3, "");
			stm.setDouble(4, pedidos.get(x).getPrecoVenda());
			stm.setInt(5,  0);
			
			stm.execute();
		}
		limpar(cli.getId_usuario());
	}
	
	public void limpar(Integer id) throws SQLException {
		String sqlInsert = " UPDATE pedido set statusPedido = 1 where cod_usuario = ?";
		Connection conn = ConnectionFactory.obterConexao();
		PreparedStatement stm = conn.prepareStatement(sqlInsert);
		stm.setInt(1, id);
		stm.execute();
	}
}
