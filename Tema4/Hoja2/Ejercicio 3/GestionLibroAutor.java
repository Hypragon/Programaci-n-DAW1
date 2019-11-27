package ejercicio;

import java.util.Arrays;

public class GestionLibroAutor {

	public static void main(String[] args) {

		Autor autores[] = new Autor [0];
		Libro libros[] = new Libro[0];
		Integer opcionMenu, primerNumeroUtil, segundoNumeroUtil, tercerNumreoUtil;
		String primeraCadenaUtil, segundaCadenaUtil;
		Double numeroDouble;
		Character genero;
		do {
			opcionMenu = Metodo.getIntBetween(0, 6, "1. Introducir autor\n"
					+ "2. Crear libros\n"
					+ "3. Modificar autor\n"
					+ "4. Modificar libro\n"
					+ "5. Listado de libros\n"
					+ "6. Listado de autores\n"
					+ "0. Salir");
			switch (opcionMenu) {
			default:
				break;
			case 1:
				primeraCadenaUtil = Metodo.getString("Introduce el nombre del autor");
				segundaCadenaUtil = Metodo.getString("Introduce el email del autor");
				genero = Metodo.getCharGender("Introduce el género del autor");
				autores = Arrays.copyOf(autores, autores.length + 1);
				autores[autores.length - 1] = new Autor(primeraCadenaUtil, segundaCadenaUtil, genero);
				break;
			case 2: 
				if (autores.length < 1) {
					System.out.println("Crea un autor antes de crear un libro");				
				} else {
					primeraCadenaUtil = Metodo.getString("Introduce el nombre del libro");
					for (int contadorBucle = 0; contadorBucle < autores.length; contadorBucle++) {
						System.out.println(contadorBucle + ". " + autores[contadorBucle]);
						System.out.println("------------------");
					}
					primerNumeroUtil = Metodo.getIntBetween(0, autores.length - 1, "Introduce el número asignado al autor");
					numeroDouble = Metodo.getDoublePos("Introduce el precio del libro");
					segundoNumeroUtil = Metodo.getIntPos("Introduce la cantidad de libros que quieres crear");
					if (segundoNumeroUtil > 0) {
						libros = Arrays.copyOf(libros, libros.length + 1);
						libros[libros.length - 1] = new Libro(primeraCadenaUtil, autores[primerNumeroUtil], numeroDouble, segundoNumeroUtil);
					} else {
						libros = Arrays.copyOf(libros, libros.length + 1);
						libros[libros.length - 1] = new Libro(primeraCadenaUtil, autores[primerNumeroUtil], numeroDouble);
					}
				}
				break;
			case 3:
				if (autores.length < 1) {
					System.out.println("Crea un autor antes de editar autores");
				} else {
					for (int contadorBucle = 0; contadorBucle < autores.length; contadorBucle++) {
						System.out.println(contadorBucle + ". " + autores[contadorBucle]);
						System.out.println("------------------");
					}
					primerNumeroUtil = Metodo.getIntBetween(0, autores.length - 1, "Elige que autor quieres editar");
					do {
						tercerNumreoUtil = Metodo.getIntBetween(0, 2, "1. Cambiar nombre\n"
								+ "2. Cambiar email\n"
								+ "0. Salir");
						switch (tercerNumreoUtil) {
						default:
							break;
						case 1:
							System.out.println("El nombre actual es " + autores[primerNumeroUtil].getNombre());
							primeraCadenaUtil = Metodo.getString("Introduce el nuevo nombre");
							autores[primerNumeroUtil].setNombre(primeraCadenaUtil);
							break;
						case 2:
							System.out.println("El email actual es " + autores[primerNumeroUtil].getEmail());
							primeraCadenaUtil = Metodo.getString("Introduce el nuevo email");
							autores[primerNumeroUtil].setEmail(primeraCadenaUtil);
							break;
						}
					} while (tercerNumreoUtil != 0);
				}
				break;
			case 4:
				if (libros.length < 1) {
					System.out.println("Crea libros antes de editar un libro");
				}
				else {
					for (int contadorBucle = 0; contadorBucle < libros.length; contadorBucle++) {
						System.out.println(contadorBucle + ". " + libros[contadorBucle].cadenaLibro());
						System.out.println("------------------");
					}
					primerNumeroUtil = Metodo.getIntBetween(0, libros.length - 1, "Elige que libro quieres editar");
					do {
						tercerNumreoUtil = Metodo.getIntBetween(0, 4, "1. Cambiar titulo\n"
								+ "2. Cambiar autor\n"
								+ "3. Cambiar precio\n"
								+ "4. Cambiar cantidad\n"
								+ "0. Salir");
						switch (tercerNumreoUtil) {
						default:
							break;
						case 1:
							System.out.println("El titulo actual es " + libros[primerNumeroUtil].getTitulo());
							primeraCadenaUtil = Metodo.getString("Introduce el nuevo titulo");
							libros[primerNumeroUtil].setTitulo(primeraCadenaUtil);
							break;
						case 2:
							System.out.println("El autor actual es " + libros[primerNumeroUtil].getAutor());
							System.out.println("Lista de autores");
							for (int i = 0; i < autores.length; i++) {
								System.out.println(i + ". " + autores[i]);
								System.out.println("------------------");
							}
							segundoNumeroUtil = Metodo.getIntBetween(0, autores.length - 1, "Elige cual quieres qu sea el nuevo autor");
							libros[primerNumeroUtil].setAutor(autores[segundoNumeroUtil]);
							break;
						case 3:
							System.out.println("El precio actual es " + libros[primerNumeroUtil].getPrecio() + "€");
							numeroDouble = Metodo.getDoublePos("Introduce el nuevo precio");
							libros[primerNumeroUtil].setPrecio(numeroDouble);
							break;
						case 4:
							System.out.println("La cantidad actual de libros es " + libros[primerNumeroUtil].getPrecio());
							segundoNumeroUtil = Metodo.getIntPos("Introduce la nueva cantidad");
							libros[primerNumeroUtil].setCantidad(segundoNumeroUtil);
							break;
						}
					} while (tercerNumreoUtil != 0);
				}
			case 5:
				System.out.println("Listado de libros:");
				for (int i = 0; i < libros.length; i++) {
					System.out.println(libros[i].cadenaLibro());
					System.out.println("------------------");
				}
				break;
			case 6:
				System.out.println("Listado de autores:");
				for (int i = 0; i < autores.length; i++) {
					System.out.println(autores[i]);
					System.out.println("------------------");
				}
				break;
			}
		} while (opcionMenu != 0);
		System.out.println("Adios");
	} 
}

