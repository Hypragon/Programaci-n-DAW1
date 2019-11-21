package hoja3;
/*
Modifica el programa de los factoriales para que calcule repetidamente factoriales hasta que
introduzcamos un cero por teclado (en cuyo caso escribe el factorial de cero, que es 1, y termina). 
 */
public class H3E8 {

	public static void main(String[] args) {
		int factorial, multiplicacionFactorial;
		do {
			multiplicacionFactorial = 1;
			factorial = Metodo.getInt("Introduce un número");
			for (int i = 1; i <= factorial; i++) {
				multiplicacionFactorial *= i;
			}
			System.out.println("El factorial de " + factorial + " es " + multiplicacionFactorial);
		}
		while (factorial != 0);
	}

}
