package program;

import dados.BancoDadosCliente;
import dados.ServiceProduto;
import entidades.PessoaFisica;
import entidades.ProdutoImportado;

public class Main {

	public static void main(String[] args) {
		ProdutoImportado produto = new ProdutoImportado(1, "base refrigerada para notebook", 350.00);
		PessoaFisica pf = new PessoaFisica("josnei", "josneiemail@gmail.com", "5550102", produto, "043020239213");
		
		BancoDadosCliente BDC = BancoDadosCliente.getInstance();
		BDC.salvar(pf);
		
		ServiceProduto sp = new ServiceProduto();
		sp.carrinho.adicionarAoCarrinho(produto);
		sp.salvar(produto);
		
	}

}
