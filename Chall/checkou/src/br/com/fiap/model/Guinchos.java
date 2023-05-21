package br.com.fiap.model;

public class Guinchos {
	private String placa;
	private String tipoGuincho;
	private int id;
	
	
	
	public Guinchos() {
		super();
	}
	
	public Guinchos(String placa, String tipoGuincho, int id) {
		super();
		this.placa = placa;
		this.tipoGuincho = tipoGuincho;
		this.id = id;
	}

	public String guincho() {
		return "\n" + "ID do Guincho : " + id + "\n" + "Placa do guincho : " + placa + "\n" + "Tipo do Guincho : " + tipoGuincho;
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getTipoGuincho() {
		return tipoGuincho;
	}
	public void setTipoGuincho(String tipoGuincho) {
		this.tipoGuincho = tipoGuincho;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
