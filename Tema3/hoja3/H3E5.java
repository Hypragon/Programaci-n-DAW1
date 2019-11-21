package hoja3;

import java.util.Arrays;

/*
5. Se dispone de una tabla de 5 páginas, 10 filas y 20 columnas, que se
refieren al centro, al curso y al número de alumnos de un colegio
respectivamente. Imprimir la nota media por curso y la nota media máxima y
su centro de pertenencia. 

 */
public class H3E5 {

	public static void main(String[] args) {
		int numeros[][][] = new int [5][10][20], curso;
		double mediaCurso = 0, mediaCentro = 0;
		for (int contador1 = 0; contador1 < numeros.length; contador1++) {
			for (int contador2 = 0; contador2 < numeros[contador1].length; contador2++) {
				Arrays.setAll(numeros[contador1][contador2], (k)-> (int) (Math.random()*11));
			}
		}
		for (int i = 0; i < numeros.length; i++) {
			for (curso = 0; curso < numeros[i].length; curso++) {
				for (int k = 0; k < numeros[i][curso].length; k++) {
					mediaCurso += (double)(numeros[i][curso][k]);
				}
				System.out.println("La media del curso " + (curso + 1) + " del centro " + (i + 1) + " es " + (mediaCurso / (double)(numeros[i][curso].length)));
				mediaCentro += mediaCurso;
				mediaCurso = 0;
			}
			System.out.println("La media total del centro " + (i + 1) + " es " + (mediaCentro / (double) (numeros[i].length * numeros[i][curso-1].length)));
			mediaCentro = 0;
		}
	}
}
