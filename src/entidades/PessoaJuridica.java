package entidades;

public class PessoaJuridica extends Pessoa{
	public  String cnpj;

	public PessoaJuridica() {}

	public PessoaJuridica(String nome, String email, String telefone, Produto produto, String cnpj) {
		super(nome, email, telefone, produto);
		this.cnpj = cnpj;
	}
	
	@Override
	public String tosString() {
		return super.tosString()+"cliente pessoa juridica portador do cnpj ------->"+cnpj;
	}
}
