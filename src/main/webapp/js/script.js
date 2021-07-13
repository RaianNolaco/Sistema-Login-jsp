function validarCampo(){
	
	//Verificando se os campos de senha e usuario possuem alguma informação
	if(document.formLogin.txtUsuario.value == "" || document.formLogin.txtSenha.value == ""){
		
		alert("Usuario e/ou senha não informados");
		return false;
		
	};
	
	document.formLogin.submit();
	
}