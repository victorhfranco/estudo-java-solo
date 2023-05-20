package solo;

import java.util.Scanner;

public class exc5 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a nota 1: ");
		int nota1 = entrada.nextInt();
		
		System.out.println("Digite a nota 2: ");
		int nota2 = entrada.nextInt();
		
		System.out.println("Digite a nota 3: ");
		int nota3 = entrada.nextInt();
		
		System.out.println("Qual média você deseja calcular? ");
		System.out.println("Digite 1 - Aritmética ");
		System.out.println("Digite 2 - Ponderada ");
		int num = entrada.nextInt();
		if (num == 1) {
			double arit = (nota1 + nota2 + nota3) / 3;
			System.out.println("Resultado é aritmética é " + arit);
		} else {
			double ponde = ((nota1 * 2) + (nota2 * 3) + (nota3 * 4)) / 9;
			System.out.println("Resultado da média ponderada é " + ponde);
		}
		
		entrada.close();
	}

}
