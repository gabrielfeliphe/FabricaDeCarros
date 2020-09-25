package controle;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.Carros;
import modelo.Fabrica;
import visualizacao.EntradaSaida;

// separar as opçoes - implementação case 0
// fabrica ser atributo - LINE 25
// parar de criar um arraylist e mandar para a fabrica em vez de trocar a lista toda -LINE 38

public class Controle {

	Fabrica fabrica = new Fabrica(); // Criemos um objeto fabrica

	public void iniciaMenu() {

		int iniciaFabrica = EntradaSaida.qstIniciaFabrica(); // método que pergunta a abertura da fabrica
		do {
			switch (iniciaFabrica) { // recebe o retorno do metodo e joga dentro das escolhas
			case 0:
				chamaFabrica();
				break;
			case 1:
				if (fabrica.getArrayCarros().size() < 1) {
					EntradaSaida.exibeMsgErrosEscolhas(1);
				} else {
					chamaVender();
				}
				break;
			case 2:
				if (fabrica.getArrayCarros().size() < 1) {
					EntradaSaida.exibeMsgErrosEscolhas(2);
				} else {
					chamaEstoque();
				}
				break;
			case 3:
				EntradaSaida.exibeMsgEncerramento();
				break;
			}
			iniciaFabrica = EntradaSaida.qstIniciaFabrica();
		} while (iniciaFabrica != 3);

	}

	public void chamaVender() {

		boolean abrirVendas = EntradaSaida.abrirVendas(0); // abertura das vendas #FEIRAO
		String[] infoCarros = fabrica.infoCarros();

		while (abrirVendas == true && fabrica.getArrayCarros().size() > 0) { // ciclo para ver se tem carros para abrir
																				// as vendas
			infoCarros = fabrica.infoCarros();
			int menuVendedor = EntradaSaida.menuVendedor(infoCarros);
			fabrica.venderCarro(menuVendedor);
			if (fabrica.getArrayCarros().size() >= 1) {
				abrirVendas = EntradaSaida.abrirVendas(1);
			}
		}

	}

	public void chamaEstoque() {

		if (fabrica.infoCarros().length >= 1) {
			EntradaSaida.verEstoque(fabrica.infoCarros());
		}

	}

	public void chamaFabrica() {

		JOptionPane.showMessageDialog(null, "INICIANDO FABRICA!");

		int qtCarros = EntradaSaida.qtCriarCarros(); //

		ArrayList<Carros> carros = new ArrayList<Carros>();

		for (int i = 0; i < qtCarros; i++) { // laço de repetição onde cria os carros
			String tipoCarro = EntradaSaida.escolhaCarros();
			String corCarro = EntradaSaida.EscolhaCores();
			Carros novoCarro = new Carros();
			novoCarro.setCorCarro(corCarro);
			novoCarro.setModeloCarro(tipoCarro);
			fabrica.fabricarCarro(novoCarro);
		}

	}

}
