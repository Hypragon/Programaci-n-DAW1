package hoja3;
/*
Pedir dos números por teclado y mostrar los números primos, la suma de los pares y la suma de los
impares comprendidos entre ambos:
a. Incluyendo ambos números. 
 */
public class H3E15a {

	public static void main(String[] args) {
		int numero1, numero2, cantidadPares = 0, cantidadImpares = 0;
		numero1 = Metodo.getInt("Introduce un número");
		numero2 = Metodo.getInt("Introduce otro número");
		for (int contador = numero1; contador <= numero2; contador++) {
			if (Metodo.numPri(contador)) {
				System.out.println(contador +" es un número primo entre " + numero1 + " y " + numero2);
			}
			if (contador % 2 == 0) {
				cantidadPares += contador;
			} else {
				cantidadImpares += contador;
			}
		}
		System.out.println("La suma de los números pares entre " + numero1 + " y " + numero2 + " es " + cantidadPares + " y la de los impares es " + cantidadImpares);
	}
}
