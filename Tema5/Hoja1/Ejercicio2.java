package ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Ejercicio 2
Pedir un número por teclado, si se introduce un dato que no se corresponde con un dato
numérico, se volverá a pedir hasta que sea correcto. El programa termina cuando se
introduzca un dato correcto. Utiliza la clase Scanner y no la clase Leer.
 */

public class ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		Integer numero = null;
		String basura;
		boolean error = true;
		while (error) {
			try {
				System.out.println("Introduce un entero.");
				numero = teclado.nextInt();
				error = false;
			} catch (InputMismatchException e) {
				System.out.println("Dato incorrecto");
				basura = teclado.nextLine();
				error = true;
			}
		}
		System.out.println("El número introducido es " + numero);
	}

}
