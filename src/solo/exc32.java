package solo;

import java.util.Locale;
import java.util.Scanner;

public class exc32 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		int n, nmenores;
		double alturatotal, alturamedia, percentualMenores;

		System.out.print("Quantas pessoas ser�o digitadas? ");
		n = entrada.nextInt();

		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			nomes[i] = entrada.next();
			System.out.print("Idade: ");
			idades[i] = entrada.nextInt();
			System.out.print("Altura: ");
			alturas[i] = entrada.nextDouble();
		}

		nmenores = 0;
		alturatotal = 0;
		for (int i = 0; i < n; i++) {
			if (idades[i] < 16) {
				nmenores++;
			}
			alturatotal = alturatotal + alturas[i];
		}

		alturamedia = alturatotal / n;
		percentualMenores = ((double) nmenores / n) * 100.0;

		System.out.printf("\nAltura media = %.2f\n", alturamedia);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

		for (int i = 0; i < n; i++) {
			if (idades[i] < 16) {
				System.out.printf("%s\n", nomes[i]);
			}
		}

		entrada.close();
	}
}
