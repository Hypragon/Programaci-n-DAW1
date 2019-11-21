package hoja1;

//Pedir 2 números enteros y decir si el primero es múltiplo del segundo. 
public class H1E22 {

	public static void main(String[] args) {
		int numero1, numero2;
		numero1 = Metodo.getInt("Introduce un número");
		numero2 = Metodo.getInt("introduce otro número");
		if (numero1 % numero2 == 0) {
			System.out.println(numero1 + " es múltiplo de " + numero2);
		}
		else System.out.println(numero1 + "no es múltiplo de " + numero2);
	}
}
