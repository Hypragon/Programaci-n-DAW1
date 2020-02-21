
package ejercicio;

import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		int partidos = (int)(Math.random() * 2 + 2), escanyos = (int)(Math.random() * 4 + 2), total = 0, mayor = 0;
		TreeMap<String, ArrayList<Integer>> elecciones = new TreeMap<>();
		TreeMap<Integer, ArrayList<String>> resultado = new TreeMap<>();
		ArrayList<Integer> resultadoFinal = new ArrayList<>();
		for (int i = 0; i < partidos; i++) {
			elecciones.put("Partido " + (i+1), new ArrayList<Integer>());
		}
		for (Entry<String, ArrayList<Integer>> entry : elecciones.entrySet()) {
			int n = (int)(Math.random()* 19550 + 50);
			entry.getValue().add(0);
			for (int i = 0; i < escanyos; i++) {		
				entry.getValue().add(i+1, n/(i+1));
			}
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		for (Entry<String, ArrayList<Integer>> entry : elecciones.entrySet()) {
			total += entry.getValue().get(1);
		}
		try {
			for (Entry<String, ArrayList<Integer>> entry : elecciones.entrySet()) {
				if(entry.getValue().get(1) < (total *0.05)) {
					elecciones.remove(entry.getKey());
				}
			}
		} catch(Exception e) {
			System.out.println("Java te odio");
		}
		System.out.println("----------------------");
		for (int i = 0; i < escanyos; i++) {
			for (Entry<String, ArrayList<Integer>> entry : elecciones.entrySet()) {
				for(int j = 1; j < entry.getValue().size(); j++) {
					if (entry.getValue().get(j) > mayor) {
						mayor = entry.getValue().get(j);
					}
				}
			}
			
			for (Entry<String, ArrayList<Integer>> entry : elecciones.entrySet()) {
				boolean votado = false;
				for(int j = 1; j < entry.getValue().size(); j++) {
					if (entry.getValue().get(j) == mayor) {
						entry.getValue().set(0, (entry.getValue().get(0) + 1));
						entry.getValue().remove(j);
						votado = true;
						break;
					}
					if(votado) {
						break;
					}
				}
			}
			mayor = 0;
		}
		for (Entry<String, ArrayList<Integer>> entry : elecciones.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue().get(0));
			if(resultado.containsKey(entry.getValue().get(0))) {
				resultado.get(entry.getValue().get(0)).add(entry.getKey());
			} else {
				resultado.put(entry.getValue().get(0), new ArrayList<>());
				resultado.get(entry.getValue().get(0)).add(entry.getKey());
			}
		}
		for (Entry<Integer, ArrayList<String>> entry : resultado.entrySet()) {
			resultadoFinal.add(entry.getKey());
		}
		for (int i = resultadoFinal.size() - 1; i >= 0; i--) {
			System.out.println("Partidos con " + resultadoFinal.get(i) + " escaños: " + resultado.get(resultadoFinal.get(i)));
		}
	}
}
