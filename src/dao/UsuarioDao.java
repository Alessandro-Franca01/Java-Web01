package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Usuario;
import org.apache.catalina.User;
import model.Usuario;

public class UsuarioDao {
	
	// Codigo do metodo para salvar  Fabricante no banco - FUNCIONAND0!!!
	public void salvar(Usuario user) throws SQLException{
		
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
	
	}
	
	public Usuario validarLogin(String login, String senha){

		// Como vou fazer essa validação no usuario correto?
		Usuario user = new Usuario();
		String comando = "SELECT ";
		if((login != null) && (senha != null)){
				
		}
		return user;
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
		User01.setDataNasc("1988-07-22"); // salvou agora!
		
		//f1.setDescricaoFab("Avon"); // Falta 'setar' os dados do usuario!
		
		Usuario f2 = new Usuario();
		//f2.setDescricaoFab("Natura");  // Falta 'setar' os dados do usuario!
		
		try{
		UsuarioDao UserDao = new UsuarioDao();
		UserDao.salvar(User01);
		//UserDao.salvar(f2);
		System.out.println("Os dados foram salvos com sucesso!");
		}catch (SQLException exceptionTeste){
			System.out.println(exceptionTeste.getMessage());
			exceptionTeste.printStackTrace();
			System.out.println("Seus dados não foram salvos!");
		}
	
	}
	
}

