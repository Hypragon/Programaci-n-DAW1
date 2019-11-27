package ejercicio;

import java.util.Arrays;

public class LibroVariosAutores {

	public static void main(String[] args) {
		Autor listaAutores[] = new Autor[0];
		Autor autoresActuales[] = new Autor[0];
		Libro listaLibros[] = new Libro[0];
		Integer opcionMenu, primerNumeroUtil, segundoNumeroUtil, tercerNumeroUtil;
		String primeraCadenaUtil, segundaCadenaUtil;
		Double numeroDouble;
		Character genero;
		Boolean sePuede;
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
				listaAutores = Arrays.copyOf(listaAutores, listaAutores.length + 1);
				listaAutores[listaAutores.length - 1] = new Autor(primeraCadenaUtil, segundaCadenaUtil, genero);
				break;
			case 2: 
				if (listaAutores.length < 1) System.out.println("Crea un autor antes de crear un libro");				
				else {
					primeraCadenaUtil = Metodo.getString("Introduce el nombre del libro");
					for (int contadorBucle = 0; contadorBucle < listaAutores.length; contadorBucle++) {
						System.out.println(contadorBucle + ". " + listaAutores[contadorBucle]);
						System.out.println("------------------");
					}
					primerNumeroUtil = Metodo.getIntBetween(0, listaAutores.length - 1, "Introduce el número asignado al autor");
					while (primerNumeroUtil != -1 && autoresActuales.length < listaAutores.length){
						autoresActuales = Arrays.copyOf(autoresActuales, autoresActuales.length + 1);
						autoresActuales[autoresActuales.length - 1] = listaAutores[primerNumeroUtil];
						primerNumeroUtil = Metodo.getIntBetween(-1, listaAutores.length - 1, "Introduce el número asignado al autor, (-1) para acabar");
					}
					numeroDouble = Metodo.getDoublePos("Introduce el precio del libro");
					segundoNumeroUtil = Metodo.getIntPos("Introduce la cantidad de libros que quieres crear");
					if (segundoNumeroUtil > 0) {
						listaLibros = Arrays.copyOf(listaLibros, listaLibros.length + 1);
						listaLibros[listaLibros.length - 1] = new Libro(primeraCadenaUtil, autoresActuales, numeroDouble, segundoNumeroUtil);
					} else {
						listaLibros = Arrays.copyOf(listaLibros, listaLibros.length + 1);
						listaLibros[listaLibros.length - 1] = new Libro(primeraCadenaUtil, autoresActuales, numeroDouble);
					}
					autoresActuales = new Autor[0];
				}
				break;
			case 3:
				if (listaAutores.length < 1) {
					System.out.println("Crea un autor antes de editar autores");
				}
				else {
					for (int contadorBucle = 0; contadorBucle < listaAutores.length; contadorBucle++) {
						System.out.println(contadorBucle + ". " + listaAutores[contadorBucle]);
						System.out.println("------------------");
					}
					primerNumeroUtil = Metodo.getIntBetween(0, listaAutores.length - 1, "Elige que autor quieres editar");
					do {
						tercerNumeroUtil = Metodo.getIntBetween(0, 2, "1. Cambiar nombre\n"
								+ "2. Cambiar email\n"
								+ "0. Salir");
						switch (tercerNumeroUtil) {
						default:
							break;
						case 1:
							System.out.println("El nombre actual es " + listaAutores[primerNumeroUtil].getNombre());
							primeraCadenaUtil = Metodo.getString("Introduce el nuevo nombre");
							listaAutores[primerNumeroUtil].setNombre(primeraCadenaUtil);
							break;
						case 2:
							System.out.println("El email actual es " + listaAutores[primerNumeroUtil].getEmail());
							primeraCadenaUtil = Metodo.getString("Introduce el nuevo email");
							listaAutores[primerNumeroUtil].setEmail(primeraCadenaUtil);
							break;
						}
					} while (tercerNumeroUtil != 0);
				}
				break;
			case 4:
				if (listaLibros.length < 1) {
					System.out.println("Crea libros antes de editar un libro");
				}
				else {
					for (int contadorBucle = 0; contadorBucle < listaLibros.length; contadorBucle++) {
						System.out.println(contadorBucle + ". " + listaLibros[contadorBucle].cadenaLibro());
						System.out.println("------------------");
					}
					primerNumeroUtil = Metodo.getIntBetween(0, listaLibros.length - 1, "Elige que libro quieres editar");
					do {
						tercerNumeroUtil = Metodo.getIntBetween(0, 4, "1. Cambiar titulo\n"
								+ "2. Añadir autores\n"
								+ "3. Eliminar autores\n"
								+ "4. Cambiar precio\n"
								+ "5. Cambiar cantidad\n"
								+ "0. Salir");
						switch (tercerNumeroUtil) {
						default:
							break;
						case 1:
							System.out.println("El titulo actual es " + listaLibros[primerNumeroUtil].getTitulo());
							primeraCadenaUtil = Metodo.getString("Introduce el nuevo titulo");
							listaLibros[primerNumeroUtil].setTitulo(primeraCadenaUtil);
							break;
						case 2:
							autoresActuales = listaLibros[primerNumeroUtil].getAutores();
							System.out.println("Los autores actuales son: " + autoresActuales + "\r");
							System.out.println("Lista de autores:");
							for (int contadorBucle = 0; contadorBucle < listaAutores.length; contadorBucle++) {
								System.out.println(contadorBucle + ". " + listaAutores[contadorBucle]);
								System.out.println("------------------");
							}
							do {
								segundoNumeroUtil = Metodo.getIntBetween(-1, listaAutores.length - 1, "Introduce el número asignado al autor, (-1) para acabar");
								if (segundoNumeroUtil == -1) {
									break;
								}
								sePuede = true;
								for (int contadorBucle = 0; contadorBucle < autoresActuales.length; contadorBucle++) {
									if (listaAutores[segundoNumeroUtil] == autoresActuales[contadorBucle]) {
										sePuede = false;		
									}
								}
								if (sePuede) {
									autoresActuales = Arrays.copyOf(autoresActuales, autoresActuales.length + 1);
									autoresActuales[autoresActuales.length - 1] = listaAutores[segundoNumeroUtil];
								}
								else System.out.println("Ese autor ya era autor del libro");
							} while (segundoNumeroUtil != -1 && autoresActuales.length < listaAutores.length);
							if (autoresActuales.length == listaAutores.length) {
								System.out.println("Ya no hay más autores");
							}
							listaLibros[primerNumeroUtil].setAutores(autoresActuales);
							break;
						case 3:
							System.out.println("Lista de autores:");
							autoresActuales = listaLibros[primerNumeroUtil].getAutores();
							for (int contadorBucle = 0; contadorBucle < autoresActuales.length; contadorBucle++) {
								System.out.println(contadorBucle + ". " + autoresActuales[contadorBucle]);
								System.out.println("------------------");
							}
							do {
								segundoNumeroUtil = Metodo.getIntBetween(-1, listaAutores.length - 1, "Introduce el número asignado al autor, (-1) para acabar");
								if (segundoNumeroUtil == -1) {
									break;
								}
								autoresActuales[segundoNumeroUtil] = null;
								for (int contadorBucle = 0; contadorBucle < autoresActuales.length; contadorBucle++) {
									if (autoresActuales[contadorBucle] == null) {
										autoresActuales[contadorBucle] = autoresActuales[contadorBucle + 1];
										autoresActuales[contadorBucle + 1] = null;
									}
								}
								autoresActuales = Arrays.copyOf(autoresActuales, autoresActuales.length - 1);
								for (int contadorBucle = 0; contadorBucle < autoresActuales.length; contadorBucle++) {
									System.out.print(i + ". " + autoresActuales[contadorBucle]);
									System.out.println("------------------");
								}
								
							} while (segundoNumeroUtil != -1 && autoresActuales.length > 1);
							if (autoresActuales.length > 1) {
								System.out.println("Ya no hay mas autores");
							}
							listaLibros[primerNumeroUtil].setAutores(autoresActuales);
							break;
						case 4:
							System.out.println("El precio actual es " + listaLibros[primerNumeroUtil].getPrecio() + "€");
							numeroDouble = Metodo.getDoublePos("Introduce el nuevo precio");
							listaLibros[primerNumeroUtil].setPrecio(numeroDouble);
							break;
						case 5:
							System.out.println("La cantidad actual de libros es " + listaLibros[primerNumeroUtil].getPrecio());
							segundoNumeroUtil = Metodo.getIntPos("Introduce la nueva cantidad");
							listaLibros[primerNumeroUtil].setCantidad(segundoNumeroUtil);
							break;
						}
					} while (tercerNumeroUtil != 0);
				}
			case 5:
				System.out.println("Listado de libros:");
				for (int contadorBucle = 0; contadorBucle < listaLibros.length; contadorBucle++) {
					System.out.println(listaLibros[contadorBucle].cadenaLibro());
					System.out.println("------------------");
				}
				break;
			case 6:
				System.out.println("Listado de autores:");
				for (int contadorBucle = 0; contadorBucle < listaAutores.length; contadorBucle++) {
					System.out.println(listaAutores[contadorBucle]);
					System.out.println("------------------");
				}
				break;
			}
		} while (opcionMenu != 0);
		System.out.println("Adios");
	} 
}

