package ejercicio;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main{
	public static void main(String[] args) {
		HashSet<Integer> objHashSet = new HashSet<>();
		LinkedHashSet<Integer> objLinkHashSet = new LinkedHashSet<>();
		TreeSet<Integer> objTreeSet = new TreeSet<>();
		int ran = (int)(Math.random()*15)+1;
		int n;
		System.out.println("Se van a generar " + ran + " datos.\nInsertando:");
		for (int i = 0; i < ran; i++) {
			n = (int)(Math.random()*7001)+1000;
			System.out.print(n + " * ");
			objHashSet.add(n);
			objLinkHashSet.add(n);
			objTreeSet.add(n);
		}
		System.out.println();
		System.out.println("Valores de objHashSet:");
		for (int i: objHashSet) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Valores de objLinkHashSet:");
		for (int i: objLinkHashSet) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Valores de objTreeSet:");
		for (int i: objTreeSet) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Valores de objHashSet: " + objHashSet.toString());
		System.out.println("Valores de objLinkHashSet: " + objLinkHashSet.toString());
		System.out.println("Valores de objTreeSet: " + objTreeSet.toString());

	}
}
