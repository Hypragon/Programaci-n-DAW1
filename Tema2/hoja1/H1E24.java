package hoja1;

/*
Realizar un algoritmo que pida dos n�meros, un dividendo y un divisor. Si el
divisor es distinto de 0, mostrar� el resultado de la operaci�n. En caso contrario le
dir� al usuario �En una divisi�n, el divisor no puede ser 0�. 
 */
public class H1E24 {

	public static void main(String[] args) {
		int dividendo, divisor;
		dividendo = Metodo.getInt("Introduce un dividendo");
		divisor = Metodo.getInt("Introduce un divisor");
		if (divisor != 0) {
			System.out.println(dividendo / divisor);
		}
		else System.out.println("Es una divisi�n, el divisor no puede ser 0");
	}
}
