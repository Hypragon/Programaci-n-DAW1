package hoja2;

import hoja1.Metodo;

/*
Hacer un programa que lea un n�mero n y nos escriba en la pantalla mediante un
mensaje si es � no primo (NOTA: N�mero primo es aqu�l que es divisible solo por
si mismo y por, la unidad)
 */
public class H2E5 {

	public static void main(String[] args) {
		int numero;
		boolean esPrimo = true;
		numero = Metodo.getIntPos("Introduce un n�mero");
		esPrimo = Metodo.numPri(numero);
		if (numero == 1 || esPrimo == false) {
			System.out.println(numero + " no es un n�mero primo");
		} else {
			System.out.println(numero + " es un n�mero primo");
		}
	}
}
