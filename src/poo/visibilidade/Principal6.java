package poo.visibilidade;

public class Principal6 {
	
	public static void main(String[] args) {
		Cofrinho6 c = new Cofrinho6();
		
		c.add(new Moeda6("Euro", 0.5));
		c.add(new Moeda6("Euro", 1));
		c.add(new Moeda6("Euro", 0.1));
		c.add(new Moeda6("Euro", 0.05));
		
		System.out.printf("Total no cofre: %.2f \n", c.calcularTotal());
	}

}
