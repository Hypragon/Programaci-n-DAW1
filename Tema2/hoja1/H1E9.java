package hoja1;

//Algoritmo que pida dos n�meros y decir si son iguales o distintos. 
public class H1E9 {

	public static void main(String[] args) {
		int numero1, numero2;
		numero1 = Metodo.getInt("Introduzca un n�mero");
		numero2 = Metodo.getInt("Introduzca otro n�mero");
		if (numero1 == numero2) {
			System.out.println("Ambos n�meros son iguales");
		} else {
			System.out.println("Los n�meros son distintos");
		}
	}
}
