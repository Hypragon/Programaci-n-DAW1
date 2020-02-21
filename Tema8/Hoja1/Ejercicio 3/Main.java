package ejercicio;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		int aleatorio = (int)(Math.random()*15)+1, n;
		ArrayList<Integer> arr = new ArrayList<>();
		LinkedList<Integer> link = new LinkedList<>();
		System.out.println("Se van a generar " + aleatorio + " datos.\nInsertando:");
		for (int i = 0; i < aleatorio; i++) {
			n = (int)(Math.random()*15)+1;
			System.out.print(n + " * ");
			arr.add(n);
			link.add(n);
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
