package entidades;

public class ProdutoUsado extends Produto implements InterfaceProduto{
	public double imposto = 1.75;

	public ProdutoUsado() {}
	
	public ProdutoUsado(int id, String descricao, double preco) {
		super(id, descricao, preco);
	}

	//
	@Override
	public double calcularImpostoProduto() {
		return this.preco + imposto;		
	}

	@Override
	public String toString() {
		return super.toString()+"preço de produto usado já com imposto inserido >R$"+calcularImpostoProduto();
	}
	
	
}
