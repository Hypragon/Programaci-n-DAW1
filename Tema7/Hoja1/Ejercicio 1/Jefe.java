package ejercicio;

public class Jefe extends Empleado{
	private String titulo;
	private String departamento;
	public Jefe (String nombre, double sueldo, String titulo, String departamento) {
		super(nombre, sueldo);
		this.titulo = titulo;
		this.departamento = departamento;
	}
	@Override
	public String toString() {
		return "Jefe [titulo=" + titulo + ", departamento=" + departamento + ", nombre=" + getNombre()
				+ ", sueldo=" + getSueldo() + "]";
	}
	public String getTitulo() {
		return this.titulo;
	}
	public String getDepartamento() {
		return this.departamento;
	}
}
