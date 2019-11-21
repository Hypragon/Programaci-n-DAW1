package hoja3;
/*
Escribe un programa que lea un entero de tres cifras y lo invierta. 
 */
public class H3E2 {

	public static void main(String[] args) {
		int numero, variable1, variable2, variable3, resultado;
		numero = Metodo.getInt("Introduce un número de 3 cifras");
		while (numero < 100 || numero > 999) {
			numero = Metodo.getInt("Ese número no es de 3 cifras, dame un número de tres cifras");
		}
		variable1 = numero / 100;
		variable2 = (numero % 100) / 10;
		variable3 = numero % 10;
		resultado = variable1 + (variable2 * 10) + (variable3 * 100);
		System.out.println("La versión invertida de " + numero + " es " + resultado);
	}

}
