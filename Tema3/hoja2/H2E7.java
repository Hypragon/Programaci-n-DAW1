package hoja2;

import java.util.Arrays;

/*
7. Generar una matriz de 5x5 numérica entera, a continuación pedir dos números de fila, que se
deben filtrar entre 1 y 5 e intercambiar ambas filas. Presentar las matrices antes y después del
cambio. 
 */
public class H2E7 {

	public static void main(String[] args) {
		int numeros[][] = new int [5][5], posicion1, posicion2;
		for (int contador1 = 0; contador1 < numeros.length; contador1++) {
			Arrays.setAll(numeros[contador1], (contador2)-> (int) (Math.random()*10+1));
			System.out.println(Arrays.toString(numeros[contador1]));
		}

		posicion1 = Metodo.getIntBetween(1, 5, "Introduce la fila que quieres intercambiar") - 1;
		posicion2 = Metodo.getIntBetween(1, 5, "Introduce la fila por la que la quieres intercambiar") - 1;
		int arrayCopiaDeApoyo[]= Arrays.copyOf(numeros[posicion2], numeros[posicion2].length);
		numeros[posicion2] = Arrays.copyOf(numeros[posicion1], numeros[posicion1].length);
		numeros[posicion1] = Arrays.copyOf(arrayCopiaDeApoyo, arrayCopiaDeApoyo.length);
		for (int contador = 0; contador < numeros.length; contador++) {
			System.out.println(Arrays.toString(numeros[contador]));
		}
	}

}
