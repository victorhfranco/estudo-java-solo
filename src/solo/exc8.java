package solo;

import java.util.Scanner;

public class exc8 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite dois valores e descobra se � multiplo: ");
		
		System.out.println("Valor A: ");
		int num1 = entrada.nextInt();
		
		System.out.println("Valor B: ");
		int num2 = entrada.nextInt();
		
		if(num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.println("S�o multiplos.");
		} else {
			System.out.println("N�o s�o multiplos.");
		}
		entrada.close();
	}

}
