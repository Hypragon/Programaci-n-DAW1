package hoja2;

import hoja1.Metodo;

/*
Hacer un programa que vaya leyendo n�meros por el teclado hasta que lea el cero
que indicar� fin de entrada de datos, el programa debe calcular y escribir la suma de
los introducidos en lugar par y los introducidos en lugar impar, es decir los
introducidos primero, tercero, quinto � etc. y la suma de los introducidos el
segundo, cuarto, sexto ... etc.

 */
public class H2E7 {

	public static void main(String[] args) {
		int numero, numeroPar = 0, numeroImpar = 0;
		numero = Metodo.getInt("Introduce un n�mero");
		while (numero != 0) {
			if (numero % 2 == 0){
				numeroPar += numero;
			} else {
				numeroImpar += numero;
			}
			numero = Metodo.getInt("Introduce otro n�mero");
		}
		System.out.println("La suma de los n�meros impares es " + numeroImpar + "\nLa suma de los n�meros pares es " + numeroPar);
	}
}
