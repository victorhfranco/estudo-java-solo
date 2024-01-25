package solo;

import java.util.Locale;
import java.util.Scanner;

public class exc23 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a quantidade de 3 notas, após isso as notas!");
		int num = entrada.nextInt();
		
		for (int i = 0; i < num; i++) {
			
			double a = entrada.nextDouble();
			double b = entrada.nextDouble();
			double c = entrada.nextDouble();
			
			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
			System.out.printf("%.1f%n", media);
		}
	
		entrada.close();
	}

}
