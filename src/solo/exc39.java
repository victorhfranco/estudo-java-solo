package solo;

import java.util.Locale;
import java.util.Scanner;

public class exc39 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		int n;
		double media;

		System.out.print("Quantos alunos serao digitados? ");
		n = entrada.nextInt();

		String[] nomes = new String[n];
		double[] notas1 = new double[n];
		double[] notas2 = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i + 1);
			entrada.nextLine();
			nomes[i] = entrada.nextLine();
			notas1[i] = entrada.nextDouble();
			notas2[i] = entrada.nextDouble();
		}

		System.out.println("Alunos aprovados:");

		for (int i = 0; i < n; i++) {
			media = (notas1[i] + notas2[i]) / 2;

			if (media >= 6.0) {
				System.out.printf("%s\n", nomes[i]);
			}
		}

		entrada.close();
	}

}
