package hoja1;
/*
Leer una frase por teclado (máximo 80 car) y construir otras dos cadenas de forma que una
contenga los caracteres en posición par y la otra los caracteres en posición impar.
 */
public class H1E5 {

	public static void main(String[] args) {
		String frase, frasePosicionImpar = "", frasePosicionPar = "";
		frase = Metodo.getStringLim(80, "Introduce una frase");
		for (int contador = 0; contador < frase.length(); contador++) {
			if ((contador + 1) % 2 != 0) frasePosicionImpar += frase.charAt(contador);
			else if ((contador + 1) % 2 == 0) frasePosicionPar += frase.charAt(contador);
		}
		System.out.println("Los caracteres en las posiciones impares son " + frasePosicionImpar + " y los pares son " + frasePosicionPar);
	}

}
