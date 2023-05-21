package br.com.fiap.model;

public class Veiculo {
	private String marca;
	private String modelo;
	private short anoFabricacao;
	private String placa;
	private String categoriaTarifaria;
	
	
	
	
	public Veiculo() {
		super();
	}
	public Veiculo(String marca, String modelo, short anoFabricacao, String placa, String categoriaTarifaria) {
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.placa = placa;
		this.categoriaTarifaria = categoriaTarifaria;
	}
	
	public String vehicle() {
		return "VEICULO" + "\n" + "Marca : " + marca + "\n" + "Modelo : " + modelo + "\n" + "Ano de Fabricacao : " + anoFabricacao + "\n" + "Placa : " + placa + "\n" + "Categoria Tarifaria : " + categoriaTarifaria;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public short getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(short anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCategoriaTarifaria() {
		return categoriaTarifaria;
	}
	public void setCategoriaTarifaria(String categoriaTarifaria) {
		this.categoriaTarifaria = categoriaTarifaria;
	}
	
	
}
