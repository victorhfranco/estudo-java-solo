package solo;

import java.util.Scanner;

public class exc6 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um valor P/N: ");
		int num = entrada.nextInt();
		
		if (num > 0) {
			System.out.println("Positivo");
		} else {
			System.out.println("Negativo");
		}
		
		entrada.close();
	}

}
