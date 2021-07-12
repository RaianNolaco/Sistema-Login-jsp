package br.com.SistemaLogin.conexao;

import java.sql.Connection;
import java.sql.SQLException;

public class main {

	public static void main(String[] args) throws SQLException {

		Connection con = CriarConexao.getConexao();

	}

}
