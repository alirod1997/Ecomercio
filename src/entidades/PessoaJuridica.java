package entidades;

public class PessoaJuridica extends Pessoa{
	public  String cnpj;

	public PessoaJuridica() {}
	
	public PessoaJuridica(String nome, String email, String telefone, String cnpj) {
		super(nome, email, telefone);
		this.cnpj = cnpj;
	}
	
}
