package poo.heranca;

public class Ingresso9 {
	
	String nomeEvento;
	double valor;
	
	public Ingresso9(String nomeEvento, double valor) {
		super();
		this.nomeEvento = nomeEvento;
		this.valor = valor;
	}

	void info() {
		System.out.println("Nome evento: " + nomeEvento);
		System.out.println("Valor ingresso: " + valor);
	}

}
