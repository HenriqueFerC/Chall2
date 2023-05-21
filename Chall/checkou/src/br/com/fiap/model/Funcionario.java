package br.com.fiap.model;

public class Funcionario {
	private String login;
	private String senha;
	private String nome;
	private int id;
	
	
	public Funcionario() {
		super();
	}
	
	public Funcionario(String login, String senha, String nome, int id) {
		super();
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		this.id = id;
	}
	public String Funcionariou() {
		return "\n" + "Login do funcionario : " + login + "\n" + "Senha : " + senha + "\n" + "Nome do funcionario : " + nome + "\n" + "ID do Funcionario : " + id;
	}

	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
