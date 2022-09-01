import java.util.*;

public class Problema_10 {
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		int estudiantes, promedio=0, arriba_promedio=0, calificaciones[];
		
		System.out.println("Especifique el numero de estudiantes del grupo:");
		estudiantes = leer.nextInt();
		calificaciones = new int[estudiantes];
		
		System.out.println("\nIngrese las calificaciones:");
		
		for(int i=0; i<estudiantes; i++) {
			calificaciones[i] = leer.nextInt();
			promedio += calificaciones[i];
			if(i==(estudiantes-1))
					promedio /= estudiantes;
		}
		
		for(int i=0; i<estudiantes; i++) {
			if(calificaciones[i]>promedio)
					arriba_promedio +=1;
		}
		
		System.out.println("El promedio es: " + promedio);
		System.out.println("Cantidad de alumnos arriba del promedio: " +
		arriba_promedio);
	}
}