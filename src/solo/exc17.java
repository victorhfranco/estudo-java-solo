package solo;

import java.util.Scanner;

public class exc17 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a senha para acesso: ");
		int num = entrada.nextInt();
		
		
		while (num != 2002) {
			System.out.println("Senha inválida");
			num = entrada.nextInt();
		}
		
		System.out.println("Acesso permitido!");
		entrada.close();
	}

}
