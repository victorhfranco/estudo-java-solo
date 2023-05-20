package poo.heranca;

public class Principal9 {

	public static void main(String[] args) {
		
		IngressoVip9 iv = new IngressoVip9("Rock in Rio", 200, 100);
		iv.info();
		
		System.out.printf("\n");
		
		Ingresso9 in = new Ingresso9("João Rock", 120);
		in.info();
	}
}
