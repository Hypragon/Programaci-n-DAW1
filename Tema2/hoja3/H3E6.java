package hoja3;
/*
Haz un programa que calcule la media de los primeros max n�meros naturales (con max introducido
previamente por teclado). 
 */
public class H3E6 {

	public static void main(String[] args) {
		int maximo, media = 0;
		maximo = Metodo.getInt("Introduce un n�mero");
		for (int contador = 1; contador <= maximo; contador++) {
			media += contador;
		}
		media /= maximo;
		System.out.println("La media de los n�meros naturales hasta " + maximo + " es " + media);
	}

}
