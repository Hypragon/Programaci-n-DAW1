package hoja2;

import hoja1.Metodo;

/*
Escribir un programa que lea una secuencia de datos numéricos de longitud
indefinida de manera que cuando el número sea el cero cesará la entrada de dicha
secuencia. El programa debe imprimirnos la media de todos, el mayor y el menor.
 */
public class H2E9 {

	public static void main(String[] args) {
		int numero, media = 0, numeroMayor, numeroMenor, contador = 0;
		numero = Metodo.getInt("Introduce un número");
		numeroMayor = numero;
		numeroMenor = numero;
		while (numero != 0) {
			contador++;
			media += numero;
			if (numero > numeroMayor) {
				numeroMayor = numero;
			}
			if (numero < numeroMenor) {
				numeroMenor = numero;
			}
			numero = Metodo.getInt("Introduce otro número");
		}
		media /= contador;
		System.out.println("La media de los números introducidos es " + media + "\nEl mayor número introducido es " + numeroMayor + "\nEl menor número introducido es " + numeroMenor);
	}

}
