package hoja1;

//Algoritmo que pida dos n�meros y muestre el mayor. 
public class H1E7 {

	public static void main(String[] args) {
		int numero1, numero2;
		numero1 = Metodo.getInt("Escribe un n�mero");
		numero2 = Metodo.getInt("Escribe otro n�mero");
		if (numero1 > numero2) {
			System.out.println("El n�mero mayor es " + numero1);
		}
		else {
			System.out.println("el n�mero mayor es " + numero2);
		}
		
	}
}
