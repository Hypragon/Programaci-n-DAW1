package hoja2;

import hoja1.Metodo;

/*
Un n�mero se dice que es perfecto cuando la suma de sus divisores excluidos a �l es igual a dicho n�mero.
 */
public class H2E12 {

	public static void main(String[] args) {
		int numero, suma = 0;
		numero = Metodo.getIntPos("Introduce un n�mero");
		for (int contador = 1; contador < (numero / 2); contador++) {
			if (numero % contador == 0) {
				suma += contador;
			}
		}
		if (numero == suma) {
			System.out.println(numero + " es un n�mero perfecto");
		}
		else {				//Si no:
			System.out.println(numero + " no es un n�mero perfecto");
		}
	}
}
