package ejercicio;

public class Main {
	public static void main(String[] args) {
		Bicicleta[] almacen = new Bicicleta[20];
		int n, option;
		String str;
		n = Metodo.getIntBetween(0, 20, "Introduce la cantidad de bicicletas que quieres introducir");
		almacen = llenarAlmacen(almacen, n);
		do {
			option = Metodo.getIntBetween(0, 4, "1. Comprar bicicleta.\n"
					+ "2. Vender bicicleta.\n"
					+ "3. Pintar bicicleta.\n"
					+ "4. Listar bicicletas.\n"
					+ "0. Salir");
			switch (option) {
			case 1:
				try{
					almacen[Metodo.nullFinder(almacen)] = comprarBicicleta();
				} catch (IndexOutOfBoundsException e) {
					System.out.println("No caben más bicicletas en el almacén");
				}
				break;
			case 2:
				listarBicicletas(almacen);
				n = Metodo.getIntBetween(0, almacen.length - 1, "Elige que bicicleta quieres vender");
				almacen[n] = null;
				for (int i = n; i < almacen.length; i++) {
					if (almacen[i + 1] != null) {
						almacen[i] = almacen[i + 1];
						almacen[i + 1] = null;
					} else {
						almacen[i + 1] = null;
						break;
					}
				}
				break;
			case 3:
				listarBicicletas(almacen);
				n = Metodo.getIntBetween(0, almacen.length - 1, "Elige que bicicleta quieres pintar");
				str = Metodo.getString("Elige de que color quieres pintar la bicicleta");
				almacen[n].pintar(str);
				break;
			case 4:
				listarBicicletas(almacen);
				break;
			}
		} while (option != 0);
	}
	public static Bicicleta[] llenarAlmacen(Bicicleta[] almacen, int n) {
		for (int i = 0; i < n; i++) {
			almacen[i] = comprarBicicleta();
		}
		return almacen;
	}
	public static Bicicleta comprarBicicleta() {
		String str;
		double d;
		str = Metodo.getString("Introduce el color de la bicicleta");
		d = Metodo.getDoublePos("Introduce el precio de la bicicleta");
		Bicicleta bicicleta = new Bicicleta(str, d);
		return bicicleta;
	}
	public static void listarBicicletas(Bicicleta[] almacen) {
		for (int i = 0; i < almacen.length; i++) {
			if (almacen[i] != null) {
				System.out.println(i + ". " + almacen[i]);
			} else {
				break;
			}
		}
	}
}
