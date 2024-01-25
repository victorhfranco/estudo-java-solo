package poo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.RegistroList;

public class RegistroListTeste {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		List<RegistroList> list = new ArrayList<>();
		
		System.out.println("How many employess will be registred? ");
		int N = entrada.nextInt();
		
		for (int i = 0; i < N; i++) {
			System.out.println("Employee #" + (i + 1) + ": ");
			System.out.println("ID: ");
			Integer id = entrada.nextInt();
			
			System.out.println("Name: ");
			entrada.nextLine();
			String name = entrada.nextLine();
			
			System.out.println("Salary: ");
			Double salary = entrada.nextDouble();
			
			RegistroList registro = new RegistroList(id, name, salary);
			
			list.add(registro);
			
		}
		
		System.out.println("Enter the employee id that will have salary increasse: ");
		int idsalary = entrada.nextInt();
		Integer pos = position(list, idsalary);
		if (pos == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.println("Enter the percentage: ");
			double percent = entrada.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for (RegistroList registro : list) {
			System.out.println(registro);
		}
		
		entrada.close();
	}
	
	public static Integer position(List<RegistroList> list, int id) {
		for( int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		
		return null;
	}

}
