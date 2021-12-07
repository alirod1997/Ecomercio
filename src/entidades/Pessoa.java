package entidades;

public class Pessoa {
	public String nome;
	public String email;
	public  String telefone;
	public Produto produto;
	
	public Pessoa() {}

	public Pessoa(String nome, String email, String telefone, Produto produto) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.produto = produto;
	}
	
	public String tosString() {
		return "\nCliente fez a compra: \n"+nome+"\nemail: "+email+"\ntelefone: "+telefone+"\nproduto: "+produto;
	}
	
}
