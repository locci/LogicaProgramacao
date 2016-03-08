package br.com.logicaProgramacao_EP3;
/**EP_03
 * 
 * Você foi contratado por um grande banco e recebeu a tarefa de construir um sistema de autenticação de
clientes. O sistema possui uma classe mãe chamada cliente, duas classes filhas uma chamada cliente
comum e a outra cliente especial. Todos os métodos das classes filhas lançam exceções do tipo
“IllegalArgumentException”, mas nenhum fornece tratamento. Cada classe filha possui apenas um
método chamado “cadastro”. A classe mãe possui dois métodos teste1 e teste2 que disparam as exceções
dos respectivos métodos de cada classe filha ao passar uma string “falha” como parâmetros de teste dos
métodos. Implemente um código Java que viabilize o teste das exceções como descrito acima.

 * 
 * @author BmLeonardo
 * @author Andriotti
 *
 */
/**
 * Classe Cliente, tem como objetivo,fazer a comunicação entre os metódos teste um e teste dois.
 * os testes tem como principal função, tratar as exeções lançadas pelos metodos cadastro quando tem uma exceção na escrita do nome 
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