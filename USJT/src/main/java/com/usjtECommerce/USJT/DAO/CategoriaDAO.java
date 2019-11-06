package com.usjtECommerce.USJT.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.usjtECommerce.USJT.connection.ConnectionFactory;
import com.usjtECommerce.USJT.model.Categoria;

public class CategoriaDAO {
	
	public ArrayList<Categoria> listarCategoria() throws SQLException {
		Categoria cat;
		ArrayList<Categoria> lista = new ArrayList<>();
		String sqlSelect = " SELECT codigo,categoria FROM categoria";
		// usando o try with resources do Java 7, que fecha o que abriu
		Connection conn = ConnectionFactory.obterConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);
			ResultSet rs = stm.executeQuery();
				while (rs.next()) {
					cat = new Categoria();
					cat.setId(rs.getLong(1));
					cat.setNome(rs.getString(2));
					
					lista.add(cat);
				}
	
		return lista;
	}
}
