package hoja2;
//Calcular la suma de los cuadrados de los números pares comprendidos entre 1 y n donde n es una variable que se leerá del exterior por el teclado.

import hoja1.Metodo;

public class H2E2 {

	public static void main(String[] args) {
		int numero, suma = 0;
		numero = Metodo.getInt("Introduce un número");
		while (numero <= 1) {
			numero = Metodo.getInt("Introduce un número mayor que uno");
		}
		for (int contador = 1; contador <= numero; contador++) {
			if (contador % 2 == 0) {
				suma += Math.pow(contador, 2);
			}
		}
		System.out.println("La suma de los números pares comprendidos entre 1 y " + numero + " es " + suma);
	}
}
