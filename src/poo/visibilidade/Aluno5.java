package poo.visibilidade;

public class Aluno5 {
	String nome;
	int matricula;
	double desconto;
	Curso5 curso5;
	
	
	public Aluno5(String nome, int matricula, double desconto, Curso5 curso5) {

		this.nome = nome;
		this.matricula = matricula;
		this.desconto = desconto;
		this.curso5 = curso5;
	}

	void info() {
		System.out.println("Nome aluno: " + nome);
		System.out.println("Matricula aluno: " + matricula);
		System.out.println("Desconto aluno: " + desconto);
		System.out.println("Pagamento aluno: " + pagamento());
		curso5.info();
	}
	

	double pagamento() {
		
		return curso5.mensalidade * (1 - desconto);
	}
}
