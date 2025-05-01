
public class Main {

	public static void main(String[] args) {
		
		Pessoa pf = new PessoaFisica("Diego A.", 35, 12345678900l);
		
		Pessoa pj = new PessoaJuridica("Serviços de Informática S.A", 12, 0012345612345l);
		
		pf.imprimirPessoa();
		
		pj.imprimirPessoa();
	}

}
