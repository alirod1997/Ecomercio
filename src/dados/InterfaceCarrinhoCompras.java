package dados;

import entidades.Produto;

public interface InterfaceCarrinhoCompras {
	public void adicionaAoCarrinho(Produto produto);
	
	public void removeDoCarrinho(Produto produto);
}
