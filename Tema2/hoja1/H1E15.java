package hoja1;

/*
Una tienda ofrece un descuento del 15% sobre el total de la compra durante el mes
de octubre. Dado un mes y un importe, calcular cuál es la cantidad que se debe
cobrar al cliente. 
 */
public class H1E15 {

	public static void main(String[] args) {
		double precio;
		int mes;
		precio = Metodo.getInt("Introduzca un precio");
		mes = Metodo.getInt("Introduzca el mes de la compra");
		while (mes < 1 || mes > 12) {
			mes = Metodo.getInt("Ese mes no es válido. Introduce un mes válido");
		}
		if (mes == 10) {
			System.out.println("El precio con descuento es " + (precio * 0.85));
		}
		else System.out.println("El precio es " + precio);
		
	}
}
