package hoja1;

//Algoritmo que pida dos números y diga si son iguales. 
public class H1E6 {

	public static void main(String[] args) {
		int numero1, numero2;
		numero1 = Metodo.getInt("Escribe un número");
		numero2 = Metodo.getInt("Escribe otro número");	
		if (numero1 == numero2) {
			System.out.println("Los números son iguales");
		}
		else {
			System.out.println("Los números son distintos");
		}
	}

}
