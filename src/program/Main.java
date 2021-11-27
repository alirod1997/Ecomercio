package program;

import dados.CarrinhoCompras;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;

public class Main {

	public static void main(String[] args) {
		CarrinhoCompras carrinho = new CarrinhoCompras();
		//List<Produto> lista = new ArrayList<Produto>();
		
		ProdutoImportado p1 = new ProdutoImportado();
		p1.id = 1;
		p1.descricao = "base de refrigeração de notebook 50 cm";
		p1.preco = 25.45;
		p1.calcularImpostoProduto();
		
		
		ProdutoUsado p2 = new ProdutoUsado();
		p2.id = 2;
		p2.descricao = "base de refrigeração de notebook 50 cm";
		p2.preco = 25.45;
		p2.calcularImpostoProduto();
		//lista.forEach(System.out::println);
		System.out.println(p1.calcularImpostoProduto());

		System.out.println(p2.calcularImpostoProduto());
		
		carrinho.lista.add(p1);
		carrinho.lista.add(p2);
		
//		System.out.println(carrinho);
	}

}
