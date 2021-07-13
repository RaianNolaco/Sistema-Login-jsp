package br.com.SistemaLogin.exception;
import javax.servlet.ServletException;

public class InvalidUserException extends ServletException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidUserException(String message){
		super(message);
		
	}

}
