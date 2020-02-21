package ejercicio;

import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		String[] nombres = {"Diego", "Víctor", "Andres", "Paula", "Rodrigo", "Daniel", "Ivan", "Adrian", "Pablo", "Rogelio"}, 
				apellidos = {"Lafuente", "Gutierrez", "Gavilanes", "Olivar", "Becerril", "Hernaiz", "Delgado", "Perez", "Asin", "Gimeno"};
		ArrayList<Alumno> alumnos = new ArrayList<>();
		TreeMap<Integer, ArrayList<Integer>> nota1 = new TreeMap<>();
		TreeMap<Integer, ArrayList<Integer>> nota2 = new TreeMap<>();
		TreeMap<Integer, ArrayList<Integer>> nota3 = new TreeMap<>();
		int option;

		for (int i = 0; i < 50; i++) {
			alumnos.add(new Alumno(nombres[(int)(Math.random()*nombres.length)], apellidos[(int)(Math.random()*apellidos.length)], (int)(Math.random()*101), (int)(Math.random()*101), (int)(Math.random()*101)));
		}
		for (int i = 0; i < alumnos.size(); i++) {
			if(nota1.containsKey(alumnos.get(i).getNota1())) {
				nota1.get(alumnos.get(i).getNota1()).add(i);
			} else {
				nota1.put(alumnos.get(i).getNota1(), new ArrayList<Integer>());
				nota1.get(alumnos.get(i).getNota1()).add(i);
			}

			if(nota2.containsKey(alumnos.get(i).getNota2())) {
				nota2.get(alumnos.get(i).getNota2()).add(i);
			} else {
				nota2.put(alumnos.get(i).getNota2(), new ArrayList<Integer>());
				nota2.get(alumnos.get(i).getNota2()).add(i);
			}

			if(nota3.containsKey(alumnos.get(i).getNota3())) {
				nota3.get(alumnos.get(i).getNota3()).add(i);
			} else {
				nota3.put(alumnos.get(i).getNota3(), new ArrayList<Integer>());
				nota3.get(alumnos.get(i).getNota3()).add(i);
			}

		}
		option = Metodo.getIntBetween(1, 3, "Introduce la nota por la que quieres ordenar los alumnos (1, 2 o 3)");
		
		switch(option) {
		default:
			break;
		case 1:
			listar(nota1, alumnos);
			break;
		case 2:
			listar(nota2, alumnos);
			break;
		case 3: 
			listar(nota3, alumnos);
			break;
		}
	}
	public static void listar(TreeMap<Integer, ArrayList<Integer>> mapa, ArrayList<Alumno> alumnos) {
		for(Entry<Integer, ArrayList<Integer>> entry : mapa.entrySet()) {
			System.out.println("Alumnos con la nota " + entry.getKey());
			for (int i = 0; i < entry.getValue().size(); i++) {
				System.out.println(alumnos.get(entry.getValue().get(i)));
			}
		}
	}

}
