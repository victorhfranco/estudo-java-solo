package poo;

public class Conta3 {

	int numero;
	String titular;
	double saldo;
	double limite;
	int transferir;

	public Conta3(int numero, String titular, double saldo, double limite) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limite = limite;
	}

	boolean sacar(double valor) {
		if (valor > limite || valor > saldo || valor <= 0) {
			return false;
		}

		saldo -= valor;
		return true;

	}

	boolean depositar(double valor) {
		if (valor <= 0) {
			return false;
		}

		saldo += valor;
		return true;
	}

	boolean transferir(Conta3 outra, double valor) {
		if (!this.sacar(valor)) {
			return false;
		}

		outra.depositar(valor);
		return true;
	}

	void info() {
		System.out.println("Nome: " + titular);
		System.out.println("Numero: " + numero);
		System.out.println("Saldo: " + saldo);
		System.out.println("Limite: " + limite);
	}
}
