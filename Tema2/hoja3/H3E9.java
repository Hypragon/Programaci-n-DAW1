package hoja3;
/*
Leer un car�cter y un n�mero por teclado. Dise�ar un programa que imprima una l�nea con N veces ese
car�cter, donde N es un n�mero le�do por teclado. Por ejemplo, despu�s de teclear �*� y 3 el programa
imprimir� �***�. Adem�s, el programa verificar� si el n�mero introducido es correcto (mayor que cero e
inferior a la longitud de una l�nea. Suponemos que la longitud m�xima de la l�nea es de 80 caracteres).  */
public class H3E9 {

	public static void main(String[] args) {
		String resultado = "";
		char caracter;
		int vez;
		caracter = Metodo.getString("Introduce el c�racter que quieres repetir").charAt(0);
		vez = Metodo.getIntBetween(1, 80, "Introduce la cantidad de veces que quieres que se repita, entre 1 y 80");
		for (int i = 1; i <= vez; i++) {
			resultado = resultado + caracter;
		}
		System.out.println(resultado);
	}
}
