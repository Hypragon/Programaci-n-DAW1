package ejercicio;

import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		TreeMap<String, Integer>notasAlumnos = new TreeMap<>();
		String apellido;
		int nota;
		apellido = Metodo.getString("Introduce el apellido del alumno (* para terminar)");
		while (!apellido.equals("*")) {
			if(!notasAlumnos.containsKey(apellido)) {
				nota = Metodo.getIntBetween(0, 10, "Introduce la nota del alumno");
				notasAlumnos.put(apellido, nota);
			}
			apellido = Metodo.getString("Introduce una cadena (* para terminar)");
		}
		System.out.println(notasAlumnos);
	}

}
