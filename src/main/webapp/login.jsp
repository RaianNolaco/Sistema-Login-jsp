<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Sistema Login</title>

</head>
<body>

	<form action="login" method="post" name="formLogin">

		<div align="center">

			<table cellpadding="10">

				<tr>

					<td>Usuario:</td>
					<td><input type="text" name="txtUsuario" /></td>

				</tr>

				<tr>

					<td>Senha:</td>
					<td><input type="password" name="txtSenha" /></td>

				</tr>

				<tr>


					<td colspan="2" align="center"><input type="button"
						value="Logar" onclick="validarCampo()" /></td>

				</tr>

			</table>


		</div>

	</form>


	<script src="js/script.js"></script>

	
</body>
</html>