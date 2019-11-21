package hoja3;

import java.util.Arrays;

/*
2. Generar una matriz de 4 filas y 5 columnas con números aleatorios entre 1 y
100, y hacer su matriz transpuesta. 
 */
public class H3E2 {

	public static void main(String[] args) {
		int numeros1[][] = new int [4][5], numeros2[][] = new int [5][4];
		for (int contador1 = 0; contador1 < numeros1.length; contador1++) {
			Arrays.setAll(numeros1[contador1], (contador2)-> (int) (Math.random()*100+1));
		}
		for (int contador1 = 0; contador1 < numeros1.length; contador1++) {
			for (int contador2 = 0; contador2 < numeros1[contador1].length; contador2++) {
				numeros2[contador2][contador1] = numeros1[contador1][contador2];
			}
		}
		System.out.println("Array 1");
		for (int contador = 0; contador < numeros1.length; contador++) {
			System.out.println(Arrays.toString(numeros1[contador]));
		}
		System.out.println("Array 2");
		for (int contador = 0; contador < numeros2.length; contador++) {
			System.out.println(Arrays.toString(numeros2[contador]));
		}
	}

}
