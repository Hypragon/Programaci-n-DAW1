package hoja1;
/*
Leer una cadena de hasta 80 caracteres y pasarla en función de una variable de opción a
mayúsculas ó a minúsculas e imprimir la cadena resultante
 */
public class H1E4 {

	public static void main(String[] args) {
		int opcion = 0;
		String frase;
		frase = Metodo.getStringLim(80, "Introduce una frase");	
		opcion = Metodo.getIntBetween(1, 2, "Elige si quieres pasar la frase a mayúsculas (1) o a minúsculas (2)");
		if (opcion == 1) {
			frase = frase.toUpperCase();
		} else if (opcion == 2) {
			frase = frase.toLowerCase();
		}
		System.out.println("El resultado de la conversión es \"" + frase + "\"");
	}

}
