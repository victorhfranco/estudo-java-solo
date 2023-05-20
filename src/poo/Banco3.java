package poo;

public class Banco3 {
	public static void main(String[] args) {

		Conta3 c1 = new Conta3(111, "Mario", 2000, 500);

		c1.info();

		c1.depositar(500);
		System.out.println("\n");
		c1.info();

		c1.sacar(200);
		System.out.println("\n");
		c1.info();

		Conta3 c2 = new Conta3(222, "Luigi", 4000, 600);
		System.out.println("\n");
		c1.transferir(c2, 2000);
		c1.info();
		System.out.println("\n");
		c2.info();
	}

}
