package factory.method;

public class FordFactory implements CarroFactory {

	@Override
	public Carro criarSuv() {
		return new FordSuv();
	}

	@Override
	public Carro criarSedan() {
		return new FordSedan();
	}

}
