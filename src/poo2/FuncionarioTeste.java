package poo2;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class FuncionarioTeste {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		Employee employee = new Employee();
		System.out.println("Name: ");
		employee.name = entrada.nextLine();
		
		System.out.println("Gross Salary: ");
		employee.grossSalary = entrada.nextDouble();
		
		System.out.println("Tax: ");
		employee.tax = entrada.nextDouble();
		
		System.out.println("Employee: " + employee);
		
		System.out.println("Wich percentage to increase salary: ");
		double percentage = entrada.nextDouble();
		employee.increaseSalary(percentage);
		System.out.println("\nUpdate data: " + employee);
		
		entrada.close();
	}

}
