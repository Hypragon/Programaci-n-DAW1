package hoja2;

import hoja1.Metodo;

/*
Se define el factorial de un número n como:
n*(n-1)*(n-2)*.......*3*2*1. Hacer un programa que lea un número n
filtrando que sea mayor que cero y calcule su factorial
 */
public class H2E11 {

	public static void main(String[] args) {
		int numero;
		long factorial = 1;
		numero = Metodo.getIntPos("Introduce un número");
		for (int contador = 1; contador <= numero; contador++) {
			factorial *= contador;
		}
		System.out.println("El factorial de " + numero + " es " + factorial);
	}
}
