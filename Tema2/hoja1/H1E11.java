package hoja1;

//Diseñar un algoritmo que pida por teclado tres números; si el primero es negativo, debe imprimir el producto de los tres y si no lo es, imprimirá la suma.
public class H1E11 {

	public static void main(String[] args) {
		int numero1, numero2, numero3;
		numero1 = Metodo.getInt("Introduce el primer operando");
		numero2 = Metodo.getInt("Introduce el segundo operando");
		numero3 = Metodo.getInt("Introduce el tercer operando");
		if (numero1 < 0) {
			System.out.println("La múltiplicación de " + numero1 + ", " + numero2 + " y " + numero3 + " es " + (numero1 * numero2 * numero3));
		}
		else System.out.println("La suma de " + numero1 + ", " + numero2 + " y " + numero3 + " es " + (numero1 + numero2 + numero3));
	}

}
