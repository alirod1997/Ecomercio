package dados;

import entidades.Produto;

public class ThreadVerificaCarrinho extends Thread{
	//thread que verifica se o carrinho está vazio de tempos em tempos
	CarrinhoCompras carrinho = new CarrinhoCompras();
	
	public ThreadVerificaCarrinho() {}
	
	public ThreadVerificaCarrinho(CarrinhoCompras carrinho) {
		this.carrinho = carrinho;
	}
	
	public void run() {
		while (true) {
			try {
				Produto produto = new Produto();
				if (carrinho.lista.isEmpty()) {
					System.out.println("carrinho ainda está vazio! adicione um ítem !");
				}else {
					System.out.println("produto adicionado !"+produto.descricao);
				}
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
