package br.com.SistemaLogin.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class CriarConexao {
	
	public static Connection getConexao() throws SQLException{
		
		try {
			
			/*ultizando driver do tipo "jdbc"
			Driver esse que faz a conexão do banco com o java*/
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("conectado");
			
			
			//driver de conexão:Banco de conexão://Local do banco/nome do banco,        user,   senha  
			return DriverManager.getConnection("jdbc:mysql://localhost/SistemaLogin");
			
		} catch (SQLException e) {

			throw new SQLException(e);
			
		} catch (ClassNotFoundException e1) {

			throw new SQLException(e1);
			
		}
		
	}

}
