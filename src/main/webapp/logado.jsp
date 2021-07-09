<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Logado</title>
</head>
<body>

	<h2>Login efetuado com sucesso!</h2>
	
	<% String nomeUsuario= (String) session.getAttribute("usuarioautenticado");
		
		if(nomeUsuario == null){
			
			throw new ServletException("nenhum usuario logado");
			
		}
	
	%>
	
	<p>Seja bem vindo <%=nomeUsuario%></p> | 
	<a href = "remover.jsp">sair</a>
	

</body>
</html>