package solo;

import java.util.Scanner;

public class exc15 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int x = entrada.nextInt();
		String dia;
		
		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
		default: 
			dia = "valor inválido";
			break;
		}
		
		System.out.println("Dia da semana: " + dia);
		entrada.close();
	}
}
