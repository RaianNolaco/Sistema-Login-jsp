package br.com.SistemaLogin.exception;
import javax.servlet.ServletException;

public class InvalidUserExeption extends ServletException{
	
	public InvalidUserExeption(String message){
		super(message);
		
	}

}
