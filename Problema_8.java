import java.util.*;

public class Problema_8 {
	public static void main(String[] args) {
		
		double precio;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese el precio del traje:\n");
		precio = leer.nextFloat();
		
		if(precio>2500)
			precio *= .85;
		else
			precio *= .92;
			
		System.out.println("El precio del traje es $" + precio);
	}
}
