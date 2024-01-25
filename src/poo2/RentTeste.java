package poo2;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class RentTeste {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		System.out.println("How many roomsm wil be rented? ");
		int n = entrada.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("\nRent #" + i + ":");
			System.out.println("Name: ");
			entrada.nextLine();
			String name = entrada.nextLine();
			System.out.println("Email: ");
			String email = entrada.next();
			System.out.println("Room: ");
			int roomNumber = entrada.nextInt();
			
			Rent rent = new Rent(name, email);
			vect[roomNumber] = rent;
		}
		
		
		System.out.println("\nBusy rooms: ");
		for (int i = 0; i < 10; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i]);				
			}
		}
		
		entrada.close();
	}

}
