package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Usuario;
import org.apache.catalina.User;
import model.Usuario;

public class UsuarioDao {
	
	// Codigo do metodo para salvar  Fabricante no banco - FUNCIONAND0!!!
	public void salvar(Usuario user) throws Exception{
		
		String comando = "INSERT INTO USUARIO "+
						 "(IDUSUARIO, NOME, SOBRE_NOME, CPF, SENHA, EMAIL, SEXO, DATA_NASC) "+
						 "VALUES (?,?,?,?,?,?,?,?)";
		
		Connection con = Conexao.conectar();
		PreparedStatement query = con.prepareStatement(comando);
		query.setString(1, null); // passando nulo pq vai incrementado pelo proprio MySQL
		query.setString(2, user.getNome());
		query.setString(3, user.getSobreNome());
		query.setString(4, user.getCpf());
		query.setString(5, user.getSenha());
		query.setString(6, user.getEmail());
		query.setString(7, user.getSexo());
		query.setString(8, user.getDataNasc());
		
		// inteiro pega as linhas afetadas na query
		int rowAffect = query.executeUpdate();	
		//con.commit(); esta salvando sem usar o commit ??!!!
	
	}
	
	// Como vou fazer essa validação no usuario correto?
	public static int validarLogin(String login, String senha){
		
		int id = 0;
		String comando = "SELECT IDUSUARIO FROM USUARIO "+
						 "WHERE NOME = ? AND SENHA = ?";
		
		if((login != null) && (senha != null)){ // depois ver se essa sintaxe esta certa!
			try{
				Connection con = Conexao.conectar();
				PreparedStatement query = con.prepareStatement(comando);
				
				query.setString(1, login); // aqui no caso vou usar o nome no lugar do login para testar!
				query.setString(2, senha);
				ResultSet resultado = query.executeQuery();
				if(resultado.next()){
					id = resultado.getInt("IDUSUARIO");
					System.out.println("O id do usuario é: "+id);
				}}catch(Exception e){
					e.printStackTrace();
				}
			}	
		else{
			System.out.println("Entrando no ELSE");	
			}
		return id;
		}
		
	
	
	// Testando o metodo de salvar fabricante com o DAO 
	public static void main(String[] args){
		
		Usuario User01 = new Usuario();
		User01.setNome("Alessandro");
		User01.setSobreNome("Franca");
		User01.setCpf("123456789-11");
		User01.setSenha("12345");
		User01.setEmail("san@gmail.com");
		User01.setSexo("M");
		User01.setDataNasc("1988-07-22"); 
		
		Usuario f2 = new Usuario();
		
		try{
		UsuarioDao UserDao = new UsuarioDao();
		UserDao.salvar(User01);
		//UserDao.salvar(f2);
		System.out.println("Os dados foram salvos com sucesso!");
		}catch (Exception exceptionTeste){
			System.out.println(exceptionTeste.getMessage());
			exceptionTeste.printStackTrace();
			System.out.println("Seus dados não foram salvos!");
		}
	
	}
	
}

