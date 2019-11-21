package t4h1e4;

public class Main {

	public static void main(String[] args) {
		CuentaCorriente cuentas[] = new CuentaCorriente[100];
		Integer option = null, contadorCuentas = -1;
		Double dinero;
		String cliente;
		Boolean booleano;
		do {
			option = Metodo.getIntBetween(0, 5, "Elige la opción que quieres usar\n1. Crear nueva cuenta\n2. Ingresar en cuenta \n3. Retirar de cuenta\n4. Visualizar cuenta\n5. Visualiza todas las cuentas");
			switch (option) {
			default:
				break;
			case 1:
				contadorCuentas++;
				cliente = Metodo.getString("Introduce el nombre del cliente");
				cuentas[contadorCuentas] = new CuentaCorriente(0.00, cliente);
				break;
			case 2:
				//try {
				if (contadorCuentas > -1) {
					dinero = Metodo.getDoublePos("Introduce cuanto dinero quieres ingresar");
					cuentas[contadorCuentas].ingresaEfectivo(dinero);
				//} catch (ArrayIndexOutOfBoundsException e) {
				} else {
					System.out.println("Antes de cualquier otra operación, debe crear al menos una cuenta");
				}
				break;
			case 3:
				//try {
				if (contadorCuentas > -1) {
					dinero = Metodo.getDoublePos("Introduce cuanto dinero quieres ingresar");
					booleano = cuentas[contadorCuentas].retiraEfectivo(dinero);
					if (!booleano) {
						System.out.println("En la cuenta actualmente hay " + cuentas[contadorCuentas].getSaldo() + "€, por lo que no puede retirar " + dinero + "€");
					}
				//} catch (ArrayIndexOutOfBoundsException e) {
				} else {
					System.out.println("Antes de cualquier otra operación, debe crear al menos una cuenta");
				}
				break;
			case 4:
				//try {
				if (contadorCuentas > -1) {
					System.out.println(cuentas[contadorCuentas].visualizar());
				//} catch (ArrayIndexOutOfBoundsException e) {
				} else {
					System.out.println("Antes de cualquier otra operación, debe crear al menos una cuenta");
				}
				break;
			case 5:
				System.out.println("Lista de cuentas añadidas:");
				for (int contador = 0; contador < cuentas.length; contador++) {
					if (cuentas[contador] != null) System.out.println(cuentas[contador].visualizar() + "\n-------------------------");
					else {
						if (contador == 0) {
							System.out.println("No se ha añadido ninguna cuenta");
						}
						break;
					}
				}
				break;
			}
		} while(option != 0);
		System.out.println("Adios");
	}

}
