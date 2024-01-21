package solo;

import java.util.Scanner;

public class exc27 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num = entrada.nextInt();

		
		for (int i = 1; i <= num; i++) {
			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			
			System.out.printf("%d %d %d %n", primeiro, segundo, terceiro);
		}
		
		entrada.close();
	}

}
