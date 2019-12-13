package ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Ejercicio 3
Igual que el anterior, pero cuando se haya introducido 5 veces mal, el programa terminará.
Utiliza la clase Scanner y no la clase Leer.
 */
public class ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		Integer numero = null;
		int cantidadDeFallos = 0;
		String basura;
		boolean error = true;
		while (error && cantidadDeFallos < 5) {
			try {
				System.out.println("Introduce un entero.");
				numero = teclado.nextInt();
				error = false;
			} catch (InputMismatchException e) {
				System.out.println("Dato incorrecto");
				basura = teclado.nextLine();
				error = true;
				cantidadDeFallos++;
			}
		}
		if (cantidadDeFallos == 5) {
			System.out.println("El programa va a terminar por la continua introducción de errores.");
		}
		else {
			System.out.println("El número introducido es " + numero);
		}
	}

}
