package hoja3;

import java.util.Arrays;

/*
3. Cargar en una matriz las notas de los alumnos de un colegio en función del
número de cursos (filas) y del número de alumnos por curso (columnas).
 */
public class H3E3 {

	public static void main(String[] args) {
		int notas[][] = new int [2][30];
		for (int contador1 = 0; contador1 < notas.length; contador1++) {
			Arrays.setAll(notas[contador1], (contador2)-> (int) (Math.random()*10+1));
		}
		for (int contador1 = 0; contador1 < notas.length; contador1++) {
			for (int contador2 = 0; contador2 < notas[contador1].length; contador2++) {
				System.out.println("El alumno " + ( contador2 + 1 ) +", del curso " + ( contador1 + 1 ) + " tiene la nota " + notas[contador1][contador2]);
			}
		}
	}

}
