package solo;

import java.util.Locale;
import java.util.Scanner;

public class exc36 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		int n;
		double soma, media;

		System.out.print("Quantos elementos vai ter o vetor? ");
		n = entrada.nextInt();

		double[] vetor = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = entrada.nextDouble();
		}

		soma = 0;
		for (int i = 0; i < n; i++) {
			soma = soma + vetor[i];
		}

		media = soma / n;

		System.out.printf("\nMEDIA DO VETOR = %.3f\n", media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");

		for (int i = 0; i < n; i++) {
			if (vetor[i] < media) {
				System.out.printf("%.1f\n", vetor[i]);
			}
		}

		entrada.close();
	}

}
