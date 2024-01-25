package poo2;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = entrada.nextLine();
		
		System.out.print("Price: ");
		double price = entrada.nextDouble();
		
		System.out.print("Quantity in stock: ");
		int quantity = entrada.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		System.out.println("\nProduct data: " + product);
		
		System.out.println("\nEnter the number of products to be add in stock: ");
		quantity = entrada.nextInt();
		product.addProducts(quantity);
		System.out.println("\nUpdate data: " + product);
		
		System.out.println("\nEnter the number of products to be remove in stock: ");
		quantity = entrada.nextInt();
		product.removeProducts(quantity);
		System.out.println("\nUpdate data: " + product);
		entrada.close();
	}

}
