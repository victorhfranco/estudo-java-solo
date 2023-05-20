package poo.polimorfismo;

public class Principal2 {
	
	public static void main(String[] args) {
		
		Gato2 g1 = new Gato2();
		Animal2 a1 = new Gato2();
		
		g1.emitirSom();
		a1.emitirSom();
		
		g1.dormir();
		a1.dormir();
		
	}

}
