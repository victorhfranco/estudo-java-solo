package poo;

public class Nota4 {

	private double nota1;
	private double nota2;
	private int faltas;

	public Nota4(double nota1, double nota2, int faltas) {
		setNota1 (nota1);
		setNota1 (nota2);
		setFaltas (faltas);
	}

	public Nota4() {

	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		if (nota1 < 0 || nota1 > 10) {
			System.out.println("Nota inválida!");
		}
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		if (nota2 < 0 || nota2 > 10) {
			System.out.println("Nota inválida!");
		}
		this.nota2 = nota2;
	}

	void resultado() {

		double media = (nota1 + nota2) / 2;
		System.out.println("Media: " + media);

		if (faltas > 7) {
			System.out.println("Reprovado por faltas..");
		} else if (media < 4) {
			System.out.println("Reprovado!\n");
		} else if (media < 7) {
			System.out.println("Exame final!\n");
		} else {
			System.out.println("Aprovado!!\n");
		}
	}

}
