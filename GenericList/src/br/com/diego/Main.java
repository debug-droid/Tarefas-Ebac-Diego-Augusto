package br.com.diego;



public class Main {

	
	public static void main(String[] args) {
		
		Concessionaria<Object> concessionaria = new Concessionaria<Object>();
		
		concessionaria.adicionarCarro(new Fusca("Volkswagen", "Volkswagen Typ", 1938, "Azul"));
		
		concessionaria.adicionarCarro(new Ferrari("Ferrari", "812 Superfast", 2017, "Vemelha"));
		
		concessionaria.adicionarCarro(new Picape("Renault", "Renault Duster Oroch", 2015, "Cinza"));
		
	
		System.out.println("Carros da Concessionária: ");
		concessionaria.imprimirCarro();
		
	}

}
