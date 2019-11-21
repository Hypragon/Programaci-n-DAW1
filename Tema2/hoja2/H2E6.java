package hoja2;

import hoja1.Metodo;

/*
Hacer un programa que lea una serie de números por teclado de manera que cuando
el número leído sea el cero ya no se introduzcan más, el programa debe calcular y
escribir la suma de los números de la serie que son múltiplos de 5 y cuántos se han
introducido en total
 */
public class H2E6 {

	public static void main(String[] args) {
		int numero, suma = 0, contador = 0;
		numero = Metodo.getInt("Introduce un número");
		while (numero != 0) {
			contador++;
			if (numero % 5 == 0) {
				suma += numero;
			}
			numero = Metodo.getInt("Introduce otro número");
		}
		System.out.println("La suma de los múltiplos de 5 que has introducido es " + suma + "\nHas introducido " + contador + " números");
	}
}
