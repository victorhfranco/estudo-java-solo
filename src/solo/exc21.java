package solo;

import java.util.Scanner;

public class exc21 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite os numeros para descobrir os ímpares");
		int x = entrada.nextInt();

		for (int i = 1; i <= x; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		entrada.close();
		
	}

}
