import javax.swing.JOptionPane;

import controle.Controle;
/*By Indianara. Criou a f�brica como um fluxo cont�nuo que fabrica carros, vende e exibe estoque, n�o criou um menu.
 *  Fez de uma forma que somente podem ser adicionados "x" carros por vez, n�o se podem fabricar mais carros para vender. 
 *  Por�m, quanto ao processo de venda, exibi��o dos carros da f�brica e valida��es de dados est� ok, o ajuste maior � no fabricar mesmo.
Pedi para criar um menu com as op��es: fabricar carro, vender carro, exibir estoque de carros e sair.*/


public class Principal { // INICIO DO PROGRAMA

	public static void main(String[] args) {
		
		Controle controle = new Controle(); // INSTANCIAMOS UM OBJETO E INICIAMOS O MENU 
		controle.iniciaMenu(); // iniciamos pelo m�todo iniciaMenu()
	}

}
