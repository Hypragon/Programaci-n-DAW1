package hoja1;
/*
Escribir un programa que lea códigos de personas de 8 caracteres de modo que los cuatro
primeros sean numéricos y contenidos entre 1990-1995 (un año), el quinto carácter sea solo
(H ó M) sexo, el sexto un numero que representa el curso 1 ó 2 y los caracteres séptimo y
octavo pueden tener cualquier valor. Deben rechazarse los códigos que no cumplan estas
condiciones, la finalización de entrada de códigos se produce cuando se introduce el código
“00000000”. Al final el programa debe sacar un informe indicando cuántos hombres y
mujeres hay matriculados en primero y segundo y cuántos códigos correctos han sido
leídos.
 */
public class H1E9 {
	public static void main(String[] args) {
		String codigo, fecha;
		int fechaEnNumero, hombresPrimero, hombresSegundo, mujeresPrimero, mujeresSegundo;
		hombresPrimero = mujeresPrimero = hombresSegundo = mujeresSegundo = 0;
		do {
			codigo = Metodo.getString("Introduce los datos requeridos (8 chars)");
		} while (codigo.length() != 8);
		while (codigo.compareTo("00000000") != 0) {
			fecha = codigo.substring(0,4);
			fechaEnNumero = Integer.parseInt(fecha);
			if (fechaEnNumero < 1996 && fechaEnNumero > 1989) {
				if (("" + codigo.charAt(4)).compareTo("M") == 0 || ("" + codigo.charAt(4)).compareTo("H") == 0) {
					//if (curso.compareTo("1") == 0 || curso.compareTo("2") == 0) {
					switch (("" + codigo.charAt(5))) {
					case "1":
						if (("" + codigo.charAt(4)).compareTo("H") == 0) {
							hombresPrimero++;
						} else {
							mujeresPrimero++;
						}
						break;
					case "2":
						if (("" + codigo.charAt(4)).compareTo("H") == 0) {
							hombresSegundo++;
						} else {
							mujeresSegundo++;
						}
						break;
					default:
						System.out.println("El código " + codigo + " es erróneo.");
						break;
					}
					//} else System.out.println("El código " + dato + " es erróneo.");
				} else System.out.println("El código " + codigo + " es erróneo.");
			} else System.out.println("El código " + codigo + " es erróneo.");
			do {
				codigo = Metodo.getString("Introduce los datos requeridos (8 chars)");
			} while (codigo.length() != 8);
		}
		System.out.println("En primer curso hay " + hombresPrimero + " hombres y " + mujeresPrimero + " mujeres.\nEn segundo curso hay " + hombresSegundo +" hombres y " + mujeresSegundo + " mujeres.\nSe han recibido un total de " + (hombresPrimero+mujeresPrimero+hombresSegundo+mujeresSegundo) + " datos correctos.");

	}

}