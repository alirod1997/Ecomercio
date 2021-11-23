package dados;

import java.util.ArrayList;

import entidades.Produto;

public class CarrinhoCompras implements InterfaceCarrinhoCompras{
	public ArrayList<Produto> lista = new ArrayList<Produto>();

	@Override
	public void adicionaAoCarrinho(Produto produto) {
		lista.add(produto);
	}

	@Override
	public void removeDoCarrinho(Produto produto) {
		lista.remove(produto);
	}

	
}
