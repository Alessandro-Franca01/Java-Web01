package model;

public class Usuario {

	private Integer id;
	private String nome;
	private String sobreNome;
	private String senha;
	private String cpf;
	private String email;
	private String sexo;
	private String dataNasc;
	
	public Usuario(){
		
	}

	public Usuario(Integer id, String nome, String sobreNome, String senha,
			String cpf, String sexo, String dataNasc) {
		this.id = id;
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.senha = senha;
		this.cpf = cpf;
		this.sexo = sexo;
		this.dataNasc = dataNasc;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	
	
}
