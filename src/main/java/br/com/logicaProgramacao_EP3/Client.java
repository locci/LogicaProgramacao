package br.com.logicaProgramacao_EP3;
/**EP_03
 * 
 * Voc� foi contratado por um grande banco e recebeu a tarefa de construir um sistema de autentica��o de
clientes. O sistema possui uma classe m�e chamada cliente, duas classes filhas uma chamada cliente
comum e a outra cliente especial. Todos os m�todos das classes filhas lan�am exce��es do tipo
�IllegalArgumentException�, mas nenhum fornece tratamento. Cada classe filha possui apenas um
m�todo chamado �cadastro�. A classe m�e possui dois m�todos teste1 e teste2 que disparam as exce��es
dos respectivos m�todos de cada classe filha ao passar uma string �falha� como par�metros de teste dos
m�todos. Implemente um c�digo Java que viabilize o teste das exce��es como descrito acima.

 * 
 * @author BmLeonardo
 * @author Andriotti
 *
 */
/**
 * Classe Cliente, tem como objetivo,fazer a comunica��o entre os met�dos teste um e teste dois.
 * os testes tem como principal fun��o, tratar as exe��es lan�adas pelos metodos cadastro quando tem uma exce��o na escrita do nome 
 * do cliente.
 * 
 *
 */
public class Client {
	public void testOne() {

		try {
			ClientCommon CC = new ClientCommon();
			CC.register();
		} catch (IllegalArgumentException a) {
			System.err.println("Erro de Argumento, em Cliente Comum");
		}

	}

	public void testTwo() {
		try {
			ClientSpecial CS = new ClientSpecial();
			CS.register();

		} catch (IllegalArgumentException e) {
			System.err.println("Erro de Argumento, em Cliente Especial");
		}
	}

	public static void main(String[] args) {
		new Client().testOne();
		new Client().testTwo();

	}
}

class ClientCommon extends Client {
	public void register() throws IllegalArgumentException {
		String parameter = "89Leonardo";
		if (!parameter.matches("[A-Z][a-z]*")) {
			throw new IllegalArgumentException();

		}
	}
}

class ClientSpecial extends Client {
	public void register() throws IllegalArgumentException {
		String parameter = "nardo64";
		if (!parameter.matches("[A-Za-z]*")) {
			throw new IllegalArgumentException();
		}

	}
}