package solo;

import java.util.Scanner;

public class exc20 {
	
	public static void main(String[] args) {
		
		 Scanner entrada = new Scanner(System.in);
		 int num = entrada.nextInt();
		 
		 int soma = 0;
		 
		 for (int i = 0; i < num; i++) {
			int x = entrada.nextInt();
			soma += x;
			
		}
		 
		 System.out.println(soma);
		entrada.close();
	}

}
