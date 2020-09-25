package modelo;

import java.util.ArrayList;

public class Fabrica {

	private ArrayList<Carros> arrayCarros = new ArrayList<Carros>(); // recebe um carrito carrao ou carreira

	public void venderCarro(int indexCarros) { // venda do carro

		arrayCarros.remove(indexCarros);

	}

	public void fabricarCarro(Carros novoCarro) { // FABRIQUEMOS PRA DEPOIS VENDER
		arrayCarros.add(novoCarro);

	}

	public ArrayList<Carros> getArrayCarros() {
		return arrayCarros;
	}

	public void setArrayCarros(ArrayList<Carros> arrayCarros) {
		this.arrayCarros = arrayCarros;
	}

	public String[] infoCarros() { // Função serve para retornar um array contendo todos os carros onde usaremos na nossa classe
								   // EntradaSaida para printar um menu flutante com o jcombobox
 		String infoCarros[] = new String[arrayCarros.size()]; // cria um vetor com o mesmo tamanho da arraylist

		for (int i = 0; i < arrayCarros.size(); i++) {
			infoCarros[i] = arrayCarros.get(i).getModeloCarro() + " " + arrayCarros.get(i).getCorCarro(); // armazena info no vetor
		}

		return infoCarros; // RETORNA

	}

}
