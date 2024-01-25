package poo2;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class AlunoTeste {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		Aluno aluno = new Aluno();
		System.out.println("Digite o nome do aluno: ");
		aluno.nome = entrada.nextLine();

		System.out.println("Digite as 3 notas do aluno: ");
		aluno.nota1 = entrada.nextDouble();
		aluno.nota2 = entrada.nextDouble();
		aluno.nota3 = entrada.nextDouble();

		System.out.printf("Final GRADE %.2f%n", aluno.finalGrade());

		if (aluno.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", aluno.missingPoints());
		} else {
			System.out.println("PASS!");
		}

		entrada.close();
	}

}
