package hoja3;

import java.util.Arrays;

/*
4. Crear una tabla de 3 páginas, 4 filas y 5 columnas donde el primer elemento
valga 1, el segundo 2, el tercero 3 y así sucesivamente, e imprimirla. 
 */
public class H3E4 {

	public static void main(String[] args) {
		int tablaPaginas[][][] = new int [3][4][5];
		for (int contador1 = 0; contador1 < tablaPaginas.length; contador1++) {
			for (int contador2 = 0; contador2 < tablaPaginas[contador1].length; contador2++) {
				for (int contador3 = 0; contador3 < tablaPaginas[contador1][contador2].length; contador3++) {
					tablaPaginas[contador1][contador2][contador3] = (contador1 * 20) + (contador2 * 5) + contador3 + 1;
				}
			}
		}
		for (int contador1 = 0; contador1 < tablaPaginas.length; contador1++) {
			for (int contador2 = 0; contador2 < tablaPaginas[contador1].length; contador2++) {
				System.out.println(Arrays.toString(tablaPaginas[contador1][contador2]));
			}
			System.out.println("Página " + (contador1 + 1));
		}
	}

}
