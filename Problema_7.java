import java.util.*;

public class Problema_7 {

	Scanner leer = new Scanner(System.in);
	
	int pedir() {
		System.out.println("Ingrese un numero entero:");
		return leer.nextInt();
	}
	
	int triple(int i) {
		return 3*i;
	}
	
	public void main(String[] args) {
		int num;
		
		num = pedir();
		System.out.println(num);
		
		System.out.println("Ingrese un numero:");
		num = triple(leer.nextInt());
		System.out.println(num);
	}
}
