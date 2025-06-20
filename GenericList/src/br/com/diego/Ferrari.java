package br.com.diego;

public class Ferrari extends Carro {
	
	private String cor;

	public Ferrari(String marca, String modelo, Integer ano, String cor) {
		super(marca, modelo, ano);
		this.cor = cor;
	}
	
	

	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "[Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + ", Cor: " + cor + "]";
	}

}
