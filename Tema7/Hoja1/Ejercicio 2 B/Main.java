package ejercicio;

public class Main {
	public static void main(String[] args) {
		Persona p[] = new Persona[3];
		int pos;
		int numcrias, numhuesos, numextremidades;
		String profesion;
		/*for (pos = 0; pos < 3; pos++) {
			p[pos] = new Persona();
		}*/

		Mamifero ma[] = new Mamifero[2];
		/*for (pos = 0; pos < 2; pos++) {
			ma[pos] = new Mamifero();
		}*/

		Animal a;
		Leer.mostrarEnPantalla("\n\tINSERCI�N DE LOS DATOS DE LAS DIFERENTES PERSONAS:");
		for (pos = 0; pos < p.length; pos++) {
			Leer.mostrarEnPantalla("\n\t\tINSERTE LOS DATOS DE LA PERSONA "	+ (pos + 1));
			//p[pos].insertarDatosPers();
			numcrias = Leer.pedirEntero("\n\t\tN�mero de cr�as(como animal que es): ");
			numhuesos = Leer.pedirEntero("\t\tN�mero de huesos (como mam�fero que es)");
			numextremidades = Leer.pedirEntero("\t\tN�mero de extremidades (como mam�fero que es): ");
			profesion = Leer.pedirCadena("\t\tProfesi�n de esta persona: ");
			p[pos] = new Persona(numcrias, numhuesos, numextremidades, profesion);
		}
		Leer.mostrarEnPantalla("\n\tINSERCI�N DE LOS DATOS DE LOS DIFERENTES MAM�FEROS:");
		for (pos = 0; pos < ma.length; pos++) {
			Leer.mostrarEnPantalla("\t\tINSERTE LOS DATOS DEL MAM�FERO" + (pos + 1));
			//ma[pos].insertarDatosMamif();
			numcrias = Leer.pedirEntero("\n\t\tN�mero de cr�as(como animal que es): ");
			numhuesos = Leer.pedirEntero("\t\tN�mero de huesos (como mam�fero que es)");
			numextremidades = Leer.pedirEntero("\t\tN�mero de extremidades (como mam�fero que es): ");
			ma[pos] = new Mamifero(numcrias, numhuesos, numextremidades);
		}
		pos = 0;
		Leer.mostrarEnPantalla("\n\tINSERCI�N DE LOS DATOS DEL RESTO DE LOS ANIMALES: ");
		Leer.mostrarEnPantalla("\t\tINSERTE LOS DATOS DEL ANIMAL " + (pos + 1));
		//a.insertarDatos();
		numcrias = Leer.pedirEntero("\n\t\tN�mero de cr�as(como animal que es): ");
		a = new Animal(numcrias);
		Leer.mostrarEnPantalla("\nVISUALIZACI�N DE LOS DATOS DE LAS DIFERENTES PERSONAS: ");
		for (pos = 0; pos < p.length; pos++) {
			Leer.mostrarEnPantalla("\nPERSONA" + (pos + 1));
			p[pos].visualizarDatos();
		}
		Leer.mostrarEnPantalla("\nVISUALIZACI�N DE LOS DATOS DE LOS DIFERENTES MAM�FEROS: ");
		for (pos = 0; pos < ma.length; pos++) {
			System.out.println("\nMAM�FERO" + (pos + 1));
			ma[pos].visDatosMamif();
		}
		Leer.mostrarEnPantalla("\nVISUALIZACI�N DE LOS DATOS DEL RESTO DE LOS ANIMALES: ");
		a.vis_datosanim();
		Leer.mostrarEnPantalla("\n\tSE VA A PROCEDER A DAR DE COMER A TODAS LAS PERSONAS: ");
		for (pos = 0; pos < p.length; pos++) {
			Leer.mostrarEnPantalla("\n\t\tPERSONA" + (pos + 1));
			p[pos].alimentarse();
		}
		Leer.mostrarEnPantalla("\n\tSE VA A PROCEDER A DAR DE COMER A TODOS LOS MAM�FEROS: ");
		for (pos = 0; pos < ma.length; pos++) {
			Leer.mostrarEnPantalla("\n\t\t MAM�FERO" + (pos + 1));
			ma[pos].alimentarse();
		}
		pos = 0;
		Leer.mostrarEnPantalla("\n\tTerminado de comer todos los mam�feros, pasamos a que coma el �nico animal: ");
		Leer.mostrarEnPantalla("\n\tSE VA A PROCEDER A DAR DE COMER AL RESTO DE LOS ANIMALES: ");
		Leer.mostrarEnPantalla("\n\t\t ANIMAL " + (pos + 1));
		a.alimentarse();
		Leer.mostrarEnPantalla("\nFINALIZACI�N DE TODO EL PROCESO. ");

	}
}