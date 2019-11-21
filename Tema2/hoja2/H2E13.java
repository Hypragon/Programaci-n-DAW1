package hoja2;

import hoja1.Metodo;

//Dado un numero n leído por teclado encontrar el numero p primo mas cercano a él por exceso.
public class H2E13 {

	public static void main(String[] args) {
		int numero1, numero2;
		boolean esPrimo = false;
		numero1 = Metodo.getIntPos("Introduce un número");
		numero2 = numero1;
		while (!esPrimo) {
			numero2++;
			esPrimo = Metodo.numPri(numero2);
		}
		System.out.println("El número primo más cercano a " + numero1 + " por exceso es " + numero2);
	}	
}
