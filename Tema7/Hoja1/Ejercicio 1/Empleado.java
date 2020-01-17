package ejercicio;

public class Empleado {
	private String nombre;
	private double sueldo;
	public Empleado (String nombre, double sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + "]";
	}
	public String getNombre() {
		return this.nombre;
	}
	public double getSueldo() {
		return this.sueldo;
	}
}
