package ejercicio;

public class Main {
	public static void main(String[] args) {
		CarroDeLaCompra carro;
		int option, n;
		double d;
		String str;
		boolean bool = true;
		option = Metodo.getIntBetween(0, 1, "0. Modo Manual\n"
				+ "1. Modo Aleatorio");
		switch (option) {
		case 0:
			n = Metodo.getIntPos("Introduce la capacidad del carro");
			carro = new CarroDeLaCompra(n);
			do {
				option = Metodo.getIntBetween(0, 3, "1. Añadir objeto al carro\n"
						+ "2. Añadir espacio al carro\n"
						+ "3. Ver la lista actual\n"
						+ "0. Acabar la compra");
				switch (option) {
				case 1:
					str = Metodo.getString("Introduce el nombre del producto");
					d = Metodo.getDoublePos("Introduce el precio de cada unidad del producto");
					n = Metodo.getIntPos("Introduce la cantidad de unidades del producto");
					try {
						carro.anyadirAlCarro(str, d, n);
					} catch(IndexOutOfBoundsException e) {
						System.out.println("El carro esta lleno");
					}
					break;
				case 2:
					carro.aumentarTamanyo();
					break;
				case 3:
					System.out.println(carro);
					break;
				default:
					break;
				}
			} while(option!=0);
			System.out.println(carro.totalAPagar());
			break;
		case 1:
			String[] cosas = {"leche", "pan", "huevos", "carne", "verdura", "legumbres"};
			carro = new CarroDeLaCompra((int)(Math.random()*100));
			while(bool) {
				try {
					carro.anyadirAlCarro(cosas[(int)(Math.random()*6)], (double)(Math.random()*10), (int)(Math.random()*9)+1);
				} catch(IndexOutOfBoundsException e) {
					switch ((int)(Math.random()*2)) {
					case 0:
						carro.aumentarTamanyo();
						break;
					case 1:
						bool = false;
						break;
					default:
						break;
					}
				}
			}
			System.out.println(carro);
			System.out.println(carro.totalAPagar());
			break;
		default:
			break;
		}
	}
}
