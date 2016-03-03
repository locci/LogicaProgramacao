package br.com.logicaProgramacao_EP0;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Ci�ncia da Computa��o Exerc�cio 1 1. Identifique as classes, a rela��o entre
 * as classes, os atributos das classe e seus m�todos com base no texto abaixo
 * a. Os fel�deos (latim cient�fico: Felidae) constituem uma fam�lia de animais
 * mam�feros digit�grados, da ordem dos carn�voros. A esp�cie mais comum no
 * mundo hoje � o gato dom�stico, que j� convive com os seres humanos por cerca
 * de 10 mil anos, no entanto, existem muitas outras esp�cies selvagens, como os
 * grandes felinos. Existem duas subfam�lias de fel�deos: Pantherinae (que
 * inclui tigres, le�es, on�aspintadas e leopardos) e Felinae (que inclui
 * guepardos,su�uaranas, linces, jaguatiricas e gatos dom�sticos). Os primeiros
 * exemplares da fam�lia surgiram durante o oligoceno, cerca de 25 milh�es de
 * anos atr�s. Na pr�hist�ria, tamb�m existia uma terceira subfam�lia denominada
 * Machairodontinae, em que faziam parte os fel�deos dentesdesabre como o
 * Smilodon. Apesar dassemelhan�as superficiais, os tamb�m extintos
 * Thylacosmilus e Nimravidae n�o est�o inclu�dos na fam�lia Felidae. (fonte:
 * https://pt.wikipedia.org/wiki/Felidae )
 * 
 * @author BmLeonardo
 *
 */
public class EntradaDados {
	Path arquivo; // Path recebe o caminho at� o arquivo desejado;
	Integer numeroLinhas;

	public EntradaDados() {

		this.arquivo = Paths.get("C:\\Users\\BmLeonardo\\Documents\\Cadastro-Cliente-JDBC-4Semestre\\"
				+ "LogicaDeProgramacao\\texto.txt");
		leitura();
	}

	/**
	 * Metodo, de leitura de arquivo; recebe um arquivo, passa em byte
	 */
	public void leitura() {
		try {
			byte[] retorno = Files.readAllBytes(arquivo);
			if (retorno.length >= 0) {
				System.out.println(new String(retorno));
				numeroLinhas = retorno.length;
			} else {
				System.err.println("N�mero de linha menor que zero");
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.err.println("\n\nProcesso finalizado.\n total de linhas :" + numeroLinhas);

		}

	}

	public static void main(String[] args) {
		new EntradaDados();
	}

}
