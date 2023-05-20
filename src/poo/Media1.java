package poo;

public class Media1 {
	
	public static void main(String[] args) {
		
		Media2 victor = new Media2();
		victor.n1 = 8;
		victor.n2 = 3;
		victor.n3 = 7.5;
		
		Media2 franco = new Media2(7, 4, 10);
		
		System.out.println("Media aritmética de Victor:  " + victor.mediaAritmetica());
		System.out.println("Media ponderada de Victor: " + victor.mediaPonderada());
		
		System.out.println("Media aritmética de Franco:  " + franco.mediaAritmetica());
		System.out.println("Media ponderada de Franco: " + franco.mediaPonderada());
	}
}
