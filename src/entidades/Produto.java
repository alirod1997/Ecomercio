package entidades;

public class Produto {
	public int id;
	public  String descricao;
	public  double preco;
	
	public Produto() {}

	public Produto(int id, String descricao, double preco) {
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public String toString() {
		return "Id >"+id+"\nDescricao >"+descricao+"\nPreco >R$"+preco+"\n----";
	}
	
}
