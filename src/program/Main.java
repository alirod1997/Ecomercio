package program;

import java.util.ArrayList;
import java.util.List;

import entidades.Produto;

public class Main {

	public static void main(String[] args) {
		//CarrinhoCompras carrinho = new CarrinhoCompras();
		List<Produto> lista = new ArrayList<Produto>();
		
		Produto p1 = new Produto();
		p1.id = 1;
		p1.descricao = "base de refrigeração de notebook 50 cm";
		p1.preco = 25.45;
		
		Produto p2 = new Produto();
		p2.id = 2;
		p2.descricao = "monitor widescreen haotv";
		p2.preco = 25.45;
		
		Produto p3 = new Produto();
		p3.id = 3;
		p3.descricao = "teclado mecanico switch blue techmurder";
		p3.preco = 25.45;
		
//		carrinho.adicionarAoCarrinho(p1);
//		carrinho.adicionarAoCarrinho(p2);
//		carrinho.adicionarAoCarrinho(p3);
//		
//		carrinho.lista.forEach(System.out::println);
		
		
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		
		lista.forEach(System.out::println);
	}

}
