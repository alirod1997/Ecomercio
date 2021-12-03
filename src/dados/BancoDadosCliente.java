package dados;

import java.util.ArrayList;
import java.util.List;

import entidades.Pessoa;

public class BancoDadosCliente implements InterfaceBandoDadosCliente {

	private List<Pessoa> lista = new ArrayList<>();
	//implementação de singleton no banco de dados
	// passo 2 criar atributo/variavel do tipo da classe
	private static BancoDadosCliente instance;

	// passo 1 criacao de um metodo privado
	private BancoDadosCliente() {
		System.out.println("banco criado");
	}

	// passo3 criar metodo publico estatico que de acesso ao cliente : MAIN
	public static BancoDadosCliente getInstance() {
		if (instance == null) {
			instance = new BancoDadosCliente();
		}
		return instance;
	}

	@Override
	public void salvar(Pessoa pessoa) {
		lista.add(pessoa);
		System.out.println("usuário adicionado ao banco "+pessoa.nome);

	}

	@Override
	public void remover(Pessoa pessoa) {
		lista.remove(pessoa);
		System.out.println("usuario removido do banco "+pessoa.nome);
	}

}
