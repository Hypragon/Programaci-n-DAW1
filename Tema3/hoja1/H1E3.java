package hoja1;
/*
Programa que lea una frase y una palabra y que nos diga la posición de dicha palabra en la
frase o un mensaje indicando que no está. 
*/
public class H1E3 {

	public static void main(String[] args) {
		String frase, fraseEnMinusculas, palabra, palabraEnMinusculas;
		int posicion = 0, cantidad = 0;
		frase = Metodo.getString("Introduce una frase");
		palabra = Metodo.getString("Introduce una palabra que buscar en esta frase");
		fraseEnMinusculas = frase.toLowerCase();
		palabraEnMinusculas = palabra.toLowerCase();
		posicion = fraseEnMinusculas.indexOf(palabraEnMinusculas);
		if (posicion != -1) {
			cantidad++;
		}
		while (posicion != -1) {
			posicion++;
			posicion = fraseEnMinusculas.indexOf(palabraEnMinusculas, posicion);
			if (posicion != -1) {
				cantidad++;
			}
		}
		System.out.println("En la frase \"" + frase + "\", la palabra \"" + palabra + "\" aparece " + cantidad + " veces.");
	}
}
