package poo2;


import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class RetanguloTeste {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		Rectangle rect = new Rectangle();
		
		
		System.out.println("Enter rectangle width and height: ");
		rect.widht = entrada.nextDouble();
		rect.height = entrada.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rect.area());
		System.out.printf("PERIMETER = %.2f%n", rect.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());

		entrada.close();
		
	}

}
