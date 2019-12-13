package ejercicio7;
/*
Ejercicio 7
1. Crea una excepción personalizada llamada EdadInvalidaException, cuyo mensaje sea “No se
puede tener una edad menor que 0”.
2. Crea una clase llamada Persona que solo tenga dos atributos: nombre y edad. Con un
constructor que inicialice los dos atributos y con sus setters y getters.
Tanto en el constructor como en el método setEdad(int edad) debes controlar que no se
introduzca una edad negativa. Para ello cuando se intente introducir una edad negativa (tanto
en el constructor como en setEdad) se lanzará la excepción EdadInvalidaException.
Implementa también el método sobreescrito toString().
3. En el método principal del programa instancia dos personas, una con edad negativa y otra con
edad 0. A la segunda intenta asignarle después una edad negativa con el método setEdad.
Justo después de instanciar cada una de las dos personas y de llamar al método setEdad
muestra por pantalla sus datos por medio del método toString().
 */
public class Persona {
	private String nombre;
	private int edad;
	public Persona(String nombre, int edad) throws EdadInvalidaException {
		super();
		EdadInvalidaException errorEdad = new EdadInvalidaException();
		this.nombre = nombre;
		if (edad < 0) {
			throw errorEdad;
		}
		else {
			this.edad = edad;	
		}
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) throws EdadInvalidaException{
		EdadInvalidaException errorEdad = new EdadInvalidaException();
		if (edad < 0) {
			throw errorEdad;
		}
		else {
			this.edad = edad;
		}
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
}
