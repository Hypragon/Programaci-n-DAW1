package hoja1;

//Algoritmo que pida un n�mero y visualice por pantalla si es par o impar. 
public class H1E12 {

	public static void main(String[] args) {
		int numero;
		numero = Metodo.getInt("Introduce un n�mero");
		while (numero == 0) {
			numero = Metodo.getInt("Introduce un n�mero distinto de 0");
		}
		if (numero % 2 == 0) System.out.println("El n�mero es par");
		else System.out.println("El n�mero es impar");
	}

}
