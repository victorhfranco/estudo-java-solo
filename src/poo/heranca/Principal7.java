package poo.heranca;

public class Principal7 {
	
	public static void main(String[] args) {
		Livro7 l1 = new Livro7("GOT", "George R. R. Martin");

		
		LivroDigital7 l2 = new LivroDigital7("GOT", "George R. R. Martin", "http://meusite/got");
		System.out.println(l1 instanceof Livro7);
		System.out.println(l2 instanceof Livro7);
		System.out.println(l1 instanceof LivroDigital7);
		System.out.println(l2 instanceof LivroDigital7);
		
		
	}
}
