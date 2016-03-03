package br.com.logicaProgramacao_EP1;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * EP 01
 * 
 * ControleHormonio, faz o elo de ligação com os objeto logs.
 * 
 * Path arquivo --> responsavel de leer o arquivo da maquina (logHorm).
 * 
 * Path coor --> responsavel de leer o arquivo da maquina (coordenadas de
 * pesquisa).
 * 
 * Charset utf8 --> escrita de origem
 * 
 * hormonios[][] ---> array multidimencional de Strings, responsalvem por
 * armazenar o arquivo logHorms.
 * 
 * coordenas[]--> responsavel por guarda as coordenadas de pesquisa, no array de
 * hormonios.
 * 
 * quebra [] = responsalvel por pegar as quebras das linhas, do arquivos, e
 * passar estás para o array hormoninos, nas sua respectiva linha.
 * 
 * int contador--> contador, cada laço do while, entende que passou mais uma
 * linha, da leitura do arquivo.
 * 
 * @category Lógica de Programação Prof. Alexandre Locci.
 * 
 * @author BmLeonardo
 * @author Andriotti
 */
public class ControleHormonio {

	Path arquivo;
	Path coor;
	Charset utf8;
	String[][] hormonios = new String[100000][100];
	String[] coordenada;
	String[] quebra;
	int contador = 0;

	public ControleHormonio() {
		this.arquivo = Paths.get(
				"C:\\Users\\BmLeonardo\\Desktop\\Leonardo -CFC\\workspace\\logica_programacao\\src\\main\\java\\br\\com\\logicaProgramacao_2\\logHorm.txt");
		this.coor = Paths.get(
				"C:\\Users\\BmLeonardo\\Desktop\\Leonardo -CFC\\workspace\\logica_programacao\\src\\main\\java\\br\\com\\logicaProgramacao_2\\coor.txt");
		this.utf8 = StandardCharsets.UTF_8;
	}

	/**
	 * Objeto logs, é responsavel pela leitura do arquivo e quebra do arquivo em
	 * parte, para array de hormonios.
	 * 
	 * @return --> array de hormonios[][];
	 */

	public String[] logs() {
		try {

			BufferedReader readerHorm = Files.newBufferedReader(arquivo, utf8);
			BufferedReader readerCoor = Files.newBufferedReader(coor, utf8);

			/* passando as coordenadas para um array */
			String cord = readerCoor.readLine();
			this.coordenada = cord.split(" ");

			String linha = null;

			while ((linha = readerHorm.readLine()) != null) {
				this.quebra = linha.split(" ");
				for (int i = 0; i < quebra.length; i++) {
					this.hormonios[contador][i] = quebra[i];
				}
				contador++;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return this.coordenada;

	}

	public void leituraLogHorm(String[] coor) {

		for (int i = 0; i < coor.length; i++) {
			try {

				int posX = Integer.parseInt(coor[i]);
				int posY = Integer.parseInt(coor[i = i + 1]);

				// System.out.println(posX +" pos x");
				// System.out.println(posY +" pos y");
				if (this.hormonios[posX][posY] != null) {
					System.out.print(this.hormonios[posX][posY]);

				}

			} catch (ArrayIndexOutOfBoundsException e) {
				System.err.println(-1);
			}
		}
	}

	public static void main(String[] args) {
		ControleHormonio horm = new ControleHormonio();
		String[] homoniosColetados = horm.logs();
		horm.leituraLogHorm(homoniosColetados);
	}
}
