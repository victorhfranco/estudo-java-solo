package solo;

import java.util.Scanner;

public class exc33 {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int n, qtdpares;

		System.out.print("Quantos numeros voce vai digitar? ");
		n = entrada.nextInt();

		int[] vetor = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = entrada.nextInt();
		}

		System.out.println("\nNUMEROS PARES:");

		qtdpares = 0;
		for (int i = 0; i < n; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.printf("%d  ", vetor[i]);
				qtdpares++;
			}
		}

		System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", qtdpares);

		entrada.close();
	}
}
