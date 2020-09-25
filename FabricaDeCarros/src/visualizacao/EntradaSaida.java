package visualizacao;

import java.util.Arrays;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class EntradaSaida {

	public static int qstIniciaFabrica() { // metodo para criação da fabrica

		String[] options = { "Fabricar", "Vender", "Ver Estoque", "Sair" }; // 0,1,2

		int selecao = JOptionPane.showOptionDialog(null, "Selecione a opção desejada", "Car System v2",
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

		return selecao;
	}

	public static int qtCriarCarros() { // metodo para criar carros com validação para ser maior que Zero
		int qtCarros = Integer
				.parseInt(JOptionPane.showInputDialog("Digite a quantidade de carros que devem ser fabricados!"));
		while (qtCarros <= 0) {
			JOptionPane.showMessageDialog(null, "O número de carros não pode ser menor ou igual a Zero!");
			qtCarros = Integer
					.parseInt(JOptionPane.showInputDialog("Digite a quantidade de carros que devem ser fabricados!"));
		}
		return qtCarros;
	}

	public static String escolhaCarros() { // metodo para fazer as escolhas de carros com menu flutante

		String opcoesCarros[] = { "Siena", "Astra", "Fusca", "Golf GTI", "Azera Tunado", "Patinete com Nitro",
				"Anão Rebaixado de Aerofólio em chamas" };
		JComboBox<String> opcaoCarros = new JComboBox<String>(opcoesCarros);
		int option = JOptionPane.showConfirmDialog(null, opcaoCarros, "Selecione a opção desejada",
				JOptionPane.OK_CANCEL_OPTION);

		while (option != 0) {
			option = JOptionPane.showConfirmDialog(null, opcaoCarros, "Selecione a opção desejada",
					JOptionPane.OK_CANCEL_OPTION);
		}

		return (String) opcaoCarros.getSelectedItem();

	}

	public static String EscolhaCores() {// metodo para escolha de cores menu flutante

		String opcoesCores[] = { "Azul", "Verde", "Branco", "Rosa", "Vermelho", "Tinta Invisivel" };
		JComboBox<String> opcaoCores = new JComboBox<String>(opcoesCores);
		int option = JOptionPane.showConfirmDialog(null, opcaoCores, "Selecione a opção desejada",
				JOptionPane.OK_CANCEL_OPTION);

		while (option != 0) {
			option = JOptionPane.showConfirmDialog(null, opcaoCores, "Selecione a opção desejada",
					JOptionPane.OK_CANCEL_OPTION);
		}

		return (String) opcaoCores.getSelectedItem();

	}

	public static int menuVendedor(String[] infoCarros) { // metodo onde o vendedor escolhe o carro para vender

		JComboBox<String> escolha = new JComboBox<String>(infoCarros);

		int option = JOptionPane.showConfirmDialog(null, escolha, "Selecione o carro que deseja vender",
				JOptionPane.OK_CANCEL_OPTION);
		while (option != 0) {
			option = JOptionPane.showConfirmDialog(null, escolha, "Selecione o carro que deseja vender",
					JOptionPane.OK_CANCEL_OPTION);
		}
		return escolha.getSelectedIndex();

	}

	public static boolean abrirVendas(int operacao) { // metodo para fazer o questionamento de abrir vendas e continuar
														// vendendo
		String msg = "";

		switch (operacao) {
		case 0:
			msg = "Deseja abrir as vendas ?";
			break;
		case 1:
			msg = "Deseja vender outro carro ?";
			break;
		}

		if (JOptionPane.showConfirmDialog(null, msg, "Sistema de Vendas",
				JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
			return true;
		} else {
			return false;
		}

	}

	public static void exibeMsgEncerramento() { // metodo para encerramento do programa
		JOptionPane.showMessageDialog(null, "O programa será encerrado !");
		System.exit(0);
	}

	public static void verEstoque(String[] infoCarros) { // metodo para ver o estoque de carros por meio de um vetor
															// String

		if (JOptionPane.showConfirmDialog(null, "Deseja ver o estoque de carros restantes ?", "Sistema de Vendas",
				JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {// MANO DO CEU STACKOVERFLOW É FODA
			JOptionPane.showMessageDialog(null, "Estoque de carros é :\n" + Arrays.toString(infoCarros));
			// MANO DO CEU STACKOVERFLOW É FODA
		}
	}

	public static void exibeMsgErrosEscolhas(int escolha) {
		String msg = "";
		switch (escolha) {
		case 1:
			msg = "Erro, não há carros para vender no estoque!";
			break;
		case 2:
			msg = "Erro, não há carros no estoque para mostrar!";
			break;
		}
		
		JOptionPane.showMessageDialog(null, msg);
	}

}
