package hoja1;

//Algoritmo que pida dos n�meros y diga si son iguales. 
public class H1E6 {

	public static void main(String[] args) {
		int numero1, numero2;
		numero1 = Metodo.getInt("Escribe un n�mero");
		numero2 = Metodo.getInt("Escribe otro n�mero");	
		if (numero1 == numero2) {
			System.out.println("Los n�meros son iguales");
		}
		else {
			System.out.println("Los n�meros son distintos");
		}
	}

}
