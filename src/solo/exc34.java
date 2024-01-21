package solo;

import java.util.Locale;
import java.util.Scanner;

public class exc34 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		int n, posmaior;
		double maior;

		System.out.print("Quantos numeros voce vai digitar? ");
		n = entrada.nextInt();

		double[] vetor = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = entrada.nextDouble();
		}

		maior = vetor[0];
		posmaior = 0;

		for (int i = 1; i < n; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
				posmaior = i;
			}
		}

		System.out.printf("MAIOR VALOR = %.1f\n", maior);
		System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posmaior);

		entrada.close();
	}

}
