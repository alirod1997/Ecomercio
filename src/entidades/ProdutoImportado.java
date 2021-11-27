package entidades;

public class ProdutoImportado extends Produto implements InterfaceProduto{
	public double imposto = 9.45;
	
	public ProdutoImportado() {}
	
	//
	@Override
	public double calcularImpostoProduto() {
		return this.preco + imposto;
	}

	@Override
	public String toString() {
		
		return super.toString();
	}
	
	
	
}
