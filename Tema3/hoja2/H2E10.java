package hoja2;

import java.util.Arrays;

/*
10. Hacer un programa para que extraiga todas las cartas de la baraja anterior pero sin
reemplazamiento, es decir una carta que sale no puede volver a salir, ir mostrando en pantalla
las cartas que salen. 
 */
public class H2E10 {

	public static void main(String[] args) {
		int parar = 0, palo = 0, numero = 0;
		boolean pararJuego = false;
		String carta;
		String palos[] = {" de oros", " de copas", " de espadas", " de bastos"};
		char cartas[][] = {
				{'A', '2', '3', '4', '5', '6', '7'},
				{'A', '2', '3', '4', '5', '6', '7'},
				{'A', '2', '3', '4', '5', '6', '7'},
				{'A', '2', '3', '4', '5', '6', '7'}
		};
		char arrayVacio[][] = new char [cartas.length][cartas[0].length];
		for (int contador = 0; contador < arrayVacio.length; contador++) {
			Arrays.fill(arrayVacio[contador], '0');
		}
		while (parar == 0 && !pararJuego) {
			for (int contador = 0; contador < cartas.length; contador++) {
				System.out.println(Arrays.toString(cartas[contador]));
			}
			do {
				palo = (int)(Math.random()*4);
				numero = (int)(Math.random()*7);
				carta = "" + cartas[palo][numero] + palos[palo];
			} while (cartas[palo][numero] == '0');
			cartas[palo][numero] = '0';
			if (Arrays.equals(cartas[palo], arrayVacio[palo])) palos[palo] = "0";
			System.out.println(carta);
			parar = Metodo.getInt("Introduce 0 si quieres seguir jugando");
			pararJuego = Metodo.compararArray(cartas, arrayVacio);
		}
		if (pararJuego) System.out.println("Ya no quedan cartas");
	}


}


