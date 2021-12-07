package program;

import javax.swing.JOptionPane;

import dados.BancoDadosCliente;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;

public class SelecaoPessoa {
	public void selecionacliente() {
		while (true) {
			BancoDadosCliente bd = BancoDadosCliente.getInstance();

			String selecioneCliente = JOptionPane.showInputDialog("SELECIONA UMA OPCAO para compra \n1-Pessoa física"
					+ "\n2-Pessoa jurídica" + "\n3-exibir nota/Sair");
			if (selecioneCliente.equals("1")) {
				PessoaFisica pf = new PessoaFisica();
				pf.nome = JOptionPane.showInputDialog("nome:");
				pf.cpf = JOptionPane.showInputDialog("cpf:");
				pf.telefone = JOptionPane.showInputDialog("telefone:");
				pf.email = JOptionPane.showInputDialog("email:");
				bd.salvar(pf);
				System.out.println(bd);

			} else if (selecioneCliente.equals("2")) {
				PessoaJuridica pj = new PessoaJuridica();
				pj.nome = JOptionPane.showInputDialog("nome:");
				pj.cnpj = JOptionPane.showInputDialog("cnpj:");
				pj.telefone = JOptionPane.showInputDialog("telefone:");
				pj.email = JOptionPane.showInputDialog("email:");
				bd.salvar(pj);
				System.out.println(bd);

			} else if (selecioneCliente.equals("3")) {
				JOptionPane.showMessageDialog(null, bd);
				break;
			}
		}
	}
}
