package com.usjtECommerce.USJT.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
	//singleton da conexÃ£o - thread safe
		private static final ThreadLocal<Connection> conn = new ThreadLocal<>();
		
		static {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				throw new RuntimeException(e);
			}
		}

		// ObtÃ©m conexÃ£o com o banco de dados
		public static Connection obterConexao() throws SQLException {
			if (conn.get() == null){
				conn.set(DriverManager
						.getConnection("jdbc:mysql://localhost/ElHasan?user=root&password=123456&useTimezone=true&serverTimezone=UTC&autoReconnect=true"));
			}
			return conn.get();
		}
		//Fecha a conexÃ£o - usado no servlet destroy
		public static void fecharConexao() throws SQLException {
			if(conn.get() != null){
				conn.get().close();
				conn.set(null);
			}
		}
	

}
