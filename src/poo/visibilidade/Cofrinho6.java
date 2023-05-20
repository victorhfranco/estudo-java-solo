package poo.visibilidade;

import java.util.ArrayList;

public class Cofrinho6 {
	
	private ArrayList<Moeda6> moedas = new ArrayList<Moeda6>();

	public void add(Moeda6 m) {
		moedas.add(m);
	}
	
	public double calcularTotal() {
		double total = 0;
		for(Moeda6 m : moedas) {
			total += m.getValor();
		}
		
		return total;
	}
}
