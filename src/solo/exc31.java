package solo;

import java.util.Locale;
import java.util.Scanner;

public class exc31 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		
		double soma, media;

		System.out.println("Quantos numeros você deseja digitar: ");
		int n = entrada.nextInt();

		double[] vetor = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Digite um numero: ");
			vetor[i] = entrada.nextDouble();
		}

		soma = 0;
		for (int i = 0; i < n; i++) {
			soma = soma + vetor[i];
		}

		media = soma / n;

		System.out.printf("VALORES = ");

		for (int i = 0; i < n; i++) {
			System.out.printf("%.1f  ", vetor[i]);
		}

		System.out.printf("\nSOMA = %.2f\n", soma);
		System.out.printf("MEDIA = %.2f\n", media);
		entrada.close();
	}

}
