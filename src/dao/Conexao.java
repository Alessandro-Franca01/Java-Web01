package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	private static String USUARIO = "root";
	private static String SENHA = "alessandro";
	private static String ULR = "jdbc:mysql://localhost:3306/projeto_java_web?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

	public static Connection conectar() throws SQLException{
		Connection conexao = DriverManager.getConnection(ULR, USUARIO, SENHA);
		return conexao;
	}
	
	// Usar o metodo main de da classe para testar a conexao
	public static void main(String[] args) {
		try{
		Connection conexao = Conexao.conectar();
		System.out.println("Conectado com sucesso!");
		}
		catch (Exception e) {
			e.getMessage();
			System.out.println("Erro ao conectar!");
			
		}
	}
	
	
	
}
