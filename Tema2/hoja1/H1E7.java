package hoja1;

//Algoritmo que pida dos números y muestre el mayor. 
public class H1E7 {

	public static void main(String[] args) {
		int numero1, numero2;
		numero1 = Metodo.getInt("Escribe un número");
		numero2 = Metodo.getInt("Escribe otro número");
		if (numero1 > numero2) {
			System.out.println("El número mayor es " + numero1);
		}
		else {
			System.out.println("el número mayor es " + numero2);
		}
		
	}
}
