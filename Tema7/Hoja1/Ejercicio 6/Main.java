package ejercicio;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Empleado empleados[] = new Empleado[0];
		boolean bool = true;
		String str, dpto;
		int n, i = 0, option;
		double d;
		while (bool) {
			str = Metodo.getString("Introduce el nombre del empleado");
			n = Metodo.getIntPos("Introduce la edad del empleado");
			d = Metodo.getDoublePos("Introduce el incremento del empleado");
			bool = Metodo.getBoolean("¿El usuario que vas a introducir es un jefe?");
			empleados = Arrays.copyOf(empleados, empleados.length + 1);
			if (bool) {
				dpto = Metodo.getString("¿De que departamento es jefe?");
				empleados[i] = new Jefe(str, n, d, dpto);
			} else {
				empleados[i] = new Empleado(str, n, d);
			}
			i++;
			bool = Metodo.getBoolean("¿Quieres introducir más usuarios?");
		}
		do {
			option = Metodo.getIntBetween(0, 3, "1. Modificar el sueldo base de todos los empleados.\n"
					+ "2. Modificar el plus de todos los jefes.\n"
					+ "3. Visualizar los datos de todos los empleados.\n"
					+ "0. Salir.");
			switch (option) {
			case 1:
				n = Metodo.getIntPos("Introduce el nuevo sueldo base de todos los empleados");
				Empleado.setBase(n);
				break;
			case 2:
				n = Metodo.getIntPos("Introduce el nuevo plus de todos los jefes.");
				Jefe.setExtra(n);
				break;
			case 3:
				for (int j = 0; j < empleados.length; j++) {
					System.out.println(empleados[j]);
				}
			default:
				break;
			}
		} while (option != 0);
	}

}
