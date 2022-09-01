import java.util.*;

public class Problema_11 {
	public static void main(String[] args) {
		
		int tabla[][] = new int[5][5], mayor;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese 25 numeros enteros:");
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				tabla[i][j] = leer.nextInt();
			}
		}
		
		mayor = tabla[0][0];
		
		for(int k=0; k<5; k++) {
			for(int l=0; l<5; l++) {
				if(tabla[k][l] > mayor)
					mayor = tabla[k][l];
			}
		}
			
		System.out.println("\nEl numero mayor es " + mayor);
	}
}