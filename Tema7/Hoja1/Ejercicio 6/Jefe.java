package ejercicio;

public class Jefe extends Empleado{
	private static int extra = 250;
	private String dpto;
	public Jefe(String nombre, int edad, double incremento, String dpto) {
		super(nombre, edad, incremento);
		this.dpto = dpto;
	}
	public String toString() {
		return "Empresa: " + super.getEmpresa() + "\n"
				+ "Nombre: " + super.getNombre() + "\n"
				+ "Edad: " + super.getEdad() + "\n"
				+ "Sueldo: " + (super.getBase() * (1 + super.getIncremento()/100) + extra) + "\n"
				+ "Departamento: " + dpto;
	}
	public static void setExtra(int extra) {
		Jefe.extra = extra;
	}
}
