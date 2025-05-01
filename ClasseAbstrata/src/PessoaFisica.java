
public class PessoaFisica extends Pessoa {
	
	
	private Long cpf;

	public PessoaFisica(String nome, Integer idade, Long cpf) {
		super(nome, idade);
		this.cpf = cpf;
	}

	public Long getCpf() {
		return cpf;
	}
	
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	@Override
	public void imprimirPessoa() {
		System.out.println("Nome: " + this.getNome() + ", Idade: " + this.getIdade() + ", Cpf: " + this.getCpf());
		
	}

	

}
