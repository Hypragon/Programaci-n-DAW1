package github;

public class Main {

	public static void main(String[] args) {
		BolsaCaramelos bolsa = new BolsaCaramelos();
		String sabores[] = {"fresa", "limon", "manzana", "piña"};
		String colores[] = {"rojo", "amarillo", "verde", "azul"};
		Sobre sobres[] = new Sobre[sabores.length];
		Sobre masSobres[];
		Sobre añadirSobre;
		Integer menuOpcion = null, primerNumeroUtil, segundoNumeroUtil;
		for (int i = 0; i < sobres.length; i++) {
			sobres[i] = new Sobre(colores[i], sabores[i], Math.random());
			System.out.println(sobres[i]);
		}
		do {
			menuOpcion = Metodo.getIntBetween(0, 5, "1. Añadir varios sobres a la bolsa\n"
					+ "2. Añadir un solo sobre\n"
					+ "3. Ver todos los sobres\n"
					+ "4. Saber cuántos sobres contiene\n"
					+ "5. Saber el precio de la bolsa");
			switch (menuOpcion) {
			default:
				break;
			case 1: 
				primerNumeroUtil = Metodo.getIntBetween(1, BolsaCaramelos.getMaxCaramelos(), "Introduce la cantidad de caramelos que quieres introducir");
				masSobres = new Sobre[primerNumeroUtil];
				for (int primerContadorBucle = 0; primerContadorBucle < primerNumeroUtil; primerContadorBucle++) {
					for (int segundoContadorBucle = 0; segundoContadorBucle < sobres.length; segundoContadorBucle++) {
						System.out.println(segundoContadorBucle + ". " + sobres[segundoContadorBucle]);
					}
					segundoNumeroUtil = Metodo.getIntBetween(0, sobres.length, "Introduce el caramelo que quieres introducir");
					masSobres[primerContadorBucle] = sobres[segundoNumeroUtil];
				}
				bolsa.setSobres(masSobres);
				break;
			case 2:
				for (int contadorBucle = 0; contadorBucle < sobres.length; contadorBucle++) {
					System.out.println(contadorBucle + ". " + sobres[contadorBucle]);
				}
				primerNumeroUtil = Metodo.getIntBetween(0, sobres.length, "Introduce el caramelo que quieres introducir");
				añadirSobre = sobres[primerNumeroUtil];
				bolsa.setSobres(añadirSobre);
				break;
			case 3:
				System.out.println(bolsa);
				break;
			case 4: 
				System.out.println(bolsa.getCantidad());
				break;
			case 5:
				System.out.println(bolsa.getPrecio());
				break;
			}
		} while (menuOpcion != 0);
	}

}
