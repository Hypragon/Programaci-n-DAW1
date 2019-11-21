package hoja2;

import hoja1.Metodo;

/*
Un número se dice que es perfecto cuando la suma de sus divisores excluidos a él es igual a dicho número.
 */
public class H2E12 {

	public static void main(String[] args) {
		int numero, suma = 0;
		numero = Metodo.getIntPos("Introduce un número");
		for (int contador = 1; contador < (numero / 2); contador++) {
			if (numero % contador == 0) {
				suma += contador;
			}
		}
		if (numero == suma) {
			System.out.println(numero + " es un número perfecto");
		}
		else {				//Si no:
			System.out.println(numero + " no es un número perfecto");
		}
	}
}
