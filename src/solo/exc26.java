package solo;

import java.util.Scanner;

public class exc26 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num = entrada.nextInt();
		
		for (int i = 1; i <= num; i++) {
			if(num % i == 0) {
				System.out.println(i);
			}
		}
		entrada.close();
	}

}
