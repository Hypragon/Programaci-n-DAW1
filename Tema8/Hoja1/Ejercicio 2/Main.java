package ejercicio;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main{
	public static void main(String[] args) {
		HashSet<String> objHashSet = new HashSet<>();
		LinkedHashSet<String> objLinkHashSet = new LinkedHashSet<>();
		TreeSet<String> objTreeSet = new TreeSet<>();
		int ran = (int)(Math.random()*15)+1;
		int n;
		String[] str = {"este", "montaña", "letra", "bajo", "frio", "aleatorio"};
		System.out.println("Se van a generar " + ran + " datos.\nInsertando:");
		for (int i = 0; i < ran; i++) {
			n = (int)(Math.random()*str.length);
			System.out.print(str[n] + " * ");
			objHashSet.add(str[n]);
			objLinkHashSet.add(str[n]);
			objTreeSet.add(str[n]);
		}
		System.out.println();
		System.out.println("Valores de objHashSet:");
		for (String i: objHashSet) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Valores de objLinkHashSet:");
		for (String i: objLinkHashSet) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Valores de objTreeSet:");
		for (String i: objTreeSet) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Valores de objHashSet: " + objHashSet.toString());
		System.out.println("Valores de objLinkHashSet: " + objLinkHashSet.toString());
		System.out.println("Valores de objTreeSet: " + objTreeSet.toString());

	}
}
