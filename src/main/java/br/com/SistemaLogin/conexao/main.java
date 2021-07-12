package br.com.SistemaLogin.conexao;

import java.sql.SQLException;
import br.com.SistemaLogin.login.Login;
import br.com.SistemaLogin.login.LoginDAO;
import java.sql.Connection;

public class Main {

	// Aqui é aonde testamos a conexão com o banco de dados
	public static void main(String[] args) throws SQLException {

		Connection con = CriarConexao.getConexao();
		
		Login l  =  new Login();
			
		l.setNome_usuario("Will");
		l.setSenha_usuario("HIHI");
		
		LoginDAO dao = new LoginDAO(con);
		dao.adicionar(l);
	}

}