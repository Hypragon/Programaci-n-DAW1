package ejercicio6;
/*
Ejercicio 6
Crear un programa con un m�todo en la clase principal que pida la edad de una persona y la devuelva.
La edad debe estar comprendida entre 18 y 65 a�os, y en cualquier otro caso debe lanzar una excepci�n
con un mensaje personalizado.
No se puede utilizar la clase Leer.
Llama a ese m�todo desde el m�todo main
 */
public class EdadIncorrectaException extends Exception {
	String informeError() {
		return "La edad recibida no se encuentra dentro de los par�metros deseados";
	}
}
