package hoja1;

/*
Escribir un programa que vaya pidiendo n�meros hasta que el usuario introduzca un
cero, para cada n�mero introducido, debe mostrar por pantalla si el n�mero es par o
impar. Recuerda que pueden anidarse sentencias de repetici�n y de selecci�n. 
 */
public class H1E21 {

	public static void main(String[] args) {
		int numero;
		numero = Metodo.getInt("Introduce un n�mero");
		while (numero != 0) {
			if (numero % 2 == 0) {
				System.out.println(numero + " es un n�mero par");
			} else {
				System.out.println(numero + " es un n�mero impar");
			}
			numero = Metodo.getInt("Introduce otro n�mero");
		}
	}
}
