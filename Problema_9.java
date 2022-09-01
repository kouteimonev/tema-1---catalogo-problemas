import java.util.*;

public class Problema_9 {
	
	static int esPar(int i) {
		return i%2;
	}
	
	public static void main(String[] args) {
		
		int num;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese un numero entero:");
		num = esPar(leer.nextInt());
		
		if(num == 0)
			System.out.println("\nEl numero es par.");
		else
			System.out.println("\nEl numero es impar.");
	}
}