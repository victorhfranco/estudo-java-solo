package solo;

import java.util.Scanner;

public class exc24 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num = entrada.nextInt();

		for (int i = 0; i < num; i++) {

			int x = entrada.nextInt();
			int y = entrada.nextInt();

			if (y == 0) {
				System.out.println("Divisão impossível");
			} else {
				double div = (double) x / y;
				System.out.printf("%1.f%n", div);
			}
		}

		entrada.close();

	}

}
