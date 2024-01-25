package solo;

import java.util.Locale;
import java.util.Scanner;

public class exc35 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		int n;

		System.out.print("Quantos valores vai ter cada vetor? ");
		n = entrada.nextInt();

		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];

		System.out.println("Digite os valores do vetor A:");

		for (int i = 0; i < n; i++) {
			a[i] = entrada.nextInt();
		}

		System.out.println("Digite os valores do vetor B:");

		for (int i = 0; i < n; i++) {
			b[i] = entrada.nextInt();
		}

		for (int i = 0; i < n; i++) {
			c[i] = a[i] + b[i];
		}

		System.out.println("VETOR RESULTANTE:");

		for (int i = 0; i < n; i++) {
			System.out.printf("%d\n", c[i]);
		}

		entrada.close();
	}

}
