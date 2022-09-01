import java.util.*;

public class Problema_2 {
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		int num[] = new int[5], promedio = 0;
		
		System.out.println("Ingrese 5 numeros:");
		for(int i=0; i<5; i++) {
			num[i] = leer.nextInt();
		}
		
		for(int j=0; j<5; j++) {
			promedio += num[j];
		}
		promedio /= 5;
		
		System.out.println("\nEl promedio de los valores es " + promedio);
	}
}