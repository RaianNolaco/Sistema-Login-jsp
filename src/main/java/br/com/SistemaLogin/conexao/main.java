package br.com.SistemaLogin.conexao;

import java.sql.Connection;
import java.sql.SQLException;

public class main {

	// Aqui é aonde testamos a conexão com o banco de dados
	public static void main(String[] args) throws SQLException {

		Connection con = CriarConexao.getConexao();

	}

}
