package hoja1;

//Algoritmo que lea tres números distintos y nos diga cuál de ellos es el mayor. 
public class H1E10 {

	public static void main(String[] args) {
		int numero1, numero2, numero3;
		numero1 = Metodo.getInt("Introduce un número");
		numero2 = Metodo.getInt("Introduce un segundo número");	
		numero3 = Metodo.getInt("Introduce un tercer número");
		if (numero1 > numero2) {
			if (numero1 > numero3) {
				System.out.println("El mayor número es " + numero1);
			} else {
				System.out.println("El mayor número es " + numero3);
			}
		} else {
			if (numero2 > numero3) {
				System.out.println("El mayor número es " + numero2);
			} else {
				System.out.println("El mayor número es " + numero3);
			}
		}
	}
}
