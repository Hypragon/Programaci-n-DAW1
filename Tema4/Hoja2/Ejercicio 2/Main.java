package ejercicio;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		CuentaCorriente cuentas[] = new CuentaCorriente[0];
		Cliente clientes[] = new Cliente[0];
		Integer opcionMenu = null, contadorCuentas = -1, cuenta1, cuenta2, seleccionCliente;
		String cadenaMultiusos;
		Double numeroDouble;
		Boolean sePuede;
		do {
			opcionMenu = Metodo.getIntBetween(0, 10, "Elige la opción que quieres usar\n"
					+ "1. Añadir un nuevo cliente\n"
					+ "2. Crear nueva cuenta\n"
					+ "3. Ingresar en cuenta\n"
					+ "4. Retirar de cuenta\n"
					+ "5. Visualizar cuenta\n"
					+ "6. Visualiza todas las cuentas\n"
					+ "7. Cantidad total de cuentas\n"
					+ "8. Cerrar una cuenta\n"
					+ "9. Fusionar cuenta\n"
					+ "10. Muestra todas las cuentas de un usuario\n");
			switch (opcionMenu) {
			default:
				break;
			case 1:
				clientes = Arrays.copyOf(clientes, clientes.length + 1);
				cadenaMultiusos = Metodo.getString("Introduce el nombre del cliente");
				clientes[clientes.length - 1] = new Cliente(cadenaMultiusos);
				break;
			case 2:
				if (clientes.length > 0) {
					contadorCuentas++;
					System.out.println("Lista de clientes:");
					for (int i = 0; i < clientes.length; i++) {
						System.out.println(i + ". " + clientes[i]);
					}
					seleccionCliente = Metodo.getIntBetween(0, clientes.length - 1, "Elige cual va a ser el dueño de la cuenta");
					cuentas = Arrays.copyOf(cuentas, cuentas.length + 1);
					cuentas[cuentas.length - 1] = new CuentaCorriente(0.00, clientes[seleccionCliente]);
					clientes[seleccionCliente].setCuentaCorriente(cuentas[contadorCuentas]);
				} else {
					System.out.println("Introduce clientes antes de crear una cuenta");
				}
				break;
			case 3:
				if (cuentas.length > 0) {
					numeroDouble = Metodo.getDoublePos("Introduce cuanto dinero quieres ingresar");
					cuentas[contadorCuentas].ingresaEfectivo(numeroDouble);
				} else {
					System.out.println("Antes de cualquier otra operación, debe crear al menos una cuenta");
				}
				break;
			case 4:
				if (cuentas.length > 0) {
					numeroDouble = Metodo.getDoublePos("Introduce cuanto dinero quieres ingresar");
					sePuede = cuentas[contadorCuentas].retiraEfectivo(numeroDouble);
					if (!sePuede) System.out.println("En la cuenta actualmente hay " + cuentas[contadorCuentas].getSaldo() + "€, por lo que no puede retirar " + numeroDouble + "€");
				} else {
					System.out.println("Antes de cualquier otra operación, debe crear al menos una cuenta");
				}
				break;
			case 5:
				if (cuentas.length > 0) {
					System.out.println(cuentas[contadorCuentas]);
				} else {
					System.out.println("Antes de cualquier otra operación, debe crear al menos una cuenta");
				}
				break;
			case 6:
				System.out.println("Lista de cuentas añadidas:");
				if (cuentas.length == 0) {
					System.out.println("No se ha añadido ninguna cuenta");
				} else {
					for (int i = 0; i < cuentas.length; i++) {
						System.out.println(cuentas[i] + "\n-------------------------");
					}
				}
				break;
			case 7:
				System.out.println("En total hay " + (CuentaCorriente.contador()) + " cuentas");
				break;
			case 8:
				cuenta1 = Metodo.getIntBetween(0, contadorCuentas, "Elige que cuenta quieres borrar (de 0 hasta " + contadorCuentas + ")");
				cuentas[contadorCuentas].cerrarCuenta();
				break;
			case 9:
				cuenta2 = Metodo.getIntBetween(0, contadorCuentas, "Elige que cuenta quieres fusionar (de 0 hasta " + contadorCuentas + ")");
				cuenta1 = Metodo.getIntBetween(0, contadorCuentas, "Elige que cuenta quieres a la que la quieres fusionar (de 0 hasta " + contadorCuentas + ")");
				contadorCuentas++;
				cuentas = Arrays.copyOf(cuentas, cuentas.length + 1);
				cuentas[cuentas.length - 1] = CuentaCorriente.fusionar(cuentas[cuenta1], cuentas[cuenta2]);
				if (cuentas[contadorCuentas] == null) {
					System.out.println("La fusión no ha sido posible");
					cuentas = Arrays.copyOf(cuentas, cuentas.length - 1);
					contadorCuentas--;
				}
				break;
			case 10:
				for (int i = 0; i < cuentas.length; i++) {
					System.out.println(cuentas[i]);
				}
				seleccionCliente = Metodo.getIntBetween(0, cuentas.length - 1, "Elige de que cliente quieres ver las cuentas");
				for (int i = 0; i < clientes[seleccionCliente].getCuentasCorrientes().length; i++) {
					System.out.println(clientes[seleccionCliente].getCuentasCorrientes()[i]);
				}
				break;
			}
		} while(opcionMenu != 0);
		System.out.println("Adios");
	}
}
