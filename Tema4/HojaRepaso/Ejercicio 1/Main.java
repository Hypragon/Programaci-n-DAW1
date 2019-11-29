package github;

import java.util.Arrays;

import ejercicio.Metodo;
import ejercicio.Persona;

public class Main {

	public static void main(String[] args) {
		Integer numeroUtil;
		String cadenaUtil;
		numeroUtil = Metodo.getInt("¿Cuantas personas se van a crear?");
		Persona personas[] = new Persona[numeroUtil];
		for (int contadorBucle = 0; contadorBucle < personas.length; contadorBucle++) {
			cadenaUtil = Metodo.getString("Introduce el nombre");
			numeroUtil = Metodo.getInt("Introduce la edad");
			personas[contadorBucle] = new Persona(cadenaUtil, numeroUtil);
		}
		System.out.println(Arrays.toString(personas));
	}
}
