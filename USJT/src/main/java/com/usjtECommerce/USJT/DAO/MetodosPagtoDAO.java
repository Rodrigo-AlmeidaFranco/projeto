package com.usjtECommerce.USJT.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.usjtECommerce.USJT.connection.ConnectionFactory;
import com.usjtECommerce.USJT.model.MetodosPagto;

public class MetodosPagtoDAO {
	
	
	public ArrayList<MetodosPagto> getMetodos(Integer id) throws SQLException{
		MetodosPagto mPag = null;
		ArrayList<MetodosPagto> lista = new ArrayList<MetodosPagto>();
		String sqlSelect = " SELECT * FROM MetodosPagto WHERE cod_usuario = ?";
		Connection conn = ConnectionFactory.obterConexao();
		PreparedStatement stmt = conn.prepareStatement(sqlSelect);
		stmt.setInt(1, id);
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			mPag = new MetodosPagto();
			mPag.setCodigo(rs.getInt(1));
			mPag.setNomeMetodo(rs.getString(4));
			lista.add(mPag);
			
		}
		
		return lista;
	}
}
