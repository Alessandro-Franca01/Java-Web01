package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	private static String USUARIO = "root";
	private static String SENHA = "alessandro";
	private static String ULR = "jdbc:mysql://localhost:3306/projeto_java_web";
	private static String ULR1 = "jdbc:mysql://localhost:3306/projeto_java_web?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

	public static Connection conectar()throws Exception{
		Connection con;
		Class.forName("com.mysql.jdbc.Driver");
		Connection conexao = DriverManager.getConnection(ULR1, USUARIO, SENHA);
		return conexao;
	}
	
	// Usar o metodo main de da classe para testar a conexao
	public static void main(String[] args) {
		try{
		Connection conexao = Conexao.conectar();
		System.out.println("Conectado com sucesso!");
		System.out.println("...");
		System.out.println("Fechando conexao!");
		conexao.close();
		conexao.toString();
		}
		catch (Exception e) {
			e.getMessage();
			System.out.println("Erro ao conectar!");
			e.printStackTrace();
			
		}
	}
	
	
	
}
