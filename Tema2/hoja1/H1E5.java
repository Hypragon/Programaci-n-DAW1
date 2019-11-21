package hoja1;

//Algoritmo que pida un nombre y apellido y que muestre nombre y apellidos concatenados. 
public class H1E5 {

	public static void main(String[] args) {
		String nombre, apellido;
		nombre = Metodo.getString("Escribe tu nombre.");
		apellido = Metodo.getString("Escribe tu apellido.");
		System.out.println("Te llamas " + nombre + " " + apellido);
	}
}
