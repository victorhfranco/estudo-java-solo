package poo;

public class Principal4 {
	public static void main(String[] args) {
		
		Nota4 Mario = new Nota4();
		Nota4 Luigi = new Nota4(8, 8, 5);
	
		System.out.println("Media Luigi");
		Luigi.resultado();
	
		
		Mario.setNota1(9);
		Mario.setNota2(10);
		Mario.setFaltas(5);
		Mario.resultado();
		
		
		Mario.setNota1(2);
		Mario.setFaltas(10);
		Mario.resultado();
	}

}
