package solo;

import java.util.Scanner;

public class exc9 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o horário 1");
		int horario1 = entrada.nextInt();
		
		System.out.println("Digite o horário 2");
		int horario2 = entrada.nextInt();
		
		int duracão;
		
		if(horario1 < horario2) {
			duracão = horario2 - horario1;
		} else {
			duracão = 24 - horario1 + horario2;
		} 
		
		System.out.println("O jogo durou " + duracão + " hora(s)");
		
		entrada.close();
	}

}
