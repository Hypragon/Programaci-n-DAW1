package hoja1;
/*
Leer una frase de máximo 80 caracteres y escribirla progresivamente es decir si la frase es:
“ciervo”, el programa debe imprimir:
c
ci
cie
cier
cierv
ciervo 
 */
public class H1E1 {

	public static void main(String[] args) {
		String palabraOriginal, palabraEnCadena = "";
		palabraOriginal = Metodo.getStringLim(80, "Introduce una palabra");
		for (int contador = 0; contador <= palabraOriginal.length(); contador++) {
			palabraEnCadena = palabraOriginal.substring(0, contador);
			System.out.println(palabraEnCadena);
		}
	}

}
