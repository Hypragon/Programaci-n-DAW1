package ejercicio;

public class Animal {

	private int numcrias;

	public Animal(int numcrias) {
		// En un constructor no mostraremos datos en pantalla
		// Esto es un ejemplo y lo hacemos para entender mejor
		// el funcionamiento de las clases y la herencia
		this.numcrias = numcrias;
		System.out.print("\n\tHa nacido un animal ");
	}

	public void alimentarse() {
		/*
		 * Uso esta funci�n con el fin de ver que es una funci�n de la clase
		 * Animal y la puede usar cualquier clase, como si fuera suya, que
		 * herede de dicha clase.
		 */
		System.out.println("\t\t\tHora de comer");
	}

	public void insertarDatos() {

		numcrias = Leer.pedirEntero("\n\t\tN�mero de cr�as(como animal que es): ");
	}

	public void vis_datosanim() {
		Leer.mostrarEnPantalla("\n\t Cr�as: " + numcrias);
	}
}
