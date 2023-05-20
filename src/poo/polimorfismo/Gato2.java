package poo.polimorfismo;

public class Gato2 implements Animal2 {

	@Override
	public void emitirSom() {
		System.out.println("Miau!");
	}

	@Override
	public void dormir() {
		System.out.println("Zzzz");
	}

	
}
