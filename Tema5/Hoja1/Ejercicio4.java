package ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Ejercicio 4
Realizar un programa para que pida los datos para realizar 5 divisiones entre números enteros
(y realice las divisiones). Si se introducen datos incorrectos (números no válidos o que el
denominador sea 0) no debe abortar.
Para cada división debe pedir su numerador y su denominador y mostrar el resultado.
Al final del programa decir cuántas veces se han introducido datos incorrectos y cuántas veces
se ha intentado dividir por 0.
Tiene que llegar a hacer 5 divisiones correctas.
Puedes utilizar la clase Leer.
*/

public class ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double numerador, denominador, resultado;
		int cantidadLetrasInsertadas = 0, cantidadDivisionesEntre0 = 0;
		String basura;
		for (int contadorBucle = 0; contadorBucle < 5; contadorBucle++) {
			try {
				System.out.println("Introduce el dividendo");
				numerador = teclado.nextInt();
				System.out.println("Introduce el divisor");
				denominador = teclado.nextInt();
				resultado = (double)(numerador/denominador);
				System.out.printf("El resultado de la division entre %1.0f y %2.0f es %3.2f%n", numerador, denominador, resultado);
			} catch(InputMismatchException e) {
				System.out.println("No introducir letras a la división");
				basura = teclado.nextLine();
				contadorBucle--;
				cantidadLetrasInsertadas++;
			} catch(ArithmeticException e) {
				System.out.println("No se puede dividir entre 0");
				contadorBucle--;
				cantidadDivisionesEntre0++;
			}
		}
		System.out.println("Se han introducido " + cantidadLetrasInsertadas + " letras.");
		System.out.println("Se ha intentado dividir " + cantidadDivisionesEntre0 + " veces entre 0.");
		System.out.println("Adios");
	}

}