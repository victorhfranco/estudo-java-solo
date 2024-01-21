package solo;

import java.util.Scanner;

public class exc16 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int x = entrada.nextInt();
		int soma = 0;
		
		while (x != 0) {
			soma += x;
			x = entrada.nextInt();
		}
		entrada.close();
		
		System.out.println(soma);
	}

}
