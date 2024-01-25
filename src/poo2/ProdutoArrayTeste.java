package poo2;

import java.util.Locale;
import java.util.Scanner;

import entities.ProdutoArray;

public class ProdutoArrayTeste {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o numero de produtos em estoque para a média:"
				+ "\nNome e preço.");
		int n = entrada.nextInt();
		
		ProdutoArray[] vect = new ProdutoArray[n];
		
		for (int i = 0; i < vect.length; i++) {
			entrada.nextLine();
			String name = entrada.nextLine();
			double price = entrada.nextDouble();
			vect[i] = new ProdutoArray(name, price);
		}
		
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("AVAREGE PRICE = %.2f%n", avg);
		
		entrada.close();
	}

}
