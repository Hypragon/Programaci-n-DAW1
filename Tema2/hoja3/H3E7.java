package hoja3;
/*
Modifica el programa que calcula la media para que calcule la media de los cuadrados de los max
primeros n�meros naturales. 
 */
public class H3E7 {

	public static void main(String[] args) {
		int media = 0, maximo;
		maximo = Metodo.getInt("Introduce un n�mero");
		for (int contador = 1; contador <= maximo; contador++) {
			media += Math.pow(contador, 2);
		}
		media /= maximo;
		System.out.println("La media de los cuadrados de los n�meros naturales hasta " + maximo + " es " + media);
	}

}
