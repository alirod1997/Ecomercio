package entidades;

public class PessoaFisica extends Pessoa{
	public  String cpf;

	public PessoaFisica() {}

	public PessoaFisica(String nome, String email, String telefone, Produto produto, String cpf) {
		super(nome, email, telefone, produto);
		this.cpf = cpf;
	}
	
	@Override
	public String tosString() {
		return super.tosString()+"cliente pessoa física portador do cpf ------->"+cpf;
	}
}
