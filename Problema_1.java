import java.util.*;

public class Problema_1 {
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		int num[] = new int[5];
		
		System.out.println("Ingrese 5 numeros:");
		for(int i=0; i<5; i++) {
			num[i] = leer.nextInt();
		}
		
		System.out.println("\nLos numeros en la lista son:");
		for(int j=0; j<5; j++) {
			System.out.println(num[j]);
		}
		
	}
}