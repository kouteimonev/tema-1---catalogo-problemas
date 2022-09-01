import java.util.*;

public class Problema_5 {
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		int tabla[][] = new int[3][2];
		
		System.out.println("Ingrese 6 numeros:");
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				tabla[i][j] = leer.nextInt();
			}
		}
		
		System.out.println("\nLos numeros en la tabla son:");
		for(int k=0; k<3; k++) {
			for(int l=0; l<2; l++) {
				System.out.print(tabla[k][l] + " ");
			}
			System.out.println();
		}
	}
}