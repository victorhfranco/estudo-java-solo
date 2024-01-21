package solo;

import java.util.Locale;
import java.util.Scanner;

public class exc37 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		int n, somapares = 0, npares = 0;
		double mediapares;

		System.out.print("Quantos elementos vai ter o vetor? ");
		n = entrada.nextInt();

		int[] vetor = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = entrada.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (vetor[i] % 2 == 0) {
				somapares = somapares + vetor[i];
				npares++;
			}
		}

		if (npares == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			mediapares = (double) somapares / npares;

			System.out.printf("MEDIA DOS PARES = %.1f\n", mediapares);
		}

		entrada.close();
	}

}
