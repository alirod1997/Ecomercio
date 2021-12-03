package dados;

import entidades.Pessoa;

public interface InterfaceBandoDadosCliente {
	public void salvar(Pessoa pessoa);

	public void remover(Pessoa pessoa);
}
