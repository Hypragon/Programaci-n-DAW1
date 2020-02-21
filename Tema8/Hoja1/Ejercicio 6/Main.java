package ejercicio;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<>();
		String str;
		int n, i = 0;
		str = Metodo.getString("Introduce una cadena (* para terminar)");
		while (!str.equals("*")) {
			tree.add(str);
			str = Metodo.getString("Introduce una cadena (* para terminar)");
		}
		n = Metodo.getIntBetween(0, tree.size(), "Introduce un número que entre dentro del arbol");	
		for (String strg : tree) {
			if(i < n) {
				System.out.print(strg + " * ");
			}
		}
	}
}
