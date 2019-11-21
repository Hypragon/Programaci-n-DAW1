package hoja1;

//Algoritmo que pida un número y muestre su valor después de sumarle 10. 
public class H1E3 {

	public static void main(String[] args) {
		int numero;	
		numero = Metodo.getInt("Escribe un número al que sumar 10");
		numero += 10;
		System.out.println("Tu número más 10 es " + numero);

	}
}
