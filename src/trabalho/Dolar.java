package trabalho;

public class Dolar extends Moeda {
	
	private static double valorDolar = 5.06;
	
	public Dolar(double valorInicial) {
		this.valor = valorInicial;
	}
	
	@Override
	public void info() {
		System.out.println("Dólar: " + valor);
	}

	@Override
	public double converter() {
		return this.valor * valorDolar;
		
	}
	
	public boolean equals(Object objeto) {
		if(this.getClass() != objeto.getClass()) {
			return false;
		}
		
		Dolar objetoDeDolar = (Dolar) objeto;
		
		if(this.valor != objetoDeDolar.valor) {
			return false;
		}
		
		return true;
	}
}
