package hoja2;

import hoja1.Metodo;

//Dado un numero n imprimir la lista de todos los numero primos hasta dicho numero n
public class H2E14 {

	public static void main(String[] args) {
		int numero, contador;
		boolean esPrimo = true;
		numero = Metodo.getInt("Introduce un número");
		while (numero <= 1) {
			numero = Metodo.getInt("No hay primos positivos por debajo de 1, introduce otro número");
		}
		System.out.println("Los números primos por debajo de " + numero + " son:");
		for (contador = 2; contador < numero; contador++) {
			esPrimo = Metodo.numPri(contador);
			if (esPrimo) {
				System.out.println(contador);
			}
		}
	}
}

