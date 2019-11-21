package hoja1;

//Algoritmo que pida dos números y diga cuál de ellos es mayor o bien si son iguales. 
public class H1E8 {

	public static void main(String[] args) {
		int numero1, numero2;
		numero1 =  Metodo.getInt("Escribe un número");
		numero2 = Metodo.getInt("Escribe otro número");
		if (numero1 == numero2) {
			System.out.println("Ambos números son iguales");
		} else if (numero1 > numero2) {
			System.out.println("El número mayor es " + numero1);
		} else if (numero1 < numero2) {
			System.out.println("El número mayor es " + numero2);
		}
	}
}
