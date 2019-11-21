package hoja2;

import java.util.Arrays;

/*
4. Generar dos vectores de dimensión 10 (dar valores aleatorios entre 1 y 5) y comprobar para
cada uno de los elementos del primer vector cuántas veces está en el segundo, es decir
 primero: 3,7,2
 segundo: 3,3,5
 el resultado debe ser:
 elemento 1: 2 veces
 elemento 2: 0 veces
 elemento 3: 0 veces 
 */
public class H2E4 {

	public static void main(String[] args) {
		int primerArray[] = new int [10];
		int segundoArray[] = new int [10];
		int vecesNumeroRepetido;
		Arrays.setAll(primerArray, (contador)-> (int) (Math.random()*5+1));
		Arrays.setAll(segundoArray, (contador)-> (int) (Math.random()*5+1));
		System.out.println(Arrays.toString(primerArray));
		System.out.println(Arrays.toString(segundoArray));
		for (int contador1 = 0; contador1 < primerArray.length; contador1++) {
			vecesNumeroRepetido = 0;
			for (int contador2 = 0; contador2 < segundoArray.length; contador2++) {
				if (primerArray[contador1] == segundoArray[contador2]) vecesNumeroRepetido++;
			}
			System.out.println("El elemento " + (contador1+1) + ", que es " + primerArray[contador1] + ", aparece " + vecesNumeroRepetido);
		}
	}

}
