package hoja1;

/*
Realizar un algoritmo que lea un n�mero por teclado. En caso de que ese n�mero
sea 0 o menor que 0, se saldr� del programa imprimiendo antes un mensaje de
error. Si es mayor que 0, se deber� calcular su cuadrado y la ra�z cuadrada del
mismo, visualizando el numero que ha tecleado el usuario y su resultado (�Del
numero X, su potencia es X y su ra�z X�). Para calcular la ra�z cuadrada se puede
usar la funci�n interna RAIZ(X) o con una potencia de 0,5.
*/
public class H1E16 {

	public static void main(String[] args) {
		int numero;	
		numero = Metodo.getInt("Introduzca un n�mero");
		if (numero > 0) {
			System.out.println("Su n�mero es " + numero + ", su cuadrado es " + Math.pow(numero, 2) + " y su ra�z es " + Math.sqrt(numero));
		}
	}
}


