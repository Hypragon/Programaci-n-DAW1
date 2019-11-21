package hoja1;
/*
Dada una frase de no más de 80 caracteres hacer un programa que busque cuántas
mayúsculas y minúsculas tiene y lo imprima 
 */
public class H1E2 {

	public static void main(String[] args) {
		String frase, fraseEnMinusculas;
		int may = 0, min = 0;
		frase = Metodo.getStringLim(80, "Introduce una frase");
		fraseEnMinusculas = frase.toLowerCase();
		for (int contador = 0; contador < frase.length(); contador++) {
			if (frase.charAt(contador) == fraseEnMinusculas.charAt(contador)) {
				min++;
			} else {
				may++;
			}
		}
		System.out.println("La frase \"" + frase + "\" contiene " + may + " mayúsculas y " +  min + " minúsculas.");
	}

}
