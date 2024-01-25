package poo2;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		Triangle x, y;
		x = new Triangle();
		y = new Triangle();

		System.out.println("Digite as dimensões do triangulo em X: ");
		x.a = entrada.nextDouble();
		x.b = entrada.nextDouble();
		x.c = entrada.nextDouble();

		System.out.println("Digite as dimensões do triangulo em Y: ");
		y.a = entrada.nextDouble();
		y.b = entrada.nextDouble();
		y.c = entrada.nextDouble();

		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Area X do triangulo: %.4f%n", areaX);
		System.out.printf("Area Y do triangulo: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Area: X");
		} else {
			System.out.println("Area: Y");
		}
		entrada.close();
	}

}
