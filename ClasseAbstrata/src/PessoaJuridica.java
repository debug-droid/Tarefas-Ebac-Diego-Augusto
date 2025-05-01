
public class PessoaJuridica extends Pessoa {
	
	
	private Long cnpj;
	
	public PessoaJuridica(String nome, Integer idade, Long cnpj) {
		super(nome, idade);
		this.cnpj = cnpj;
	}

	public Long getCnpj() {
		return cnpj;
	}

	public void setCnpj(Long cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public void imprimirPessoa() {
		System.out.println("Nome: " + this.getNome() + ", Idade: " + this.getIdade() + ", Cnpj: " + getCnpj());
	}
	
}
