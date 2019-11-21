package hoja1;

/*
Realizar un algoritmo que vaya pidiendo números enteros hasta que el usuario
introduzca un cero. Hay que ir visualizando cada uno de los números insertados,
excepto el 0. 
*/
public class H1E18 {

	public static void main(String[] args) {
		int numero;	
		numero = Metodo.getInt("Introduzca un número");
		while (numero != 0) {
			numero = Metodo.getInt("Su número es " + numero + "\n"
					+ "Introduzca otro número");
		}
	}
}
