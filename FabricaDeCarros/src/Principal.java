import javax.swing.JOptionPane;

import controle.Controle;
/*By Indianara. Criou a fábrica como um fluxo contínuo que fabrica carros, vende e exibe estoque, não criou um menu.
 *  Fez de uma forma que somente podem ser adicionados "x" carros por vez, não se podem fabricar mais carros para vender. 
 *  Porém, quanto ao processo de venda, exibição dos carros da fábrica e validações de dados está ok, o ajuste maior é no fabricar mesmo.
Pedi para criar um menu com as opções: fabricar carro, vender carro, exibir estoque de carros e sair.*/


public class Principal { // INICIO DO PROGRAMA

	public static void main(String[] args) {
		
		Controle controle = new Controle(); // INSTANCIAMOS UM OBJETO E INICIAMOS O MENU 
		controle.iniciaMenu(); // iniciamos pelo método iniciaMenu()
	}

}
