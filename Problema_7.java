import java.util.*;

public class Problema_7 {
	
	public static int pedir() {
		System.out.println("Ingrese un numero entero:\n");
		Scanner leer = new Scanner(System.in);
		return leer.nextInt();
	}
	
	public static int triple(int i) {
		return 3*i;
	}
	
	public static void main(String[] args) {
		int num, triple;
		
		num = pedir();
		triple = triple(num);
		
		System.out.println("El triple del numero es " + triple);
	}
}
