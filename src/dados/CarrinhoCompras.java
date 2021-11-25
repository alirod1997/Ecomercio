package dados;

import java.util.ArrayList;
import java.util.List;

import entidades.Produto;

public class CarrinhoCompras implements InterfaceCarrinhoCompras{
	public List<Produto> lista = new ArrayList<Produto>();

	@Override
	public void adicionarAoCarrinho(Produto produto) {
		lista.add(produto);
	}

	@Override
	public void removerDoCarrinho(Produto produto) {
		lista.remove(produto);
	}

//	@Override
//	public void exibirItensDoCarrinho(Produto Produto) {
//		
//		
//	}

	
}
