package dados;

import entidades.Produto;

public class ServiceProduto {
	//valida e salva o produto ao adicionar no carrinho
	public CarrinhoCompras carrinho = new CarrinhoCompras();
	
	public boolean salvar(Produto produto) {
		carrinho.validaVazio(produto);
		carrinho.adicionarAoCarrinho(produto);
		return true;
	}
	
	
}
