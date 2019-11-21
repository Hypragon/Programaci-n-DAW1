package hoja2;

import hoja1.Metodo;

/*
Hacer un programa que lea una serie de n�meros por teclado de manera que cuando
el n�mero le�do sea el cero ya no se introduzcan m�s, el programa debe calcular y
escribir la suma de los n�meros de la serie que son m�ltiplos de 5 y cu�ntos se han
introducido en total
 */
public class H2E6 {

	public static void main(String[] args) {
		int numero, suma = 0, contador = 0;
		numero = Metodo.getInt("Introduce un n�mero");
		while (numero != 0) {
			contador++;
			if (numero % 5 == 0) {
				suma += numero;
			}
			numero = Metodo.getInt("Introduce otro n�mero");
		}
		System.out.println("La suma de los m�ltiplos de 5 que has introducido es " + suma + "\nHas introducido " + contador + " n�meros");
	}
}
