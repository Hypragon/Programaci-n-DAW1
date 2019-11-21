package hoja3;
/*
Escribe un programa que resuelva ecuaciones de segundo grado en la suposición de que existen raíces
reales. 
 */
public class H3E1 {

	public static void main(String[] args) {
		int valor1, valor2, valor3, x, x2;	
		valor1 = Metodo.getInt("Introduce el valor que acompaña a X^2");
		valor2 = Metodo.getInt("Introduce el valor que acompaña a X");
		valor3 = Metodo.getInt("Introduce el valor del número entero");
		x = Metodo.equationX(valor1, valor2, valor3);
		x2 = Metodo.equationXQ(valor1, valor2, valor3);
		System.out.println("El valor de X^2 es " + x2 + " y el valor de X es " + x);
	}

}
