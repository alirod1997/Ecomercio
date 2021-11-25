package entidades;

public class ProdutoUsado extends Produto implements InterfaceProduto{
	public double imposto;

	public ProdutoUsado() {}
	
	//
	@Override
	public void calcularImpostoProduto(double impostoCalculado) {
		double taxaProdutosUsados = 0.10;
		imposto += imposto + preco * taxaProdutosUsados;		
	}
	
	
}
