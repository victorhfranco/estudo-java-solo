package poo;

public class Principal {
	
	public static void main(String[] args) {
		Aluno a = new Aluno();
		a.cpf = "111.222.333";
		a.nome = "Super Mario";
		a.matricula = 1001;
		
		a.info();
		Aluno b = new Aluno(1002, "Super Luigi", "222.333.444");
		b.info();
		
		Aluno c = new Aluno(1003);
		c.info();
		
		
	}
	

}
