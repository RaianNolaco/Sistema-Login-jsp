package br.com.SistemaLogin.conexao;

import java.sql.DriverManager;

public class CriarConexao {
	
	public static connection getConexao() throws SQLExeption{
		
		try {
			
			/*ultizando driver do tipo "jdbc"
			Driver esse que faz a conexão do banco com o java*/
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("conectado");
			
			
			//driver de conexão:Banco de conexão://Local do banco/nome do banco,        user,   senha  
			return DriverManager.getConnection("jdbc:mysql://localhost/SistemaLogin","root","testermn");
			
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
		}
		
	}

}
