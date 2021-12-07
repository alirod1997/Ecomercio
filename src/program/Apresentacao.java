package program;

import javax.swing.JOptionPane;

import dados.CarrinhoCompras;
import dados.ThreadVerificaCarrinho;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;

public class Apresentacao {
	SelecaoPessoa selecaopessoa = new SelecaoPessoa();
	
	public void Rodar() {
		while (true) {
			
			CarrinhoCompras carrinhoCompras = new CarrinhoCompras();
			ThreadVerificaCarrinho thread = new ThreadVerificaCarrinho(carrinhoCompras);
			thread.start();

			String selecioneProduto = JOptionPane.showInputDialog(
					"SELECIONA UMA OPCAO para compra \n1-produto usado" + "\n2-produto importado" + "\n3-Sair");
			if (selecioneProduto.equals("1")) {
				ProdutoUsado produto = new ProdutoUsado();
				String ident = JOptionPane.showInputDialog("codigo do produto: ");
				produto.id = Integer.parseInt(ident);// parse de string para int
				produto.descricao = JOptionPane.showInputDialog("Descrição do produto: ");
				String precoString = JOptionPane.showInputDialog("preço do produto");
				produto.preco = Double.parseDouble(precoString);
				carrinhoCompras.adicionarAoCarrinho(produto);
				System.out.println(produto);
				selecaopessoa.selecionacliente();
				System.out.println(carrinhoCompras);

			} else if (selecioneProduto.equals("2")) {
				ProdutoImportado produtoImportado = new ProdutoImportado();
				String ident = JOptionPane.showInputDialog("codigo do produto: ");
				produtoImportado.id = Integer.parseInt(ident);// parse de string para int
				produtoImportado.descricao = JOptionPane.showInputDialog("Descrição do produto: ");
				String precoString = JOptionPane.showInputDialog("preço do produto");
				produtoImportado.preco = Double.parseDouble(precoString);
				carrinhoCompras.adicionarAoCarrinho(produtoImportado);
				System.out.println(produtoImportado);
				selecaopessoa.selecionacliente();
				System.out.println(carrinhoCompras);
				

			} else if (selecioneProduto.equals("3")) {
				JOptionPane.showMessageDialog(null, "saindo !" + carrinhoCompras);
				break;
			}
			

	
		}
	}

}
