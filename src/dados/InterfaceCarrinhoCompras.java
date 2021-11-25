package dados;

import entidades.Produto;

public interface InterfaceCarrinhoCompras {
	public void adicionarAoCarrinho(Produto produto);
	
	public void removerDoCarrinho(Produto produto);
	
	//public void exibirItensDoCarrinho(Produto Produto);
}
