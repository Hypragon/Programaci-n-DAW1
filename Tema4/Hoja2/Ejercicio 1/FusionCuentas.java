package ejercicio;

import java.util.Arrays;

public class FusionCuentas {

	public static void main(String[] args) {
		CuentaCorriente cuentas[] = new CuentaCorriente[0];
		Integer opcionMenu = null, contadorCuentas = -1, cuenta1, cuenta2;
		Double numeroDouble;
		String cliente;
		Boolean esPosible;
		do {
			opcionMenu = Metodo.getIntBetween(0, 8, "Elige la opción que quieres usar\n"
					+ "1. Crear nueva cuenta\n"
					+ "2. Ingresar en cuenta \n"
					+ "3. Retirar de cuenta\n"
					+ "4. Visualizar cuenta\n"
					+ "5. Visualiza todas las cuentas\n"
					+ "6. Cantidad total de cuentas\n"
					+ "7. Cerrar una cuenta\n"
					+ "8. Fusionar cuenta");
			switch (opcionMenu) {
			default:
				break;
			case 1:
				contadorCuentas++;
				cuentas = Arrays.copyOf(cuentas, cuentas.length + 1);
				cliente = Metodo.getString("Introduce el nombre del cliente");
				cuentas[contadorCuentas] = new CuentaCorriente(0.00, cliente);
				break;
			case 2:
				if (cuentas.length > 0) {
					numeroDouble = Metodo.getDoublePos("Introduce cuanto dinero quieres ingresar");
					cuentas[contadorCuentas].ingresaEfectivo(numeroDouble);
				} else {
					System.out.println("Antes de cualquier otra operación, debe crear al menos una cuenta");
				}
				break;
			case 3:
				if (cuentas.length > 0) {
					numeroDouble = Metodo.getDoublePos("Introduce cuanto dinero quieres ingresar");
					esPosible = cuentas[contadorCuentas].retiraEfectivo(numeroDouble);
					if (!esPosible) {
						System.out.println("En la cuenta actualmente hay " + cuentas[contadorCuentas].getSaldo() + "€, por lo que no puede retirar " + numeroDouble + "€");
					}
				} else {
					System.out.println("Antes de cualquier otra operación, debe crear al menos una cuenta");
				}
				break;
			case 4:
				if (cuentas.length > 0) {
					System.out.println(cuentas[contadorCuentas]);
				} else {
					System.out.println("Antes de cualquier otra operación, debe crear al menos una cuenta");
				}
				break;
			case 5:
				System.out.println("Lista de cuentas añadidas:");
				for (int j = 0; j < cuentas.length; j++) {
					if (cuentas[j] != null) {
						System.out.println(cuentas[j] + "\n-------------------------");
					} else {
						if (j == 0) {
							System.out.println("No se ha añadido ninguna cuenta");
						}
						break;
					}
				}
				break;
			case 6:
				System.out.println("En total hay " + (CuentaCorriente.getNumSiguiente()) + " cuentas");
				break;
			case 7:
				cuenta1 = Metodo.getIntBetween(0, contadorCuentas, "Elige que cuenta quieres borrar (de 0 hasta " + contadorCuentas + ")");
				cuentas[cuenta1].cerrarCuenta();
				break;
			case 8:
				cuenta2 = Metodo.getIntBetween(0, contadorCuentas, "Elige que cuenta quieres fusionar (de 0 hasta " + contadorCuentas + ")");
				cuenta1 = Metodo.getIntBetween(0, contadorCuentas, "Elige que cuenta quieres a la que la quieres fusionar (de 0 hasta " + contadorCuentas + ")");
				contadorCuentas++;
				cuentas[contadorCuentas] = CuentaCorriente.fusionar(cuentas[cuenta1], cuentas[cuenta2]);
				if (cuentas[contadorCuentas] == null) {
					System.out.println("La fusión no ha sido posible");
					contadorCuentas--;
				}
			}
		} while(opcionMenu != 0);
		System.out.println("Adios");
	}

}
