package ejercicio;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		int aleatorio = (int)(Math.random()*15)+1, n;
		ArrayList<String> arr = new ArrayList<>();
		LinkedList<String> link = new LinkedList<>();
		String[] str = {"este", "montaña", "letra", "bajo", "frio", "aleatorio"};
		System.out.println("Se van a generar " + aleatorio + " datos.\nInsertando:");
		for (int i = 0; i < aleatorio; i++) {
			n = (int)(Math.random()*str.length);
			System.out.print(str[n] + " * ");
			arr.add(str[n]);
			link.add(str[n]);
		}
		
		System.out.println("\nValores de objArrayList: ");
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}
		System.out.println("\nValores de objLinkedList");
		for (int i = 0; i < link.size(); i++) {
			System.out.print(link.get(i) + " ");
		}
		System.out.print("\nValores de objArrayList: " + arr.toString());
		System.out.print("\nValores de objLinkedList: " + link.toString());
	}
}
