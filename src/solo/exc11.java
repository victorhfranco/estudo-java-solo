package solo;

import java.util.Locale;
import java.util.Scanner;

public class exc11 {
	
	public static void main(String[] args) {
		 
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor para saber o intervalo");
		double num = entrada.nextDouble();
		
		
		if(num < 0.0 || num > 100.0) {
			System.out.println("Fora do intervalo!");
		} else if(num <= 25.0) {
			System.out.println("Intervalo (0,25)");
		} else if(num <= 50) {
			System.out.println("Intervalo (25,50)");
		} else if(num <= 75) {
			System.out.println("Intervalo (50,75)");
		} else {
			System.out.println("Intervalo (75,100)");
		}
		
		
		entrada.close();
		
	}

}
