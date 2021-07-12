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
		
		l.setNome_usuario("Raian");
		l.setSenha_usuario("123");
		
		LoginDAO dao = new LoginDAO(con);
		dao.adicionar(l);
	}

}