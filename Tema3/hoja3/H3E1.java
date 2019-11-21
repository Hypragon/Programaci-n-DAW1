package hoja3;

import java.util.Arrays;

/*
1. Generar una matriz de 4 filas y 5 columnas con números aleatorios entre 1 y
100, e imprimirla. 
 */
public class H3E1 {

	public static void main(String[] args) {
		int numeros[][] = new int [4][5];
		for (int contador1 = 0; contador1 < numeros.length; contador1++) {
			Arrays.setAll(numeros[contador1], (contador2)-> (int) (Math.random()*100+1));
		}
		for (int contador1 = 0; contador1 < numeros.length; contador1++) {
			System.out.println(Arrays.toString(numeros[contador1]));
		}
	}

}
