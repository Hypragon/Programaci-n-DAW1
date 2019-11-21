package hoja3;
/*
Escribe un programa que sume los números del 1 al 100 que no terminan en 5. 
 */
public class H3E13 {

	public static void main(String[] args) {
		int suma = 0;
		String numero;
		for (int contador = 1; contador <= 100; contador++) {
			numero = Integer.toString(contador);
			if (!numero.endsWith("5")) {
				suma += contador;
			}
		}
		System.out.println("La suma de todos los números del 1 al 100, sin contar los que acaban en cinco es " + suma);
	}

}
