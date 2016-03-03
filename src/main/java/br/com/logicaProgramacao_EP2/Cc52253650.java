package br.com.logicaProgramacao_EP2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.StringTokenizer;

public class Cc52253650 {
	Path arquivoConjunto;
	Charset utf8;

	public Cc52253650() {
		this.arquivoConjunto = Paths.get("src\\main\\java\\br\\com\\logicaProgramacao_EP2\\matematica.txt");
		this.utf8 = StandardCharsets.UTF_8;
	}

	public void IO() {
		try (BufferedReader reader = Files.newBufferedReader(arquivoConjunto,
				utf8)) {
			String linha = reader.readLine();

			boolean b;

			// procura se tem ocorencia de uma palavra na string
			if (b = linha.matches(".*[u].*") == true) {
				Uniao uniao = new Uniao();
				uniao.quebraDeString(linha);
			} else if (b = linha.matches(".*[s].*") == true) {
				System.out.println(b);
			} else if (b = linha.matches(".*[i].*") == true) {
				System.out.println(b);
			}

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	class Uniao {
		StringTokenizer token;
		String string = "";
		String[] uniao;
		int[] bucket = new int[10];

		public void quebraDeString(String IO) {
			this.token = new StringTokenizer(IO);
			while (this.token.hasMoreTokens()) {
				string += this.token.nextToken(" { , }u ");
				uniao = string.split("");
			}

			int[] array = new int[uniao.length];
			for (int i = 0; i < uniao.length; i++) {
				if (uniao[i] != " ") {
					array[i] = Integer.parseInt(uniao[i]);
				}

			}
			for (int i = 0; i < array.length; i++) {
					bucket[array[i]] = 1;
                     System.out.println(Arrays.toString(bucket));
			}
			int linha = 0;
			for (int i = 0; i < bucket.length; i++) {

				if (bucket[i] == 1) {
					array[linha] = i;
					System.out.println(array[linha]);
					linha++;
				}
				System.out.println("fora do if "+array[linha]);
			}
		}
	}

	public static void main(String[] args) {
		Cc52253650 mcn = new Cc52253650();
		mcn.IO();
	}
}
