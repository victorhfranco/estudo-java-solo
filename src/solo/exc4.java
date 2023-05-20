package solo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exc4 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		ArrayList<String> listaNomes = new ArrayList<String>();
		System.out.println("Digite a quantidade de nomes: ");
		int qntd = entrada.nextInt();
		String nome;
		
		for (int i = 0; i < qntd; i++) {	
			nome = entrada.next();
			listaNomes.add(nome);
		}
		
		/*for (int i = listaNomes.size() -1; i >= 0; i--) {
			System.out.println(listaNomes.get(i));
		}*/
		
		System.out.println("Ordem normal: ");
		System.out.println(listaNomes);
		
		Collections.reverse(listaNomes);
		
		System.out.println("Ordem reversa: ");
		System.out.println(listaNomes);
		
		entrada.close();
	}
}	