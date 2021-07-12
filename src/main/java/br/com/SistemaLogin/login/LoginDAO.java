/*Classes DAO são responsáveis por trocar informações com o SGBD e fornecer operações CRUD e de pesquisas, 
 * elas devem ser capazes de buscar dados no banco e transformar esses em objetos ou lista de objetos,
 *  fazendo uso de listas genéricas (BOX 3), também deverão receber os objetos, 
 *  converter em instruções SQL e mandar para o banco de dados.
 *  
 *  Fonte: https://www.devmedia.com.br/dao-pattern-persistencia-de-dados-utilizando-o-padrao-dao/30999#:~:text=Classes%20DAO%20são%20responsáveis%20por,em%20instruções%20SQL%20e%20mandar
 *  */

package br.com.SistemaLogin.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LoginDAO {

	//Connection colocado na variavel con
	private Connection con;

	//metodo construtos dizendo que LoginDAO recebe a variavel de conexão con
	public LoginDAO(Connection con) {

		this.con = con;

	}

	
	//função de adicionar um novo usuario 
	public void adicionar(Login l) throws SQLException{
		
		// variavel sql recebe e comando para executar no banco de dados 
		String sql = "INSERT INTO login (nome_usuario,senha_usuario) values (?,?)";
	

		try{

			/*essa viavel prepara o comando sql para ser execultado dentro do banco
			ja preparando a conexão*/ 
			PreparedStatement stmt = con.prepareStatement(sql);
			
			//aqui colocamos os parametros que irão ser colocanos no lugar dos "? ?" da variavel Sql
			stmt.setString(1, l.getNome_usuario());
			stmt.setString(2, l.getSenha_usuario());
			
			//aqui execultamos tudo feito anteriormente e depois fechamos a conexão do stmt
			stmt.execute();
			stmt.close();

		//tratamento de erros 	
		}catch(SQLException e)
		{

			e.printStackTrace();

		}finally{
		    // aqui a conexão com o banco de varivel con
			con.close();
		
		}
	
	}

}
