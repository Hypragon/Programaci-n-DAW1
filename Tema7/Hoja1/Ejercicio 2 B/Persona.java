package ejercicio;

public class Persona extends Mamifero {

	private String profesion;

	public Persona(int numcrias, int numhuesos, int numextremidades, String profesion) {
		super(numcrias, numhuesos, numextremidades);
		this.profesion = profesion;
		System.out.print(" y persona");
	}

	void insertarDatosPers() {
		insertarDatosMamif();
		profesion = Leer.pedirCadena("\t\tProfesión de esta persona: ");
	}

	public void visualizarDatos() {
		visDatosMamif();
		Leer.mostrarEnPantalla("\n\t profesión: " + profesion);
	}
}
