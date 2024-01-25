package solo;

public class exc41 {
	
	public static void main(String[] args) {
		
		String [] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("\nOPC2\n");
		for (String obj : vect) {
			System.out.println(obj);
			
		}
	}

}
