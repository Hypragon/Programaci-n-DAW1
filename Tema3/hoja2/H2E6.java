package hoja2;

import java.util.Arrays;

/*
6. Generar una matriz de 5x5 (numérica entera) e imprimir el valor más grande y el más pequeño
y los lugares donde se encuentran. 
 */
public class H2E6 {

	public static void main(String[] args) {
		int numeros[][]= new int [5][5], posicionNumeroMayorX = 0, posicionNumeroMayorY= 0, posicionNumeroMenorX= 0, posicionNumeroMenorY= 0;
		for (int contador1 = 0; contador1 < numeros.length; contador1++) {
			Arrays.setAll(numeros[contador1], (contador2)-> (int) (Math.random()*10+1));
		}
		for (int contadorPosicionX = 0; contadorPosicionX < numeros.length; contadorPosicionX++) {
			for (int contadorPosicionY = 0; contadorPosicionY < numeros[contadorPosicionX].length; contadorPosicionY++) {
				if (numeros[contadorPosicionX][contadorPosicionY] > numeros[posicionNumeroMayorX][posicionNumeroMayorY]) {
					posicionNumeroMayorX = contadorPosicionX;
					posicionNumeroMayorY = contadorPosicionY;
				} else if (numeros[contadorPosicionX][contadorPosicionY] < numeros[posicionNumeroMenorX][posicionNumeroMenorY]) {
					posicionNumeroMenorX = contadorPosicionX;
					posicionNumeroMenorY = contadorPosicionY;
				}
			}
		}
		for (int contador = 0; contador < numeros.length; contador++) {
			System.out.println(Arrays.toString(numeros[contador]));
		}
		System.out.println("El mayor número es " + numeros[posicionNumeroMayorX][posicionNumeroMayorY] + ", que se encuentra en la fila " + ++posicionNumeroMayorX + " y en la columna " + ++posicionNumeroMayorY);
		System.out.println("El menor número es " + numeros[posicionNumeroMenorX][posicionNumeroMenorY] + ", que se encuentra en la fila " + ++posicionNumeroMenorX + " y en la columna " + ++posicionNumeroMenorY);

	}

}
