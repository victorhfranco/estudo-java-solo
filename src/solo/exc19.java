package solo;

import java.util.Scanner;

public class exc19 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite qual combustivel você deseja abastercer:"
				+ "\n1 - Álcool"
				+ "\n2 - Gasolina"
				+ "\n3 - Diesel"
				+ "\n4 - Fim");
		int num = entrada.nextInt();
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		while (num <= 4 || num >= 1) {
			if(num == 1) {
				System.out.println("Álcool: " + num);
				alcool = num + 1;
				num = entrada.nextInt();
			} else if(num == 2) {
				System.out.println("Gasolina: " + num);
				gasolina = num + 1;
				num = entrada.nextInt();
			} else if(num == 3) {
				System.out.println("Diesel" + num);
				diesel = num + 1;
				num = entrada.nextInt();
			} else {
				System.out.println("Muito Obrigado!");
			}
			
			break;
		}
		
		System.out.println("\nÁlcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		entrada.close();
		
	}

}
