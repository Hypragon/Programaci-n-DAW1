package hoja1;

/*
Escribir un programa que vaya pidiendo números hasta que el usuario introduzca un
cero, para cada número introducido, debe mostrar por pantalla si el número es par o
impar. Recuerda que pueden anidarse sentencias de repetición y de selección. 
 */
public class H1E21 {

	public static void main(String[] args) {
		int numero;
		numero = Metodo.getInt("Introduce un número");
		while (numero != 0) {
			if (numero % 2 == 0) {
				System.out.println(numero + " es un número par");
			} else {
				System.out.println(numero + " es un número impar");
			}
			numero = Metodo.getInt("Introduce otro número");
		}
	}
}
