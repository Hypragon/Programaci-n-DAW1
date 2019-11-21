package hoja1;
/*
Escribir un programa que lea una frase (máximo 60 caracteres) y diga cuántas letras
distintas tiene y la frecuencia de las mismas, para homogeneizar el conjunto de letras
debemos trabajar solo con mayúsculas. 

 */
public class H1E10 {
	public static void main(String[] args) {
		String frase;
		int total = 0, contador = 0, lugar = 0;
		char letra[] = new char[60], caracter[] = new char[60];
		boolean  usar = true;
		do {
			frase = Metodo.getStringLim(60, "Introduce una frase en mayúsculas");
		} while (!frase.equals(frase.toUpperCase()));
		for (int contador1 = 0; contador1 < frase.length(); contador1++) {
			letra[contador1] = frase.charAt(contador1);
		}
		for (int contador1 = 0; contador1 < letra.length; contador1++) {
			if (letra[contador1] != 0) {
				total++;
			} else {
				break;
			}
		}
		System.out.println("La frase tiene " + total + " carácteres");
		for (int contador1 = 0; contador1 < total; contador1++) {
			contador = 0;
			for (int contador2 = 0; contador2 <= contador1; contador2++) {
				if (letra[contador1] == caracter[contador2]) {
					usar = false;
					break;
				} else {
					usar = true;
				}
			}
			if (usar) {
				caracter[lugar++] = letra[contador1];
				for (int j = 0; j < total; j++) {
					if (letra[contador1] == letra[j]) {
						contador++;
					}
				}
				lugar = 0;
				while (caracter[lugar] != 0) lugar++;
				System.out.println("La letra " + letra[contador1] + " aparece " + contador + " veces.");
			}
		}
		System.out.println("Hay " + lugar + " carácteres distintos");
	}
}

