package hoja2;

import hoja1.Metodo;

//Escribir un programa que una vez que lea un n�mero n por teclado calcule y escriba sus divisores por la pantalla
public class H2E4 {

	public static void main(String[] args) {
		int numero;
		numero = Metodo.getInt("Introduce un n�mero");
		while (numero < 1) {
			numero = Metodo.getInt("introduce un n�mero mayor que 0");
		}
		for (int contador = 1; contador <= numero; contador++) {
			if (numero % contador == 0) {
				System.out.println(contador + " es divisor de " + numero);
			}
		}
	}
}
