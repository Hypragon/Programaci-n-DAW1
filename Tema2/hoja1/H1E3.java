package hoja1;

//Algoritmo que pida un n�mero y muestre su valor despu�s de sumarle 10. 
public class H1E3 {

	public static void main(String[] args) {
		int numero;	
		numero = Metodo.getInt("Escribe un n�mero al que sumar 10");
		numero += 10;
		System.out.println("Tu n�mero m�s 10 es " + numero);

	}
}
