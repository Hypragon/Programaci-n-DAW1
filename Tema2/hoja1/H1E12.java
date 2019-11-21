package hoja1;

//Algoritmo que pida un número y visualice por pantalla si es par o impar. 
public class H1E12 {

	public static void main(String[] args) {
		int numero;
		numero = Metodo.getInt("Introduce un número");
		while (numero == 0) {
			numero = Metodo.getInt("Introduce un número distinto de 0");
		}
		if (numero % 2 == 0) System.out.println("El número es par");
		else System.out.println("El número es impar");
	}

}
