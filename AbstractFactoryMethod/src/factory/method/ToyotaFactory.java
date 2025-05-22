package factory.method;

public class ToyotaFactory implements CarroFactory {

	@Override
	public Carro criarSuv() {
		return new ToyotaSuv();
	}

	@Override
	public Carro criarSedan() {
		return new ToyotaSedan();
	}

}
