package entidades;

public class ProdutoImportado extends Produto implements InterfaceProduto{
	private double imposto;

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	//
	@Override
	public void calculaImpostoProduto(double imposimpostoCalculado) {
		double taxaProdutosImportados = 0.30;
		imposto += getImposto() + getPreco() * taxaProdutosImportados;
	}
	
	
}
