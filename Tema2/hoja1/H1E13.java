package hoja1;

/*
Dadas dos variables numéricas a y b, que el usuario debe introducir por teclado, se
pide realizar un algoritmo que intercambie los valores de ambas variables y
muestre por pantalla cuánto valen al final las dos variables.
 */
public class H1E13 {

	public static void main(String[] args) {
		String guardarValor, variable1, variable2;
		variable1 = Metodo.getString("Introduce el primer valor");
		variable2 = Metodo.getString("Introduce el segundo valor");	
		guardarValor = variable1;
		variable1 = variable2;
		variable2 = guardarValor;
		System.out.println("El segundo valor es " + variable1 + 
				"\nEl primer valor es " + variable2);	
	}
}
