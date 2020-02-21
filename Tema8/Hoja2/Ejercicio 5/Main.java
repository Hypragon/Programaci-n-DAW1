package ejercicio;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<ArrayList <Tarea>> colas = new ArrayList<>();
		int random;
		for (int i = 0; i < 5; i++) {
			colas.add(new ArrayList<>());
		}
		for (int i = 0; i < colas.size(); i++) {
			for (int j = 0; j < 5; j++) {
				random = (int)(Math.random() * 100 + 1);
				if (random < 61) {
					colas.get(i).add(new Tarea(10)); 
				} else if (random > 60 && random < 86) {
					colas.get(i).add(new Tarea(20)); 
				} else if (random > 85) {
					colas.get(i).add(new Tarea(30)); 
				}
			}
		}
		ArrayList<Double> medias = new ArrayList<>();
		for (int i = 0; i < colas.size(); i++) {
			medias.add(new Double(colas.get(i).size()));
		}
		for (int i = 1; i <= 300; i++) {
			servirColas(colas);
			if (i % 5 == 0) {
				insertarTarea(colas);
			}
			if (i % 15 == 0) {
				medirCola(colas, medias);
			}
		}
		for (int i = 0; i < medias.size(); i++) {
			medias.add(i, medias.remove(i) / 20);
		}
		for (int i = 0; i < medias.size(); i++) {
			System.out.println("La media de clientes en la " + (i+1) + "º cola es " +  medias.get(i));
		}
	}

	public static void servirColas(ArrayList<ArrayList <Tarea>> colas) {
		for (int i = 0; i < colas.size(); i++) {
			if (colas.get(i).size() > 0) {
				colas.get(i).get(0).tiempo();
				if (colas.get(i).get(0).getMinutos() == 0) {
					colas.get(i).remove(0);
				}
			}
		}
	}

	public static void insertarTarea(ArrayList<ArrayList <Tarea>> colas) {
		Integer menor = null, elMenor = null;
		int random;
		for (int i = 0; i < colas.size(); i++) {
			if (menor == null || menor > colas.get(i).size()) {
				menor = colas.get(i).size();
				elMenor = i;
			}
		}
		random = (int)(Math.random() * 100 + 1);
		if (random < 61) {
			colas.get(elMenor).add(new Tarea(10)); 
		} else if (random > 60 && random < 86) {
			colas.get(elMenor).add(new Tarea(20)); 
		} else if (random > 85) {
			colas.get(elMenor).add(new Tarea(30)); 
		}
	}
	public static void medirCola(ArrayList<ArrayList <Tarea>> colas, ArrayList<Double> medias) {
		for (int i = 0; i < colas.size(); i++) {
			medias.add(i, medias.remove(i) + colas.get(i).size());
		}
	}
}
