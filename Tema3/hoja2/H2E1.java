package hoja2;

import java.util.Arrays;

/*
1. Se generan 20 n�meros aleatorios de tipo entero y se almacenan en un vector. Hay que calcular
y mostrar la media y, adem�s, mostrar cu�ntos n�meros hay:
-Superiores a la media
-Inferiores a la media
-Iguales a la media 
 */
public class H2E1 {

	public static void main(String[] args) {
		int arrayNumeros[] = new int [20];
		int mayoresQueLaMedia = 0, menoresQueLaMedia = 0, igualesALaMedia = 0, media = 0;
		Arrays.setAll(arrayNumeros, (contador)-> (int) (Math.random()*24));
		for (int contador = 0; contador < arrayNumeros.length; contador++) {
			media += arrayNumeros[contador];
		}
		media /= arrayNumeros.length;
		for (int contador = 0; contador < arrayNumeros.length; contador++) {
			if (arrayNumeros[contador] == (int)media) {
				igualesALaMedia++;
			} else if (arrayNumeros[contador] > media) {
				mayoresQueLaMedia++;
			} else if (arrayNumeros[contador] < media) {
				menoresQueLaMedia++;
			}
		}
		System.out.println("Los n�meros son:");
		for (int contador = 0; contador < arrayNumeros.length; contador++) {
			System.out.print(arrayNumeros[contador] + ", ");
		}
		System.out.println();
		System.out.println("La media de esos n�meros es " + media + ". Hay " + igualesALaMedia + " n�meros iguales a la media, " + mayoresQueLaMedia + " mayores y " + menoresQueLaMedia + " menores.");
	}
}


