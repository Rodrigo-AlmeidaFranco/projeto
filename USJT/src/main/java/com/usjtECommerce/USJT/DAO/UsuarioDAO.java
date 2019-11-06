package com.usjtECommerce.USJT.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.usjtECommerce.USJT.connection.ConnectionFactory;
import com.usjtECommerce.USJT.model.Usuario;




public class UsuarioDAO {
	
	private Connection connection;
	

	public void adicionarUsuario(Usuario usuario) throws SQLException{
		String sqlSelect = "INSERT INTO usuario (codigo,cod_direito,login,senha,nome) VALUES (?,?,?,?,?)";
		Connection conn = ConnectionFactory.obterConexao();
		PreparedStatement stmt = conn.prepareStatement(sqlSelect);
		stmt.setInt(1, usuario.getId_usuario());
		stmt.setInt(2, usuario.getDireito());
		stmt.setString(3, usuario.getLogin());
		stmt.setString(4, usuario.getSenha());
		stmt.setString(5, usuario.getNome());
		
		ResultSet rs = stmt.executeQuery();
		stmt.execute();
 		stmt.close();
	}
	
	public void Delete(Usuario usuario) throws SQLException{
		PreparedStatement stmt = this.connection.prepareStatement("DELETE FROM usuario WHERE codigo = ?");
		stmt.setInt(1, usuario.getId_usuario());
		
		stmt.execute();
 		stmt.close();
	}
	
	public Boolean fazerLogin(Usuario user) throws SQLException{
		
		String sqlSelect = "SELECT * FROM usuario WHERE login = ? and senha = ?";
		// pega a conexÃ£o em um try normal para que ela nÃ£o seja fechada

			Connection conn = ConnectionFactory.obterConexao();
			// usando o try with resources do Java 7, que fecha o que abriu
		PreparedStatement stm = conn.prepareStatement(sqlSelect);
				stm.setString(1, user.getLogin());
				stm.setString(2, user.getSenha());
				ResultSet rs = stm.executeQuery();
					if (rs.next()) {
						System.out.println("ok ok ok ");
						return true;
					} else {
						return false;
					}

	}
	
	public Usuario sessaoUsuario(Usuario user) throws SQLException {
		String sqlSelect = "SELECT * FROM usuario WHERE login = ? and senha = ?";
		
		Connection conn = ConnectionFactory.obterConexao();
		PreparedStatement stm = conn.prepareStatement(sqlSelect);
		stm.setString(1, user.getLogin());
		stm.setString(2, user.getSenha());
		
		ResultSet rs = stm.executeQuery();
		
		if (rs.next()) {
			user =  new Usuario();
			user.setId_usuario(rs.getInt(1));
			user.setAcesso(rs.getInt(2));
			user.setLogin(rs.getString(3));
			user.setSenha(rs.getString(4));
			user.setNome(rs.getString(5));
			
			return user;
		}else {
			return null;
		}
	}
		
	
	
}
