package hoja1;
/*
Leer una frase por teclado (m�ximo 80) y a continuaci�n escribir cuantas vocales,
consonantes y caracteres num�ricos posee.
 */
public class H1E6 {

	public static void main(String[] args) {
		String frase = "", fraseEnMinusuculas, vocales = "aeiou";
		int cantidadVocales = 0, cantidadConsonantes = 0, cantidadNumeros = 0;
		frase = Metodo.getStringLim(80, "Introduce una frase");
		fraseEnMinusuculas = frase.toLowerCase();
		for (int i = 0; i < frase.length(); i++) {
			if (vocales.indexOf(fraseEnMinusuculas.substring(i, i++)) != -1) {
				cantidadVocales++;
			} else if (fraseEnMinusuculas.charAt(i) >= '0' && fraseEnMinusuculas.charAt(i) <= '9') {
				cantidadNumeros++;
			} else if (fraseEnMinusuculas.charAt(i) >= 'a' && fraseEnMinusuculas.charAt(i) <= 'z' || fraseEnMinusuculas.charAt(i) == '�') {
				cantidadConsonantes++;
			}
		}
		System.out.println("La frase \"" + frase + "\" tiene " + cantidadVocales + " vocales, " + cantidadConsonantes + " consonantes y " + cantidadNumeros + " n�meros.");
	}
}
