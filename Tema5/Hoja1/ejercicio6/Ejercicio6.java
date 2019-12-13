package ejercicio6;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
Ejercicio 6
Crear un programa con un método en la clase principal que pida la edad de una persona y la devuelva.
La edad debe estar comprendida entre 18 y 65 años, y en cualquier otro caso debe lanzar una excepción
con un mensaje personalizado.
No se puede utilizar la clase Leer.
Llama a ese método desde el método main
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		int edad = 0;
		boolean error = true;
		while (error){
			try {
				edad = pedirEdad("Introduce una edad entre 18 y 65");
				error = false;
			} catch (InputMismatchException e) {
				error = true;
				System.out.println("Introduce un dato que sea una edad");
			} catch (EdadIncorrectaException e) {
				error = true;
				System.out.println(e.informeError());
			}
		}
		System.out.println("La edad introducida es " + edad);
	}
	static int pedirEdad(String texto) throws EdadIncorrectaException{
		Scanner teclado = new Scanner(System.in);
		EdadIncorrectaException errorEdad = new EdadIncorrectaException();
		int edad = 0;
		System.out.println(texto);
		edad = teclado.nextInt();
		if (edad < 18 || edad > 65) {
			throw errorEdad;
		}
		return edad;
	}
}
