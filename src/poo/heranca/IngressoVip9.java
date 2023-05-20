package poo.heranca;

public class IngressoVip9 extends Ingresso9 {

	double adicional;
	
	public IngressoVip9(String nomeEvento, double valor, double adicional) {
		super(nomeEvento, valor);
		this.adicional = adicional;
	}

	@Override
	public void info() {
		super.info();
		System.out.println("Valor adicional VIP: " + adicional);
		System.out.println("Total do ingresso: " + (valor + adicional));
	}
}
