package ejercicio1;
/*
Ejercicio 1
Pide por teclado 5 números enteros y guárdalos en un array de enteros. Al finalizar mostrar los
5 números. Cuando el usuario introduzca un dato numérico no entero, no debe contar como
dato insertado. No utilices la clase Leer.
NOTA: La excepción que lanza la clase Scanner cuando el usuario introduce un tipo de dato
que no se corresponde con el leído es InputMismatchException. Utiliza la clase Scanner.
Parte 2 del ejercicio 1:
Ahora muestra cuántas veces se introducen datos erróneos.
 */

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int numeros[] = new int[5];
		String basura;
		for (int contadorBucle = 0; contadorBucle < 5; contadorBucle++) {
			System.out.println("Introduce el " + (contadorBucle+1) + "º número");
			try {
				numeros[contadorBucle] = teclado.nextInt();
			} catch (InputMismatchException e){
				System.out.println("Este dato es incorrecto.");
				contadorBucle--;
				basura = teclado.nextLine();
			}
		}
		System.out.println("Los números introducidos son: " + Arrays.toString(numeros));
	}
}
