package solo;

import java.util.Scanner;

public class exc10 {
	
	public static void main(String[] args) {
		
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escolha o pedido");
		System.out.println("Pedido:");
		int p1 = entrada.nextInt();
		
		System.out.println("Quantidade:");
		int quant = entrada.nextInt();
		
		double total = 0;
		
		if(p1 == 1) {
			total = quant * 4;
		}else if (p1 == 2) {
			total = quant * 4.50;
		}else if (p1 == 3) {
			total = quant * 5;
		}else if (p1 == 4) {
			total = quant * 2;
		}else if (p1 == 5) {
			total = quant * 1.50;
		}
		
		System.out.println("Total: " + total);
		
		entrada.close();
	}
}
