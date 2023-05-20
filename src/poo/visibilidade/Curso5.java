package poo.visibilidade;

public class Curso5 {
	String nome;
	double mensalidade;

	public Curso5(String nome, double mensaliodade) {
		this.nome = nome;
		this.mensalidade = mensaliodade;
	}

	void info() {
		System.out.println("Nome curso: " + nome);
		System.out.println("Mensalidade curso: " + mensalidade);
	}

}
