import java.util.*;

public class Problema_4 {

	public static void main(String[] args) {
		
		int suma_par=0, suma_impar=0, lista[] = new int[10];
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese 10 numeros enteros:");
		for(int i=0; i<lista.length; i++) {
			lista[i] = leer.nextInt();
		}
		
		for(int j=0; j<lista.length; j++) {
			if(lista[j]%2 == 0)
				suma_par += lista[j];
			else
				suma_impar += lista[j];
		}
		
		System.out.println("\nLa suma de numeros pares es: " + suma_par);
		System.out.println("La suma de numeros impares es: " + suma_impar);
	}
}