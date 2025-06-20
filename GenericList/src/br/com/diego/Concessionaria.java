package br.com.diego;

import java.util.ArrayList;
import java.util.List;

public class Concessionaria<T> {
	
	private List<T> carros;
	
	public Concessionaria() {
		this.carros = new ArrayList<>();
	}

	public void adicionarCarro(T carro) {
		carros.add(carro);
	}
	
	public void imprimirCarro() {
		for(T carro : carros) {
			System.out.println(carro);
		}
	}
}
