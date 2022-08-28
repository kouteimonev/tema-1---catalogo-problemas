import java.util.*;

public class Problema_6 {
	public static void main(String[] args) {
		
		int sumas[]=new int[3], tabla[][]=new int[3][2];
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese 6 numerso enteros:\n");
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				tabla[i][j] = leer.nextInt();
			}
			sumas[i] = 0;
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				sumas[i] += tabla[i][j];
			}
			System.out.println("La suma de fila "+ (i+1) +" es " + sumas[i]);
		}
	}
}
