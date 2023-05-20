package poo.heranca;

public class Principal8 {
	
	public static void main(String[] args) {
		
		
		LivroDigital8 Id = new LivroDigital8("Senhor dos aneis", new Autor8("Tolkien",
				"Britanico", "tolkien@email.com"), "Aventura", 5, 10000, 3500);
		
		Id.info();
	}

}
