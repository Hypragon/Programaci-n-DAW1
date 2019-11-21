package hoja2;

import java.util.Arrays;

/*
8. Tenemos 10 asignaturas y 10 alumnos numerados del 1 al 10, introducimos las 10 notas de los
10 alumnos (generación aleatoria de 1 a 10) y pidiendo por teclado bien número de asignatura
ó bien número de alumno, calcular media del alumno tecleado ó media de la asignatura
tecleada. 
 */
public class H2E8 {

	public static void main(String[] args) {
		int numeros[][] = new int [10][10], opcionMenu, elegirConsulta;
		double media = 0;
		for (int contador1 = 0; contador1 < numeros.length; contador1++) {
			Arrays.setAll(numeros[contador1], (contadro2)-> (int) (Math.random()*10+1));
			System.out.println(Arrays.toString(numeros[contador1]));
		}
		opcionMenu = Metodo.getIntBetween(0, 2, "Elige si quieres saber la media de un alumno (1) o de una asignatura (2). Salir(0)");
		while (opcionMenu != 0) {
			elegirConsulta = Metodo.getIntBetween(1, 10, "Introduce el número asignado la fila o columna que quieres conocer") - 1;
			switch (opcionMenu) {
			default:
				break;
			case 1:
				for (int i = 0; i < numeros[elegirConsulta].length; i++) {
					media += (double)(numeros[elegirConsulta][i]);
				}
				media /= (double)(numeros[elegirConsulta].length);
				System.out.println("La media del alumno " + ++elegirConsulta + " es " + media);
				break;
			case 2:
				for (int i = 0; i < numeros.length; i++) {
					media += (double)(numeros[i][elegirConsulta]);
				}
				media /= (double)(numeros.length);
				System.out.println("La media de la asignatura " + ++elegirConsulta + " es " + media);
				break;
			}
			opcionMenu = Metodo.getIntBetween(0, 2, "Elige si quieres saber la media de un alumno (1) o de una asignatura (2). Salir(0)");
		};
	}

}
