package ejercicio;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<>();
		int n = 0;
		do {
			n = Metodo.getInt("Introduce un número (-9999 para terminar)");
			tree.add(n);
		} while (n != -9999);
		for (int m: tree) {
			System.out.print(m + " * ");
		}
	}
}
