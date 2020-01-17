package visibilidad1;
public class Empleado{
	public Empleado(int sueldo, String nombre, String direccion, int edad) {
		super();
		this.sueldo = sueldo;
		this.nombre = nombre;
		this.direccion = direccion;
		this.edad = edad;
	}
	private int sueldo;
	String nombre;
	protected String direccion;
	public int edad;
} 
