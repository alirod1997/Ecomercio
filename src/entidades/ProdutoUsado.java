package entidades;

public class ProdutoUsado extends Produto implements InterfaceProduto{
	public double imposto = 1.75;

	public ProdutoUsado() {}
	
	//
	@Override
	public double calcularImpostoProduto() {
		return this.preco + imposto;		
	}
	
	
}
