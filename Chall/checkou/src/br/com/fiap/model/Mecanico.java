package br.com.fiap.model;

public class Mecanico {
	private String nome;
	private String localizacao;
	private int id;
	
	
	
	public Mecanico() {
		super();
	}
	
	
	public Mecanico(String nome, int id) {
		super();
		this.nome = nome;
		this.id = id;
	}


	public Mecanico(String nome, String localizacao, int id) {
		super();
		this.nome = nome;
		this.localizacao = localizacao;
		this.id = id;
	}
	
	public String mecanico() {
		return "\n" + "ID do Mecanico : " + id + "\n" + "Nome do Mecanico : " + nome; 
 	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
