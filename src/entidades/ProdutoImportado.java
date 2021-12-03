package entidades;

public class ProdutoImportado extends Produto implements InterfaceProduto{
	public double imposto = 9.45;
	
	public ProdutoImportado() {}
	
	public ProdutoImportado(int id, String descricao, double preco) {
		super(id, descricao, preco);
	}

	//
	@Override
	public double calcularImpostoProduto() {
		return this.preco + imposto;
	}

	@Override
	public String toString() {
		return super.toString() + "preço de produto importado já com imposto inserido >R$"+calcularImpostoProduto();
	}
	
	
	
}
