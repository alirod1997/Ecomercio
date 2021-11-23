package entidades;

public class ProdutoUsado extends Produto implements InterfaceProduto{
	private double imposto;

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	//
	@Override
	public void calculaImpostoProduto(double impostoCalculado) {
		double taxaProdutosUsados = 0.10;
		imposto += getImposto() + getPreco() * taxaProdutosUsados;		
	}
	
	
}
