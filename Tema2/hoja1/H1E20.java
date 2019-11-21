package hoja1;

/*
Escribir un programa que vaya pidiendo n�meros hasta que el usuario introduzca un
cero. Debe mostrar por pantalla los n�meros que introduce en las posiciones
impares pero no en las pares, es decir, el primero, tercero, quinto, s�ptimo, ... que
inserte deben mostrase, pero el segundo, cuarto, sexto, octavo, ... no deben
mostrarse por pantalla.
Para realizar este ejercicio piensa que pueden anidarse sentencias de repetici�n con
sentencias de selecci�n. 
 */
public class H1E20 {

	public static void main(String[] args) {
		int numero, contador = 0;
		numero = Metodo.getInt("Introduce un n�mero");
		while (numero != 0) {
			contador++;	
			if (contador % 2 != 0) {
				System.out.println("Su n�mero es " + numero);
			}
			numero = Metodo.getInt("Introduce otro n�mero");
		}
	}
}
