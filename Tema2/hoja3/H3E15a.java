package hoja3;
/*
Pedir dos n�meros por teclado y mostrar los n�meros primos, la suma de los pares y la suma de los
impares comprendidos entre ambos:
a. Incluyendo ambos n�meros. 
 */
public class H3E15a {

	public static void main(String[] args) {
		int numero1, numero2, cantidadPares = 0, cantidadImpares = 0;
		numero1 = Metodo.getInt("Introduce un n�mero");
		numero2 = Metodo.getInt("Introduce otro n�mero");
		for (int contador = numero1; contador <= numero2; contador++) {
			if (Metodo.numPri(contador)) {
				System.out.println(contador +" es un n�mero primo entre " + numero1 + " y " + numero2);
			}
			if (contador % 2 == 0) {
				cantidadPares += contador;
			} else {
				cantidadImpares += contador;
			}
		}
		System.out.println("La suma de los n�meros pares entre " + numero1 + " y " + numero2 + " es " + cantidadPares + " y la de los impares es " + cantidadImpares);
	}
}
