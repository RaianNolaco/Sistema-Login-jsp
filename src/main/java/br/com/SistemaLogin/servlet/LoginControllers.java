package br.com.SistemaLogin.servlet;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.SistemaLogin.exception.InvalidUserException;
import br.com.SistemaLogin.exception.InvalidUserExeption;

/**
 * Servlet implementation class LoginControllers
 */
@WebServlet("/login")
public class LoginControllers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginControllers() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		processRequest(request, response);	
		
	}

	private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		validaDadosRecebidos(req);  
		
		//criando uma conexão com com a tela para onde os dados vão
		RequestDispatcher rd = req.getRequestDispatcher("logado.jsp");
		rd.forward(req, resp);
		
	}

	
	private void validaDadosRecebidos(HttpServletRequest req) throws ServletException {
		
		
			/* aqui estou pegando os valores que estão nas caixas 
			   de texto da tela de login*/ 
			String nomeUsuario = req.getParameter("txtUsuario");
			String senhaUsuario = req.getParameter("txtSenha");
			
			
			// o .equals e a forma de dizer igual dentro do java
			//.trim() ignora os espaços
			 if(!nomeUsuario.trim().equals("hugo") || !senhaUsuario.trim().equals("123")) 	
				
				throw new InvalidUserException("Usuario ou senha incorreto, tente novamente!!");
				
				HttpSession session = req.getSession(); 
				session.setAttribute("usuarioautenticado", nomeUsuario);
				
			
			 
			 
		
	}

}
