package hoja3;
/*
Leer un carácter y un número por teclado. Diseñar un programa que imprima una línea con N veces ese
carácter, donde N es un número leído por teclado. Por ejemplo, después de teclear ‘*’ y 3 el programa
imprimirá ‘***’. Además, el programa verificará si el número introducido es correcto (mayor que cero e
inferior a la longitud de una línea. Suponemos que la longitud máxima de la línea es de 80 caracteres).  */
public class H3E9 {

	public static void main(String[] args) {
		String resultado = "";
		char caracter;
		int vez;
		caracter = Metodo.getString("Introduce el cáracter que quieres repetir").charAt(0);
		vez = Metodo.getIntBetween(1, 80, "Introduce la cantidad de veces que quieres que se repita, entre 1 y 80");
		for (int i = 1; i <= vez; i++) {
			resultado = resultado + caracter;
		}
		System.out.println(resultado);
	}
}
