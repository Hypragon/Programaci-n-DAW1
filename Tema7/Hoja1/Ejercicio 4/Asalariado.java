package ejercicio;

public class Asalariado extends Cooperante {
	private double sueldo;
	public Asalariado(String nombre, String dni, String pais, double sueldo) {
		super(nombre, dni, pais);
		this.sueldo = sueldo;
	}
	public String muestraDatos() {
		return super.muestraDatos() + " - " + sueldo;
	}
}
