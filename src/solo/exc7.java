package solo;

import java.util.Scanner;

public class exc7 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero para descobrir Par ou Impar: ");
		int num = entrada.nextInt();
		
		if(num%2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
		
		entrada.close();
		
	}

}
