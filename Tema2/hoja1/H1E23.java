package hoja1;
//Desarrollar un algoritmo que calcule y muestre el cuadrado de los 9 primeros números naturales. 
public class H1E23 {

	public static void main(String[] args) {
		for (int contador = 1; contador < 10; contador++) {
			System.out.println("El cuadrado de " + contador + " es " + Math.pow(contador, 2));
		}
	}

}
