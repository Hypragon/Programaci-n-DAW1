package hoja1;
/*
Leer una cadena de hasta 80 caracteres y pasarla en funci�n de una variable de opci�n a
may�sculas � a min�sculas e imprimir la cadena resultante
 */
public class H1E4 {

	public static void main(String[] args) {
		int opcion = 0;
		String frase;
		frase = Metodo.getStringLim(80, "Introduce una frase");	
		opcion = Metodo.getIntBetween(1, 2, "Elige si quieres pasar la frase a may�sculas (1) o a min�sculas (2)");
		if (opcion == 1) {
			frase = frase.toUpperCase();
		} else if (opcion == 2) {
			frase = frase.toLowerCase();
		}
		System.out.println("El resultado de la conversi�n es \"" + frase + "\"");
	}

}
