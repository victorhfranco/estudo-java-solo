package solo;

import java.util.Locale;
import java.util.Scanner;

public class exc29 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite quantos numeros deseja armazenar para média:  ");
		
		int n = entrada.nextInt();
		double[] vect = new double[n];
		
		for (int i = 0; i < n; i++) {
			vect[i] = entrada.nextDouble();
		}
		
		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}
		
		double avg = sum / n;
		
		System.out.printf("Average height: %.2f%n", avg);
		
		entrada.close();
	}

}
