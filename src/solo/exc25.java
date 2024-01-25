package solo;

import java.util.Scanner;

public class exc25 {
	
	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o numero que deseja fazer fatorial: ");
		
		int num = entrada.nextInt();
		
		int fat = 1;
		for (int i = 1; i <= num; i++) {
			fat = fat * i;
		}
		
		System.out.println(fat);
		entrada.close();
		
	}

}
