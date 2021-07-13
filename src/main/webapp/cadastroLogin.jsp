<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Usuário</title>
<script type="text/javascript" src="validarCampos.js">

</script>
</head>
<body>
 <h2>Cadastrar Login</h2>
 
  <form name="formLogin" action="CadastroLogin" method="post">
 
    <table>
     
     
      <tr> 
        <td>Nome.:</td><td><input type="text" name="txtUsuario"></td>
        <td>Senha.:</td><td><input type="password" name="txtSenha"></td>
     
          <td colspan="2"><input type="submit" value="Cadastrar"/></td>      
     </tr>
    
    
    </table>
    
     </form>
</body>
</html>