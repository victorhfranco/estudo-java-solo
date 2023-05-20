package solo;

import java.util.Scanner;

public class exc3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Leônidas, quantos soldados iremos enfrentar?? ");
		int num = entrada.nextInt();
		if (num == 10000) {
			System.out.println("Correto! iremos enfrentar 10000!");
		} else {
			System.out.println("Errado! iremos enfrentar 10000!");
		}

		entrada.close();
	}

}
