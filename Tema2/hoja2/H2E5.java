package hoja2;

import hoja1.Metodo;

/*
Hacer un programa que lea un número n y nos escriba en la pantalla mediante un
mensaje si es ó no primo (NOTA: Número primo es aquél que es divisible solo por
si mismo y por, la unidad)
 */
public class H2E5 {

	public static void main(String[] args) {
		int numero;
		boolean esPrimo = true;
		numero = Metodo.getIntPos("Introduce un número");
		esPrimo = Metodo.numPri(numero);
		if (numero == 1 || esPrimo == false) {
			System.out.println(numero + " no es un número primo");
		} else {
			System.out.println(numero + " es un número primo");
		}
	}
}
