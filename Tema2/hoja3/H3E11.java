package hoja3;
/*
Escribe un programa que cuente el n�mero de ceros aparecidos en una secuencia de n�meros enteros
terminada en un n�mero negativo. 
 */
public class H3E11 {

	public static void main(String[] args) {
		int contador2 = 0, numero;
		String secuenciaEnteros;
		secuenciaEnteros = Metodo.getString("Introduce un n�mero");	
		numero = Integer.parseInt(secuenciaEnteros);
		while (numero > 0) {
			for (int contador1 = 0; contador1 < secuenciaEnteros.length(); contador1++) {
				if (secuenciaEnteros.charAt(contador1) == '0') {
					contador2++;
				}
			}
			secuenciaEnteros = Metodo.getString("Introduce un n�mero");
			numero = Integer.parseInt(secuenciaEnteros);
		}
		System.out.println("La cantidad de 0 entre los n�meros introducidos es " + contador2);
	}
}
