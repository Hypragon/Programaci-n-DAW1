package hoja1;

/*
Escribir un programa que vaya pidiendo números hasta que el usuario introduzca un
cero. Debe mostrar por pantalla los números que introduce en las posiciones
impares pero no en las pares, es decir, el primero, tercero, quinto, séptimo, ... que
inserte deben mostrase, pero el segundo, cuarto, sexto, octavo, ... no deben
mostrarse por pantalla.
Para realizar este ejercicio piensa que pueden anidarse sentencias de repetición con
sentencias de selección. 
 */
public class H1E20 {

	public static void main(String[] args) {
		int numero, contador = 0;
		numero = Metodo.getInt("Introduce un número");
		while (numero != 0) {
			contador++;	
			if (contador % 2 != 0) {
				System.out.println("Su número es " + numero);
			}
			numero = Metodo.getInt("Introduce otro número");
		}
	}
}
