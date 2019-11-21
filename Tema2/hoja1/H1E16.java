package hoja1;

/*
Realizar un algoritmo que lea un número por teclado. En caso de que ese número
sea 0 o menor que 0, se saldrá del programa imprimiendo antes un mensaje de
error. Si es mayor que 0, se deberá calcular su cuadrado y la raíz cuadrada del
mismo, visualizando el numero que ha tecleado el usuario y su resultado (“Del
numero X, su potencia es X y su raíz X”). Para calcular la raíz cuadrada se puede
usar la función interna RAIZ(X) o con una potencia de 0,5.
*/
public class H1E16 {

	public static void main(String[] args) {
		int numero;	
		numero = Metodo.getInt("Introduzca un número");
		if (numero > 0) {
			System.out.println("Su número es " + numero + ", su cuadrado es " + Math.pow(numero, 2) + " y su raíz es " + Math.sqrt(numero));
		}
	}
}


