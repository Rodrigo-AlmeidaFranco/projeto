package com.usjtECommerce.USJT.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.usjtECommerce.USJT.connection.ConnectionFactory;
import com.usjtECommerce.USJT.model.Cliente;
import com.usjtECommerce.USJT.model.Produtos;

public class PerfilDAO {
private Connection connection;
	
	public void DAO() throws SQLException{
 		this.connection = ConnectionFactory.obterConexao();
	}
	
	public void EditarPerfil(Cliente cliente, Integer id) throws SQLException {
		PreparedStatement stmt = this.connection.prepareStatement("UPDATE Cliente SET nome = ?,telefone= ?, email= ? , endereco = ?, cidade = ? Where cod_usuario = ?");
		stmt.setString(1, cliente.getNome());
		stmt.setString(2, cliente.getTelefone());
		stmt.setString(3, cliente.getEmail());
		stmt.setString(4, cliente.getEndereco());
		stmt.setString(5, cliente.getCidade());
		stmt.setInt(6, id);
		stmt.execute();
 		stmt.close();
	}
	
	public Cliente getPerfil(Integer id) throws SQLException {
		String sqlSelect = "SELECT * FROM Cliente Where cod_usuario = ? ";
		Connection conn = ConnectionFactory.obterConexao();
		PreparedStatement stm = conn.prepareStatement(sqlSelect);
		stm.setInt(1, id);
		ResultSet rs = stm.executeQuery();
		Cliente perfil =  null;
		while (rs.next()) {
			perfil = new Cliente();
			perfil.setNome(rs.getString(3));
			perfil.setTelefone(rs.getString(5));
			perfil.setEmail(rs.getString(7));
			perfil.setEndereco(rs.getString(6));
			perfil.setCidade(rs.getString(10));
			perfil.setUf(rs.getString(11));
			
			return perfil;
		}
		
		return perfil;
	}
}
