package ejercicio;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		TreeMap<Integer, ArrayList<String>>notasAlumnos = new TreeMap<>();
		String apellido = "";
		int nota;
		boolean encontrado = false;
		for (int i = 0; i < 11; i++) {
			notasAlumnos.put(i, new ArrayList<String>());
		}
		do{
			apellido = Metodo.getString("Introduce el apellido del alumno (* para terminar)");
			encontrado = encontrarApellido(notasAlumnos, apellido);	
		}while(encontrado);
		while (!apellido.equals("*")) {	
			nota = Metodo.getIntBetween(0, 10, "Introduce la nota del alumno");
			notasAlumnos.get(nota).add(apellido);
			do{
				apellido = Metodo.getString("Introduce el apellido del alumno (* para terminar)");
				encontrado = encontrarApellido(notasAlumnos, apellido);	
			}while(encontrado);
		}
		System.out.println(notasAlumnos);
	}

	private static boolean encontrarApellido(Map<Integer, ArrayList<String>> tree, String apellido) {
		boolean boo = false;
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < tree.get(i).size(); i++) {
				if(tree.get(i).get(j).contentEquals(apellido)) {
					boo = true;
					break;
				}
			}
		}
		return boo;
	}
}