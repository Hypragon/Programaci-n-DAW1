package hoja1;

//Pedir 2 n�meros enteros y decir si el primero es m�ltiplo del segundo. 
public class H1E22 {

	public static void main(String[] args) {
		int numero1, numero2;
		numero1 = Metodo.getInt("Introduce un n�mero");
		numero2 = Metodo.getInt("introduce otro n�mero");
		if (numero1 % numero2 == 0) {
			System.out.println(numero1 + " es m�ltiplo de " + numero2);
		}
		else System.out.println(numero1 + "no es m�ltiplo de " + numero2);
	}
}
