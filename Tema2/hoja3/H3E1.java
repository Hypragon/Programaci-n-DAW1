package hoja3;
/*
Escribe un programa que resuelva ecuaciones de segundo grado en la suposici�n de que existen ra�ces
reales. 
 */
public class H3E1 {

	public static void main(String[] args) {
		int valor1, valor2, valor3, x, x2;	
		valor1 = Metodo.getInt("Introduce el valor que acompa�a a X^2");
		valor2 = Metodo.getInt("Introduce el valor que acompa�a a X");
		valor3 = Metodo.getInt("Introduce el valor del n�mero entero");
		x = Metodo.equationX(valor1, valor2, valor3);
		x2 = Metodo.equationXQ(valor1, valor2, valor3);
		System.out.println("El valor de X^2 es " + x2 + " y el valor de X es " + x);
	}

}
