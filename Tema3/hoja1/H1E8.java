package hoja1;
/*
Leer una frase filtrándola a que todos sus caracteres sean mayúsculas, una vez filtrada y
dado un numero entre 1 y 10 haga un cifrado de la frase (denominado cifrado CESAR) del
modo siguiente , si el numero por ejemplo es 3, transforme la frase de manera que cada
carácter se transforme en 3 códigos ASCII mas es decir :
Frase inicial PROGRAMACION resultado SURJUDPDFLRQ.
Desarrollar los programas de codificar y descodificar mediante dos funciones.
 */
public class H1E8 {

	public static void main(String[] args) {
		int codigoRomano, modo;
		String frase, frase2 = "";
		char caracter = 0;
		frase = Metodo.getStringLim(20, "Introduce una frase para codificar. La frase tiene que estar en mayúsculas");
		if (frase.compareTo(frase.toUpperCase()) != 0) {
			frase = Metodo.getStringLim(20, "Introduce una frase para codificar. La frase tiene que estar en mayúsculas");
		}
		codigoRomano = Metodo.getIntBetween(1, 9, "Introduce la cantidad de caracteres que quieres desplazar");
		modo = Metodo.getIntBetween(1, 2, "Introduce si quieres codificar (1) o descodificar (2)");
		for (int contador = 0; contador < frase.length(); contador++){
			if ((int)frase.charAt(contador) >= 'A' && (int)frase.charAt(contador) <= 'Z') {
				if (modo == 1) {
					caracter = codificar(caracter, frase2, codigoRomano, contador);
				}
				else {
					caracter = decodificar(caracter, frase2, codigoRomano, contador);
				}
			}
			else {
				caracter = frase.charAt(contador);
			}
			frase2 += "" + caracter;
		}
		System.out.println("El resultado es " + frase2);
	}
	public static char codificar(char caracter, String frase, int codigo, int posicion) {
		caracter = (char)(frase.charAt(posicion) + codigo);
		if ((int)caracter > 90) {
			caracter -= 26;
		}
		return caracter;
	}
	public static char decodificar(char caracter, String frase, int codigo, int posicion) {
		caracter = (char)(frase.charAt(posicion) - codigo);
		if ((int)caracter < 65) {
			caracter += 26;
		}
		return caracter;
	}
}
