package solo;

import java.util.Scanner;

public class exc2 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu peso: ");
		int peso = entrada.nextInt();
		
		System.out.println("Digite sua altura: ");
		double alt = entrada.nextDouble();
		
		double imc = peso / (alt * alt);
		System.out.println("Seu IMC é equivalente a " + imc);
		entrada.close();
	}

}
