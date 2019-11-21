package hoja2;
/*
9. Hacer un programa para que extraiga cartas de una baraja española, con reemplazamiento, esto
es, una carta que sale puede volver a salir.
La notación del naipe será A234567(num de carta) y OCEP (oros copas espadas bastos) para el
palo.
 */
public class H2E9 {

	public static void main(String[] args) {
		int parar = 0;
		String carta;
		String palos[] = {" de oros", " de copas", " de espadas", " de bastos"};
		char cartas[] = {'A', '2', '3', '4', '5', '6', '7'};
		while (parar == 0) {
			carta = "" + cartas[(int)(Math.random()*7)] + palos[(int)(Math.random()*4)];
			System.out.println(carta);
			parar = Metodo.getInt("Introduce 0 si quieres seguir jugando");
		}
	}

}
