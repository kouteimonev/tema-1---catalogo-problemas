import java.util.*;

public class Problema_9 {
	
	static int esPar(int i) {
		if(i%2 == 0)
			return 0;
		else
			return 1;
	}
	
	public static void main(String[] args) {
		int num;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese un numero entero:");
		
		num = esPar(leer.nextInt());
		
		System.out.println(num);
	}
}
