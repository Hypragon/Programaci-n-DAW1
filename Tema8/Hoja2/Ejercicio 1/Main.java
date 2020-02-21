package ejercicio;


public class Main {

	public static void main(String[] args) {
		Pila pila = new Pila();
		for (int i = 0; i < 5; i++) {
			pila.push(i);
		}
		System.out.println("La capacidad de la pila es " + pila.size());
		while (!pila.isEmpty()) {
			System.out.println("El elemento en la cima de la pila es " + pila.pop());
		}
	}

}
