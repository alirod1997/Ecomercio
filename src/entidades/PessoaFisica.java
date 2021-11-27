package entidades;

public class PessoaFisica extends Pessoa{
	public  String cpf;

	public PessoaFisica() {}

	public PessoaFisica(String nome, String email, String telefone, Produto produto, String cpf) {
		super(nome, email, telefone, produto);
		this.cpf = cpf;
	}
	
	
}
