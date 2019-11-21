package hoja2;

import hoja1.Metodo;

/*
Dados dos n�meros p y q que leeremos por teclado y que deben ser positivos, hacer
un programa que nos diga cual de los dos tiene m�s divisores, con un mensaje que
diga �p tiene mas divisores que q� � viceversa.
 */
public class H2E8 {

	public static void main(String[] args) {
		int numero1, numero2, divisoresNumero1 = 0, divisoresNumero2 = 0;
		numero1 = Metodo.getInt("Introduce un n�mero positivo");
		numero2 = Metodo.getInt("Introduce otro n�mero positivo");
		for (int contador = 1; contador < numero1; contador++) {
			if (numero1 % contador == 0) {
				divisoresNumero1++;
			}
		}
		for (int contador = 1; contador < numero2; contador++) {
			if (numero2 % contador == 0) {
				divisoresNumero2++;
			}
		}
		if (divisoresNumero1 == divisoresNumero2) {
			System.out.println(numero1 + " y " + numero2 + " tienen la misma cantidad de divisores");
		}
		else if (divisoresNumero1 > divisoresNumero2) {
			System.out.println(numero1 + " tiene m�s divisores que " + numero2);
		}
		else if (divisoresNumero1 < divisoresNumero2) {
			System.out.println(numero2 + " tiene m�s divisores que " + numero1);
		}
	}	
}


