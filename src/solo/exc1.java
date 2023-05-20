package solo;

import java.util.Scanner;

public class exc1 {

	public static void main(String[] args) {

		String nome;
		int idade;
		int saida = 1;

		do {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o nome da criança: ");
		nome = entrada.next();

		System.out.println("Idade: ");
		idade = entrada.nextInt();

		if (idade <= 5) {
			System.out.println("O aluno " + nome + " tem " + idade + " anos e está no Ensino infantil");
		} else if (idade <= 10) {
			System.out.println("O aluno " + nome + " tem " + idade + " anos e está no Ensino Fundamental I");
		} else if (idade <= 14) {
			System.out.println("O aluno " + nome + " tem " + idade + " anos e está no Ensino Fundamental II");
		} else if (idade >= 15) {
			System.out.println("O aluno " + nome + " tem " + idade + " anos e está no Ensino médio");
		}

		System.out.println("Deseja continuar? 0-NÃO 1-SIM: ");
		saida = entrada.nextInt();
		} while(saida == 1);
		System.out.println("Saindo do programa...");
	}
}