package hoja3;
/*
Haz un programa que resuelva la ecuación de segundo grado para cualquier trío de valores de los
coeficientes. 
 */

public class H3E4 {

	public static void main(String[] args) {
		int valorX2, valorX, valorN, x, x2;
		valorX2 = Metodo.getInt("Introduce el valor que acompaña a X^2");
		valorX = Metodo.getInt("Introduce el valor que acompaña a X");
		valorN = Metodo.getInt("Introduce el valor del número entero");
		x = Metodo.equationX(valorX2, valorX, valorN);
		x2 = Metodo.equationXQ(valorX2, valorX, valorN);
		System.out.println("El valor de X^2 es " + x2 + " y el valor de X es " + x);
	}

}
