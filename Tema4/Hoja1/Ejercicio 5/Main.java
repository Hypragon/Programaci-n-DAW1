package t4h1e5;

public class Main {

	public static void main(String[] args) {
		Fecha date1 = null, date2 = null;
		Integer menu = null, dia, mes, anyo;
		Boolean boo;
		do {
			menu = Metodo.getIntBetween(0, 9, "Elige una opción:"
					+ "\n1. Elige una fecha"
					+ "\n2. Saber si el año es bisiesto"
					+ "\n3. Saber si la fecha es correcta"
					+ "\n4. Obtener el nombre del mes"
					+ "\n5. Obtener la cantidad de días que tiene el mes"
					+ "\n6. Obtener la cadena del mes cutre"
					+ "\n7. Obtener la cadena del mes bonito"
					+ "\n8. Obtener la diferencia entre la fecha actual y otra fecha"
					+ "\n9. Obtener una fecha añadiendo días a la fecha actual"
					+ "\n0. Salir");
			switch (menu) {
			default:
				break;
			case 1:
				do {
					try {
						dia = Metodo.getInt("Elige un día");
						mes = Metodo.getInt("Elige un mes");
						anyo = Metodo.getInt("Elige un año");
						date1 = new Fecha(dia, mes, anyo);
					/*if (date1.getDia() != null && date1.getMes() != null && date1.getAnyo() != null) {
						System.out.println("La fecha es correcta");*/
						boo = true;
					//} else {
					} catch (IllegalArgumentException e) {
						System.out.println("La fecha es erronea");
						boo = false;
					}
				} while (!boo);
				break;
			case 2:
				boo = date1.esBisiesto();
				if (boo) System.out.println("El año " + date1.getAnyo() + " es bisiesto");
				else System.out.println("El año " + date1.getAnyo() + " no es bisiesto");
				break;
			case 3:
				boo = date1.esCorrecta();
				if (boo) System.out.println("La fecha actual es correcta.");
				else System.out.println("La fecha actual es incorrecta (debug)");
				break;
			case 4:
				System.out.println("El mes actual es " + date1.getCadenaMes());
				break;
			case 5:
				System.out.println("El mes actual tiene " + date1.getDiasMes() + " días");
				break;
			case 6:
				System.out.println(date1.getCadenaFecha1());
				break;
			case 7:
				System.out.println(date1.getCadenaFecha2());
				break;
			case 8:
				System.out.println("Introduce una nueva fecha");
				do {
					//try {
						dia = Metodo.getInt("Elige un día");
						mes = Metodo.getInt("Elige un mes");
						anyo = Metodo.getInt("Elige un año");
						date2 = new Fecha(dia, mes, anyo);
					if (date2.getDia() != null && date2.getMes() != null && date2.getAnyo() != null) {
						System.out.println("La fecha es correcta");
						boo = true;
					} else {
					//} catch (IllegalValueException e) {
						System.out.println("La fecha es erronea");
						boo = false;
					}
				} while (!boo);
				System.out.println("La diferencia entre las fechas es de " + Fecha.diferenciaFecha(date1, date2) + " días");
				break;
			case 9:
				dia = Metodo.getIntPos("Introduce cuanto quieres incrementar la fecha");
				date2 = date1.sumaDias(dia);
				System.out.println("La fecha " + date1.getCadenaFecha1() + " incrementada en " + dia + " días es " + date2.getCadenaFecha1());
				break;
			}
		}while (menu != 0);
		System.out.println("Adios");
	}
}
