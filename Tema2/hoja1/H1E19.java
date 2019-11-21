package hoja1;

/*
Realizar un algoritmo que vaya pidiendo números enteros hasta que el usuario
introduzca un cero. Hay que ir visualizando cada uno de los números insertados,
excepto el 0. 
 */
public class H1E19 {

	public static void main(String[] args) {
		int numero;	
		int suma = 0;
		int contador = 0;
		numero = Metodo.getInt("Introduzca un número");
		while (numero != 0) {
			suma += numero;
			numero = Metodo.getInt("Introduzca otro número");
			contador++;	
		}
		System.out.println("La suma de los números introducidos es " + suma + "\n"
				+ "Has introducido " + contador + " números");	
	}
}
