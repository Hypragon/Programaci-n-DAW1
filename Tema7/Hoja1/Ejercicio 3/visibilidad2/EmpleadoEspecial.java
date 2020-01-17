package visibilidad2;
public class EmpleadoEspecial{
	public EmpleadoEspecial(String nombreEs, float sueldoEs, String direccionEs, int edad) {
		super();
		this.nombreEs = nombreEs;
		this.sueldoEs = sueldoEs;
		this.direccionEs = direccionEs;
		this.edad = edad;
	}
	public String nombreEs;
	private float sueldoEs;
	protected String direccionEs;
	int edad;
} 