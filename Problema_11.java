import java.util.*;

public class Problema_11 {
	public static void main(String[] args) {
		
		int tabla[] = new int[25], mayor;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese 25 numeros enteros:");
		for(int i=0; i<25; i++){
			tabla[i] = leer.nextInt();
		}
		
		mayor = tabla[0];
		for(int j=0; j<25; j++) {
			if(tabla[j] > mayor)
				mayor = tabla[j];
		}
			
		System.out.println("\nEl numero mayor es " + mayor);
	}
}
