package hoja2;

import hoja1.Metodo;

/*
Leer un número n que debe filtrarse entre 1 y 100 y a continuación calcular y
escribir la tabla de multiplicar de ese número con el siguiente formato:
TABLA DE MULTIPLICAR DE 8
8 * 1 = 8
8 * 2 = 16
8 * 3 = 24
......
.....
8 * 10 = 80
 */
public class H2E3 {

	public static void main(String[] args) {
		int numero;
		numero = Metodo.getInt("Introduce un número");
		while (numero < 1 || numero > 100) {
			numero = Metodo.getInt("Introduce un número entre 1 y 100");
		}
		System.out.println("TABLA DE MULTIPLICAR DE " + numero);
		for (int contador = 1; contador <= 10; contador++) {
			System.out.println(numero + " * " + contador + " = " + (numero * contador));
		}
	}
}
