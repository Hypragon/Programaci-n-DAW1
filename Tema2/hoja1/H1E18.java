package hoja1;

/*
Realizar un algoritmo que vaya pidiendo n�meros enteros hasta que el usuario
introduzca un cero. Hay que ir visualizando cada uno de los n�meros insertados,
excepto el 0. 
*/
public class H1E18 {

	public static void main(String[] args) {
		int numero;	
		numero = Metodo.getInt("Introduzca un n�mero");
		while (numero != 0) {
			numero = Metodo.getInt("Su n�mero es " + numero + "\n"
					+ "Introduzca otro n�mero");
		}
	}
}
