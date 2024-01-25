package solo;

import java.util.Locale;
import java.util.Scanner;

public class exc14 {
	
	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite quantos minutos utilizou: ");
		int num = entrada.nextInt();
		
		double conta = 50.0;
		
		if(num > 100) {
			conta += (num - 100) * 2.0;
		}
		
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
		
		entrada.close();
	}

}
