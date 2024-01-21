package solo;

import java.util.Locale;
import java.util.Scanner;

public class excStatic {
	
	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		System.out.println("Enter radius: ");
		double radius = entrada.nextDouble();
		
		double c = excStaticUtil.circumference(radius);
		double v = excStaticUtil.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", excStaticUtil.PI);
		
		entrada.close();
	}
	
}
