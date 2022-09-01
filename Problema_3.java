import java.util.*;

public class Problema_3 {
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		int num[] = new int[5], mayor;
		
		System.out.println("Ingrese 5 numeros:");
		for(int i=0; i<5; i++) {
			num[i] = leer.nextInt();
		}
		
		mayor = num[0];
		for(int j=1; j<5; j++) {
			if(num[j] > mayor)
				mayor = num[j];
		}
		
		System.out.println("\nEl numero mayor es " + mayor);
	}
}