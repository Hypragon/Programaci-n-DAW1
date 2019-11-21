package hoja3;

import java.util.Arrays;

/*
6. Una empresa guarda en una tabla de 3x12x4 las ventas realizadas por sus
tres representantes a lo largo de doce meses de sus cuatro productos,
VENTAS [representante, mes, producto]. Queremos proyectar el array
tridimensional sobre uno de dos dimensiones que represente el total de
ventas, TOTAL [mes, producto], para lo cual sumamos las ventas de cada
producto de cada mes de todos los representantes. Imprimir ambos arrays. 
 */
public class H3E6 {

	public static void main(String[] args) {
		int ventas[][][] = new int[3][12][4], total[][] = new int[12][4];
		for (int contador1 = 0; contador1 < ventas.length; contador1++) { //rellenar
			for (int contador2 = 0; contador2 < ventas[contador1].length; contador2++) {
				Arrays.setAll(ventas[contador1][contador2], (contador3)-> (int) (Math.random()*10+1));
			}
		}
		for (int contador1 = 0; contador1 < ventas.length; contador1++) {
			System.out.println("Ventas del vendedor " + (contador1 + 1));
			for (int contador2 = 0; contador2 < ventas[contador1].length; contador2++) {
				System.out.println("El mes " + (contador2 + 1) + " ha vendido:" + Arrays.toString(ventas[contador1][contador2]));
			}
			System.out.println();
		}
		for (int contador1 = 0; contador1 < ventas.length; contador1++) {
			for (int contador2 = 0; contador2 < ventas[contador1].length; contador2++) {
				for (int contador3 = 0; contador3 < ventas[contador1][contador2].length; contador3++) {
					total[contador2][contador3] += ventas[contador1][contador2][contador3];
				}
			}

		}
		for (int contador1 = 0; contador1 < total.length; contador1++) {
			System.out.println("El mes " + (contador1 + 1) + " se han vendido:" + Arrays.toString(total[contador1]));
		}
	}

}
