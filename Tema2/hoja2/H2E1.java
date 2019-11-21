package hoja2;

import hoja1.Metodo;

//Escribir un programa que calcule e imprima la SUMA de los números impares comprendidos entre a y b que deben leerse por teclado y filtrarse para que a<=b
public class H2E1 {

	public static void main(String[] args) {
		int numero1, numero2, suma = 0;
		numero1 = Metodo.getInt("Introduce un número");
		numero2 = Metodo.getInt("Introduce otro número");
		if (numero1 <= numero2) {
			for (int contador = numero1; contador <= numero2; contador++) {
				if (contador % 2 != 0) {
					suma += contador;
				}
			}
			System.out.println("La suma de los números impares entre " + numero1 + " y " + numero2 + " es " + suma);
		} else {				//Si no:
			System.out.println(numero1 + " es mayor que " + numero2);
		}
	}
}
