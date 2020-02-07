<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.sql.Connection" %> 
<%@ page import="dao.Conexao" %>    
<%@ page import="dao.UsuarioDao" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body background="img/fundo.jpg">
	 <div style="position: absolute; left: 300px; top: 30px;  border-color: unset;border-radius: 50px; width: 650px; height: 500px; background-color: transparent;">
        <form action="login.jsp" method="get" style="position: absolute; top: 130px; left: -100px;">
            <h2 style="position: absolute; top: 20px; left: 410px; font-family: Arial, Helvetica, sans-serif;"> Entrar </h2>
            <input type="text" id="login" name="login" style="position: absolute; top: 100px; left: 350px; border-radius: 30px;" placeholder="Usuario">
            <input type="password" id="senha" name="senha" style="position: absolute; top: 180px; left: 350px; border-radius: 30px;" placeholder="Senha">

            <label style="position: absolute; top: 80px; left: 355px; font-family: Arial, Helvetica, sans-serif; color: black; font-weight: 600;">Usuario:</label>
            <label style="position: absolute; top: 160px; left: 350px; font-family: Arial, Helvetica, sans-serif; color:black; font-weight: 600;">Senha:</label>

            <input type="submit" value="Enviar" style="position: absolute; top: 250px; left: 350px; border-radius: 30px; width: 100px;">
            <input type="button" value="Voltar" style="position: absolute; top: 250px; left: 460px; border-radius: 30px; width: 100px;">
        <!--<a href="http://www.google.com.br" style="position: absolute; top: 300px; left: 150px; background-color:transparent; color:black; font-family: Arial, Helvetica, sans-serif;">Esqueceu a senha?</a>-->
        <img src="img/icon1.png" style="position: absolute; top: -100px; left: 380px;">
        </form>
    </div>
    
    <%
    	// TESTANDO JAVA WEB
   	 	UsuarioDao uDao = new UsuarioDao();
   	 	
    	// Capturando dados do formuario
    	String login = request.getParameter("login");
    	String senha = request.getParameter("senha");
    	System.out.println(login+" e "+senha);
    	
    	// Funciona mas ainda não esta bom
    	Connection con = Conexao.conectar();
    	
    	// Funfando !!!
		int validacao = UsuarioDao.validarLogin(login, senha);
		
    	
    %>

</body>
</html>