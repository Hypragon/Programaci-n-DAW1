package hoja3;
/*
Haz un programa que calcule la media de los primeros max números naturales (con max introducido
previamente por teclado). 
 */
public class H3E6 {

	public static void main(String[] args) {
		int maximo, media = 0;
		maximo = Metodo.getInt("Introduce un número");
		for (int contador = 1; contador <= maximo; contador++) {
			media += contador;
		}
		media /= maximo;
		System.out.println("La media de los números naturales hasta " + maximo + " es " + media);
	}

}
