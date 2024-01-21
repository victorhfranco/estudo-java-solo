package solo;

import java.util.Locale;
import java.util.Scanner;

public class exc28 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a temperatura em Celsius: ");
		double c = entrada.nextDouble();
		
		double f = 9.0 * c / 5.0 + 32.0;
		System.out.printf("Equivalente em Fahrenheit: %1f%n", f);
		
		entrada.close();
		
	}

}
