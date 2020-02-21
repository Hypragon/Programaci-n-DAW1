package ejercicio;

public class Alumno {
	private String nombre;
	private String apellido;
	private int nota1;
	private int nota2;
	private int nota3;
	public Alumno(String nombre, String apellido, int nota1, int nota2, int nota3) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	public int getNota1() {
		return nota1;
	}
	public int getNota2() {
		return nota2;
	}
	public int getNota3() {
		return nota3;
	}
	@Override
	public String toString() {
		return "Nombre: " + nombre + " " + apellido + ", nota 1: " + nota1 + ", nota 2: " + nota2
				+ ", nota 3: " + nota3;
	}
}
