package ejercicio;

public class Empleado {
	private static String empresa = "Eléctrica, SA";
	private String nombre;
	private int edad;
	private double incremento;
	private static int base = 1000;
	public Empleado (String nombre, int edad, double incremento) {
		this.nombre = nombre;
		this.edad = edad;
		this.incremento = incremento;
	}
	public static int getBase() {
		return base;
	}
	public static void setBase(int base) {
		Empleado.base = base;
	}
	public static String getEmpresa() {
		return empresa;
	}
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public double getIncremento() {
		return incremento;
	}
	public String toString() {
		return "Empresa: " + empresa + "\n"
				+ "Nombre: " + nombre + "\n"
				+ "Edad: " + edad + "\n"
				+ "Sueldo: " + (base * (1 + incremento/100));
	}
}
