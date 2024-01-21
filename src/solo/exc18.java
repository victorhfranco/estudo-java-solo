package solo;

import java.util.Scanner;

public class exc18 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor de X: ");
		int x = entrada.nextInt();
		System.out.println("Digite o valor de Y: ");
		int y = entrada.nextInt();
		
		while (x != 0 && y !=0 ) {
			if(x > 0 && y > 0) {
				System.out.println("Primeiro");
			} else if(x < 0 && y > 0) {
				System.out.println("Segundo");
			} else if(x < 0 && y < 0) {
				System.out.println("Terceiro");
			} else {
				System.out.println("Quarto");
			}
			
			x = entrada.nextInt();
			y = entrada.nextInt();
		}
		
		entrada.close();
	}

}
