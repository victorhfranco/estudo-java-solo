package solo;

import java.util.Scanner;

public class exc9 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o hor�rio 1");
		int horario1 = entrada.nextInt();
		
		System.out.println("Digite o hor�rio 2");
		int horario2 = entrada.nextInt();
		
		int durac�o;
		
		if(horario1 < horario2) {
			durac�o = horario2 - horario1;
		} else {
			durac�o = 24 - horario1 + horario2;
		} 
		
		System.out.println("O jogo durou " + durac�o + " hora(s)");
		
		entrada.close();
	}

}
