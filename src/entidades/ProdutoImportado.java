package entidades;

public class ProdutoImportado extends Produto implements InterfaceProduto{
	public double imposto;
	
	public ProdutoImportado() {}
	
	//
	@Override
	public void calcularImpostoProduto(double impostoCalculado) {
		double taxaProdutosImportados = 0.30;
		imposto += imposto + preco * taxaProdutosImportados;
	}
	
	
}
