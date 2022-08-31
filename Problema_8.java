import java.util.*;

public class Problema_8 {
	
	public static void main(String[] args) {
		
		double precio, descuento;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese el precio del traje:");
		precio = leer.nextDouble();
		descuento = precio(precio);
					
		System.out.println("El precio del traje es $" + descuento);
	}
	
	public static double precio(double costo) {
		if(costo>2500)
			costo *= .85;
		else
			costo *= .92;
		
		return costo;
	
	}
}
