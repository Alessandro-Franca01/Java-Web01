<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Usuario</title>
</head>
<body>
			<!-- 	Ate aqui esta FUNCIONANDO!!	   --> 
	<h1> Cadastrando usuario </h1>

	<!-- Criando formulario  -->
	<form action="Formulario.jsp">
	<!-- 	Essa pagina estar rodando normal inicialmente 	-->
	
	Nome:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp <input type="text" name="nome"><br><br>
	
	Login:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp <input type="text" name="login"><br><br>
	
	Sexo: &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
		<select name="sexo">
			<option>Masculino</option>
			<option>Feminino</option>
		</select><br><br>
	Senha:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp <input type="text" name="senha"><br><br>
	data de nascimento <input type="text" name="dataNasc"><br><br>
	<input type="submit" value="Enviar"> &nbsp&nbsp&nbsp <input type="button" name="btCancelar" value="Cancelar">
	
	</form>
	<!-- Pegando os cookies de Cookies.jsp e redirecionando a pagina caso os cookies exista -->
	<%
	// Verificar se esses cookies existe !
	//Cookie[] cookies = request.getCookies(); 
	
	String nome = request.getParameter("nome");
	String login = request.getParameter("login");
	String sexo = request.getParameter("sexo");
	String dataNasc = request.getParameter("dataNasc");
	String senha = request.getParameter("senha");

	System.out.println("Os dados são:");
	System.out.println(nome+" / "+senha+" / "+login+" / "+sexo+" / "+dataNasc);
	
	// Vou instaciar um usuario com os dados do form, depois faço uso o metodo salvar() do UsuarioDao
	// Tenho que arrumar o banco antes e da um commit
	
	%>
	
</body>
</html>