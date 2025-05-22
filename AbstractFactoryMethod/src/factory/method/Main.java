package factory.method;

public class Main {

	public static void main(String[] args) {
		
		// criando uma fábrica da ford
		CarroFactory fordFactory = new FordFactory();
		Carro fordSuv = fordFactory.criarSuv();
		Carro fordSedan = fordFactory.criarSedan();
		
		fordSuv.dirigir();
		fordSedan.dirigir();
		
		// criando uma fábrica da toyota
		CarroFactory toyotaFactory = new ToyotaFactory();
		Carro toyotaSuv = toyotaFactory.criarSuv();
		Carro toyotaSedan = toyotaFactory.criarSedan();
		
		toyotaSuv.dirigir();
		toyotaSedan.dirigir();
	}

}
