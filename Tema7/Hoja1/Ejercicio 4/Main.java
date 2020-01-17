package ejercicio;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Cooperante listaCooperantes[] = new Cooperante[0];
		int option, i = 0;
		String str;
		do {
			option = Metodo.getIntBetween(0, 5, "1. Alta Asalariado\n"
					+ "2. Alta Voluntario\n"
					+ "3. Listado Cooperantes\n"
					+ "4. Listado Asalariados\n"
					+ "5. Listado Voluntarios\n"
					+ "0. Salir");
			switch (option) {
			default:
				break;
			case 1:
				try{
					listaCooperantes = Arrays.copyOf(listaCooperantes, listaCooperantes.length + 1);
					listaCooperantes[i++] = altaAsalariado();
				} catch (ErrorDni e) {
					System.out.println(e.informeError());
					listaCooperantes = Arrays.copyOf(listaCooperantes, listaCooperantes.length - 1);
				} catch (NumberFormatException e) {
					System.out.println("El DNI incluido no es correcto");
					listaCooperantes = Arrays.copyOf(listaCooperantes, listaCooperantes.length - 1);
				}
				break;
			case 2:
				try{
					listaCooperantes = Arrays.copyOf(listaCooperantes, listaCooperantes.length + 1);
					listaCooperantes[i++] = altaVoluntario();
				} catch (ErrorDni e) {
					System.out.println(e.informeError());
					listaCooperantes = Arrays.copyOf(listaCooperantes, listaCooperantes.length - 1);
				} catch (NumberFormatException e) {
					System.out.println("El DNI incluido no es correcto");
					listaCooperantes = Arrays.copyOf(listaCooperantes, listaCooperantes.length - 1);
				}
				break;
			case 3:
				str = listarCooperantes(listaCooperantes);
				System.out.println(str);
				break;
			case 4:
				str = listarAsalariados(listaCooperantes);
				System.out.println(str);
				break;
			case 5:
				str = listarVoluntarios(listaCooperantes);
				System.out.println(str);
				break;
			}
		} while (option != 0);
	}

	public static Asalariado altaAsalariado() throws ErrorDni{
		String nombre, dni, pais;
		double sueldo;
		Asalariado asalariado;
		ErrorDni e = new ErrorDni();
		nombre = Metodo.getString("Introduce el nombre del asalariado");
		dni = Metodo.getStringLim(9, "Introduce el dni del asalariado");
		if (dni.toUpperCase().charAt(8) != calculaLetra(Integer.parseInt(dni.substring(0,8)))) {
			throw e;
		}
		pais = Metodo.getString("Introduce el pais de origen del asalariado");
		sueldo = Metodo.getDoublePos("Introduce el sueldo del asalariado");
		asalariado = new Asalariado(nombre, dni, pais, sueldo);
		return asalariado;
	}
	
	public static Voluntario altaVoluntario() throws ErrorDni{
		String nombre, dni, pais, ong;
		Voluntario voluntario;
		ErrorDni e = new ErrorDni();
		nombre = Metodo.getString("Introduce el nombre del voluntario");
		dni = Metodo.getStringLim(9, "Introduce el dni del voluntario");
		if (dni.toUpperCase().charAt(8) != calculaLetra(Integer.parseInt(dni.substring(0,8)))) {
			throw e;
		}
		pais = Metodo.getString("Introduce el pais de origen del voluntario");
		ong = Metodo.getString("Introduce la ong a la que pertenece el voluntario");
		voluntario = new Voluntario(nombre, dni, pais, ong);
		return voluntario;
	}

	public static String listarCooperantes(Cooperante[] listaCooperantes) {
		String str = "";
		for (int i = 0; i < listaCooperantes.length; i++) {
			if (listaCooperantes[i] != null) {
				str += listaCooperantes[i].muestraDatos() + "\n";
			} else {
				break;
			}
		}
		return str;
	}

	public static String listarAsalariados(Cooperante[] listaCooperantes) {
		String str = "";
		for (int i = 0; i < listaCooperantes.length; i++) {
			if (listaCooperantes[i] != null) {
				if (listaCooperantes[i] instanceof Asalariado) {
					str += listaCooperantes[i].muestraDatos() + "\n";
				}
			} else {
				break;
			}
		}
		return str;
	}

	public static String listarVoluntarios(Cooperante[] listaCooperantes) {
		String str = "";
		for (int i = 0; i < listaCooperantes.length; i++) {
			if (listaCooperantes[i] != null) {
				if (listaCooperantes[i] instanceof Voluntario) {
					str += listaCooperantes[i].muestraDatos() + "\n";
				}
			} else {
				break;
			}
		}
		return str;
	}


	public static char calculaLetra(int numero) {
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		int resto = numero % 23;
		return letras.charAt(resto);
	}
}
