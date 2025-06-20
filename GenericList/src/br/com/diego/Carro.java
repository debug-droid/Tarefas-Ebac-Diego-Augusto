package br.com.diego;

public abstract class Carro {
	
	protected String marca;
	protected String modelo;
	protected Integer ano;
	
	public Carro(String marca, String modelo, Integer ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
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

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	
	
	@Override
	public String toString() {
		return "[Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + "]";
	}

}
