package br.com.SistemaLogin.login;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.SistemaLogin.conexao.CriarConexao;

/**
 * Servlet implementation class CadastroLoginServlet
 */
@WebServlet("/CadastroLogin")
public class CadastroLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public CadastroLoginServlet() {
        super();
    }


	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}*/

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*Pega o valor que estiver no campo da pagina aonde o nome � txtUsuario e txtSenha
		e ira jogar em uma variavel chamada usuario e senha*/
		
		String usuario =  request.getParameter("txtUsuario");
		String senha   =  request.getParameter("txtSenha"); 
		
		Connection con;
		
		try {
		
			con = CriarConexao.getConexao();
			 Login l = new Login();
			 l.setNome_usuario(usuario);
			 l.setSenha_usuario(usuario);
			 
			 LoginDAO dao = new LoginDAO(con);
			 dao.adicionar(l);
			
		} catch (Exception e) {
			
			
		}finally {
			
		}
		
		
		doGet(request, response);
	}

}
