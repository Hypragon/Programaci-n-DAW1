package hoja1;

//Algoritmo que pida dos números y decir si son iguales o distintos. 
public class H1E9 {

	public static void main(String[] args) {
		int numero1, numero2;
		numero1 = Metodo.getInt("Introduzca un número");
		numero2 = Metodo.getInt("Introduzca otro número");
		if (numero1 == numero2) {
			System.out.println("Ambos números son iguales");
		} else {
			System.out.println("Los números son distintos");
		}
	}
}
