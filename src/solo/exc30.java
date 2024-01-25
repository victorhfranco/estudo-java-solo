package solo;

import java.util.Locale;
import java.util.Scanner;

public class exc30 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		

		System.out.println("Quantos numeros você deseja digitar: ");
		int n = entrada.nextInt();

		int[] vetor = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Digite um numero: ");
			vetor[i] = entrada.nextInt();
		}

		System.out.println("Numeros negativos: ");
		
		for (int i = 0; i < n; i++) {
			if (vetor[i] < 0) {
				System.out.println(vetor[i]);
			}

		}

		entrada.close();
	}

}
