package dados;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import entidades.Produto;

public class CarrinhoCompras implements InterfaceCarrinhoCompras{
	public List<Produto> lista = new ArrayList<>();
	public boolean validaVazio;

	@Override
	public void adicionarAoCarrinho(Produto produto) {
		lista.add(produto);
		
	}

	@Override
	public void removerDoCarrinho(Produto produto) {
		lista.remove(produto);
	}

	@Override
	public void validaVazio(Produto produto) {
		if (lista.isEmpty()) {
			JOptionPane.showMessageDialog(null,"carrinho de compras está vazio, porfavor adicione um produto para salvar");
		} else {
			JOptionPane.showMessageDialog(null, "Produto adicionado ao carrinho!");
		}
	}

	
	
}
