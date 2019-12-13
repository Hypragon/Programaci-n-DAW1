package ejercicio7;
/*
Ejercicio 7
1. Crea una excepci�n personalizada llamada EdadInvalidaException, cuyo mensaje sea �No se
puede tener una edad menor que 0�.
2. Crea una clase llamada Persona que solo tenga dos atributos: nombre y edad. Con un
constructor que inicialice los dos atributos y con sus setters y getters.
Tanto en el constructor como en el m�todo setEdad(int edad) debes controlar que no se
introduzca una edad negativa. Para ello cuando se intente introducir una edad negativa (tanto
en el constructor como en setEdad) se lanzar� la excepci�n EdadInvalidaException.
Implementa tambi�n el m�todo sobreescrito toString().
3. En el m�todo principal del programa instancia dos personas, una con edad negativa y otra con
edad 0. A la segunda intenta asignarle despu�s una edad negativa con el m�todo setEdad.
Justo despu�s de instanciar cada una de las dos personas y de llamar al m�todo setEdad
muestra por pantalla sus datos por medio del m�todo toString().
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		Persona primeraPersona = null;
		Persona segundaPersona = null;
		try {
			primeraPersona = new Persona("juan", -5);
		} catch (EdadInvalidaException e) {
			System.out.println(e.informeError() + " Primer Constructor");
		}
		try {
			segundaPersona = new Persona("pedro", 0);
		} catch (EdadInvalidaException e) {
			System.out.println(e.informeError() + " Segundo Constructor");
		}
		try {
			segundaPersona.setEdad(-5);
		} catch (EdadInvalidaException e) {
			System.out.println(e.informeError() + " Set");
		}
		System.out.println(primeraPersona);
		System.out.println(segundaPersona);
	}

}
