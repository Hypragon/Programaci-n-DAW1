package hoja1;
/*
Leer una frase por teclado y escribir a continuaci�n cuantas may�sculas, min�sculas y
n�meros contiene.
 */
public class H1E7 {

	public static void main(String[] args) {
		String frase = "";
		int numeros = 0, mayusculas = 0, minusculas = 0;
		frase = Metodo.getStringLim(80, "Introduce una frase");
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) >= 65 && frase.charAt(i) <= 90) mayusculas++;
			else if (frase.charAt(i) >= 48 && frase.charAt(i) <= 57) numeros++;
			else if (frase.charAt(i) >= 97 && frase.charAt(i) <= 122) minusculas++;
		}
		System.out.println("La frase \"" + frase + "\" tiene " + mayusculas + " may�sculas, " + minusculas + " min�sculas y " + numeros + " n�meros.");
	}
}
