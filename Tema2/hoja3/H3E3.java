package hoja3;
/*
Escribe un programa que pida 3 números por teclado y los muestre en pantalla ordenados
ascendentemente. 
 */
public class H3E3 {

	public static void main(String[] args) {
		int numero1, numero2, numero3;
		numero1 = Metodo.getInt("Introduce el primer número");
		numero2 = Metodo.getInt("Introduce el segundo número");
		numero3 = Metodo.getInt("Introduce el tercer número");
		for (int contador = 0; contador < 3; contador++) {
			if (numero1 >= numero2) {
				if (numero1 >= numero3) {
					System.out.println(numero1);
					numero1 = 0;
				} else if (numero1 < numero3){
					System.out.println(numero3);
					numero3 = 0;
				}
			} else if (numero1 < numero2) {
				if (numero2 >= numero3) {
					System.out.println(numero2);
					numero2 = 0;
				} else if (numero2 < numero3) {
					System.out.println(numero3);
					numero3 = 0;
				}
			}
		}
	}

}
