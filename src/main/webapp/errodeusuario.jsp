<!-- Declara que aqui é uma pagina de erro -->>
<%@ page isErrorPage="true"%>
<%@ page import="java.util.Enumeration"%>


<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Erro de login</title>

<style type="text/css">
	
	body {
		backgroud-color:#fff;
	}
	#cabecalho{
		backgroud-color:#ffff;
		width:100px;
		height:100px;
	}
	
	#corpo{
		backgroud-color:#ffff;
		width:800px;
		height:4500px;
	}
	#rodape{
		backgroud-color:#ffff;
		width:100px;
		height:100px;
	}
		
</style>

</head>
<body>



	<div align="center">
		<h2>ERRO AO LOGAR, USUARIO OU SENHAS INVALIDOS!!!</h2>

		<div id="cabecalho">cabecalho</div>

		<div id="corpo">

			<img src="Imagens/img_erro.png" width="250px" /> <br /> Error:

			<!-- Aqui é chamado as mensagens de erro -->>
			<%=exception.getMessage()%>
			<hr /> Exceção ocorrida:
			<%=exception.getClass()%>


			<hr /> <a href="login.jsp">Tentar Novamente</a>

		</div>

		<div id="rodape">rodape</div>


	</div>

</body>
</html>