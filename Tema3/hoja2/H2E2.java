package hoja2;

import java.util.Arrays;

/*
2. Leer dos vectores de dimensión 10 y construir un tercer vector, e imprimirlo, cuyos
componentes sean la suma de los dos anteriores 
 */
public class H2E2 {

	public static void main(String[] args) {
		int operandos1[] = new int [10];
		int operandos2[] = new int [10];
		int resultado[] = new int [10];
		Arrays.setAll(operandos1, (contador)-> (int) (Math.random()*10+1));
		Arrays.setAll(operandos2, (contador)-> (int) (Math.random()*10+1));
		for (int contador = 0; contador < resultado.length; contador++) {
			resultado[contador] = operandos1[contador] + operandos2[contador];
		}
		System.out.println("Los operandos de la primera posición son:");
		for (int contador = 0; contador < operandos1.length; contador++) {
			System.out.print(operandos1[contador] + " ");
		}
		System.out.println();
		System.out.println("Los operandos de la segunda posición son:");
		for (int contador = 0; contador < operandos2.length; contador++) {
			System.out.print(operandos2[contador] + " ");
		}
		System.out.println();
		System.out.println("La suma de todos es:");
		for (int contador = 0; contador < resultado.length; contador++) {
			System.out.print(resultado[contador] + " ");
		}
		System.out.println();
		for (int contador = 0; contador < resultado.length; contador++) {
			System.out.println("La suma de " +  operandos1[contador] + " + " + operandos2[contador] + " es " + resultado[contador]);
		}
	}
}