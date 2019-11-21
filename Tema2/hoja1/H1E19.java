package hoja1;

/*
Realizar un algoritmo que vaya pidiendo n�meros enteros hasta que el usuario
introduzca un cero. Hay que ir visualizando cada uno de los n�meros insertados,
excepto el 0. 
 */
public class H1E19 {

	public static void main(String[] args) {
		int numero;	
		int suma = 0;
		int contador = 0;
		numero = Metodo.getInt("Introduzca un n�mero");
		while (numero != 0) {
			suma += numero;
			numero = Metodo.getInt("Introduzca otro n�mero");
			contador++;	
		}
		System.out.println("La suma de los n�meros introducidos es " + suma + "\n"
				+ "Has introducido " + contador + " n�meros");	
	}
}
