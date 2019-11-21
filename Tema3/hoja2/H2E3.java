package hoja2;

import java.util.Arrays;

/*
3. Leer un vector de 10 componentes y calcular el m�s grande y el m�s peque�o de ellos y los
lugares donde se encuentran
 */
public class H2E3 {

	public static void main(String[] args) {
		int numeros [] = new int [10];
		int posicionMenor = 0, posicionMayor = 0;
		Arrays.setAll(numeros, (contador)-> (int) (Math.random()*21));
		for (int contador = 0; contador < numeros.length; contador++) {
			System.out.print((contador+1) + "-" + numeros[contador] + " ");
			if (numeros[contador] < numeros[posicionMenor]) {
				posicionMenor = contador;
			}
			if (numeros[contador] > numeros[posicionMayor]) {
				posicionMayor = contador;
			}
		}
		System.out.println();
		System.out.println("El menor n�mero es " + numeros[posicionMenor] + ", que se encuentra en la posici�n " + (posicionMenor+1) + "\nEl menor n�mero es " + numeros[posicionMayor] + ", que se encuentra en la posici�n " + (posicionMayor+1));
	}

}
