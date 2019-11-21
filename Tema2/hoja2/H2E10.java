package hoja2;

import hoja1.Metodo;

/*
Dado un numero n que filtraremos a que sea positivo, escribir un programa que nos
diga cu�l es el numero primo m�s cercano a �l por debajo.
 */
public class H2E10 {

	public static void main(String[] args) {
		int numero, primo = 0;
		boolean esPrimo = false;
		numero = Metodo.getIntPos("Introduce un n�mero");
		for (int contador = 2; contador < numero / 2; contador++) {	
			esPrimo = Metodo.numPri(contador);
			if (esPrimo) {
				primo = contador;
			}
		}
		if (primo != 0) {
			System.out.println("El n�mero primo m�s cercano por debajo de " + numero + " es " + primo);
		}
		else System.out.println("No hay n�meros primos por debajo de " + numero);
	}
}
