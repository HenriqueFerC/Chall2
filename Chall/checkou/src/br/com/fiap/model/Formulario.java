package br.com.fiap.model;

public class Formulario {
	private int idAtendente;
	private String nome;
	private int numeroApolice;
	private int data;
	private int idVeiculo;
	
	
	public Formulario() {
		super();
	}
	
	public Formulario(int idAtendente, String nome, int numeroApolice, int data, int idVeiculo) {
		super();
		this.idAtendente = idAtendente;
		this.nome = nome;
		this.numeroApolice = numeroApolice;
		this.data = data;
		this.idVeiculo = idVeiculo;
	}

	
	public int getIdAtendente() {
		return idAtendente;
	}
	public void setIdAtendente(int idAtendente) {
		this.idAtendente = idAtendente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroApolice() {
		return numeroApolice;
	}
	public void setNumeroApolice(int numeroApolice) {
		this.numeroApolice = numeroApolice;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public int getIdVeiculo() {
		return idVeiculo;
	}
	public void setIdVeiculo(int idVeiculo) {
		this.idVeiculo = idVeiculo;
	}
	
	
	
}
