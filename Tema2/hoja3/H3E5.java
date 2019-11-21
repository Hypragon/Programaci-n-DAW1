package hoja3;
/*
Escribe un programa que calcule la media de los números naturales entre el 10 y el 15, ambos inclusive. 
 */
public class H3E5 {

	public static void main(String[] args) {
		double contador2 = 0, media = 0;
		for (int contador = 10; contador <= 15; contador++) {
			contador2++;
			media += contador;
		}
		media /= contador2;
		System.out.println("La media de los números comprendidos entre 10 y 15 es " + media);
	}

}
