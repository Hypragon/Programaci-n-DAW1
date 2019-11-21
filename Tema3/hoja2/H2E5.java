package hoja2;

import java.util.Arrays;

/*
5. Generar una matriz de 10x10 y hallar e imprimir la suma de cada una de sus filas y de cada una
de sus columnas. 
 */
public class H2E5 {

	public static void main(String[] args) {
		int numeros[][] = new int [10][10];
		int suma = 0;
		for (int contador1 = 0; contador1 < numeros.length; contador1++) {
			Arrays.setAll(numeros[contador1], (contador2)-> (int) (Math.random()*10+1));
		}
		for (int contador1 = 0; contador1 < numeros.length; contador1++) {
			System.out.print("En la fila " + (contador1+1) + ", están los números: " + Arrays.toString(numeros[contador1]));
			for (int contador2 = 0; contador2 < numeros[contador1].length; contador2++) {
				suma += numeros[contador1][contador2];
			}
			System.out.println(" y la suma de estos es " + suma);
			suma = 0;
		}
		for (int contador1 = 0; contador1 < numeros.length; contador1++) {
			for (int contador2 = 0; contador2 < numeros[contador1].length; contador2++) {
				System.out.print(numeros[contador2][contador1] + ", ");
				suma += numeros[contador2][contador1];
			}
			System.out.println("y la suma de estos es " + suma);
			suma = 0;
		}
	}
}


