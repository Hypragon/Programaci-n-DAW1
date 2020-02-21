package ejercicio;

import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		TreeMap<String, String> usuarios = new TreeMap<>();
		int option;
		String usuario = null, contrasenya = null;
		option = Metodo.getIntBetween(0, 4, "1. Añadir un nuevo usuario/contraseña"
				+ "\n2. Borrar un usuario"
				+ "\n3. Modificar la contraseña de un usuario"
				+ "\n4. Validar una contraseña"
				+ "\n0. Salir");
		while (option != 0) {
			switch (option) {
			case 1:
				anyadirUsuario(usuarios);
				break;
			case 2:
				borrar(usuarios);
				break;
			case 3:
				modificar(usuarios);
				break;
			case 4:
				usuario = Metodo.getString("Introduce el nombre del usuario");
				contrasenya = Metodo.getString("Introduce la contraseña del usuario");
				if(validar(usuarios, usuario, contrasenya)) {
					System.out.println("Contraseña correcta");
				} else {
					System.out.println("Contraseña incorrecta");
				}
				break;
			}
			option = Metodo.getIntBetween(0, 4, "1. Añadir un nuevo usuario/contraseña"
					+ "\n2. Borrar un usuario"
					+ "\n3. Modificar la contraseña de un usuario"
					+ "\n4. Validar una contraseña"
					+ "\n0. Salir");	
		}
		System.out.println("Adios");
	}


	private static void anyadirUsuario(TreeMap<String, String> usuarios) {	//Metodo para añadir un usuario al mapa
		String usuario, contrasenya = null;
		boolean boo = true;
		usuario = Metodo.getString("Introduzca el nombre de usuario");
		while(usuarios.containsKey(usuario)) {
			System.out.println("Ese usuario ya existe, introduzca uno nuevo");
			usuario = Metodo.getString("Introduzca el nombre de usuario");
		}
		while(boo) {
			try{
				contrasenya = recibirContrasenya();
				boo = false;
			} catch (IllegalArgumentException e) {
				System.out.println("La contraseña no contiene valores correctos, solo valores [a-z], [A-Z] y [0-9]");
			}
		}
		usuarios.put(usuario, codificar(contrasenya));

	}
	
	public static String recibirContrasenya() throws IllegalArgumentException {	//Metodo para recibir una contraseña, lanzando una excepcion si la contraseña no es un valor correcto
		String contrasenya = "";
		contrasenya = Metodo.getString("Introduzca la contraseña");
		for (int i = 0; i < contrasenya.length(); i++) {
			//			if (contrasenya.charAt(i) < '0' || contrasenya.charAt(i) > '9' && contrasenya.charAt(i) < 'a' || contrasenya.charAt(i) > 'z' && contrasenya.charAt(i) != 'ñ' && contrasenya.charAt(i) < 'A' || contrasenya.charAt(i) > 'Z' && contrasenya.charAt(i) != 'Ñ') {
			if ((contrasenya.charAt(i) < '0' || contrasenya.charAt(i) > '9') && (contrasenya.charAt(i) < 'a' || contrasenya.charAt(i) > 'z') && (contrasenya.charAt(i) < 'A' || contrasenya.charAt(i) > 'Z')) {
				throw new IllegalArgumentException();
			}
		}

		return contrasenya;
	}
	
	public static String codificar(String frase) {	//Metodo que codifica la contraseña
		char caracter;
		String frase2 = "";
		boolean may;
		for (int i = 0; i < frase.length(); i++) {
			caracter = frase.toUpperCase().charAt(i);
			if (caracter == frase.charAt(i)) {
				may = true;
			} else {
				may = false;
			}
			caracter += 7;
			if (caracter > 90) {
				caracter -= 26;
			}
			if(!may) {
				caracter += 32;
			}
			frase2 += caracter;
		}
		return frase2;
	}
	
	public static void borrar(TreeMap<String, String> mapa) {	//Borra a un usuario del mapa
		mostrar(mapa);
		String usuario = Metodo.getString("Introduce el nombre del usuario que quieras borrar");
		mapa.remove(usuario);
	}
	private static void modificar(TreeMap<String, String> usuarios) {	//Metodo que pide la contraseña vieja y si es correcta, la replaza por una nueva
		String usuario, contrasenya;
		mostrar(usuarios);
		do{
			usuario = Metodo.getString("Introduce el nombre del usuario que quieras cambiar su contraseña");
		} while(!usuarios.containsKey(usuario));
		contrasenya = Metodo.getString("Introduce la contraseña actual del usuario");
		if(validar(usuarios, usuario, contrasenya)) {
			contrasenya = Metodo.getString("Introduce la nueva contraseña del usuario");
			usuarios.put(usuario, contrasenya);
		} else {
			System.out.println("La contraseña no es correcta");
		}
	}
	
	public static boolean validar(TreeMap<String, String> mapa, String usuario, String contrasenya) {	//Metodo que valida si la contraseña es correcta
		return mapa.get(usuario).equals(codificar(contrasenya));
	}
	
	public static void mostrar(TreeMap<String, String> mapa) {	//Metodo para mostrar a los usuarios del mapa
		for(String usuario : mapa.keySet()) {
			System.out.println("Usuario " + usuario);
		}
	}
}
