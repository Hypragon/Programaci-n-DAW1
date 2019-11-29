package github;

public class Persona {
	private String nombre;
	private Integer edad;
	public Persona(String nombre, Integer edad) {
		super();
		this.nombre = nombre;
		if (edad < 121 && edad > 0) this.edad = edad;
		else if (edad > 0) this.edad = 120;
		else this.edad = 0;
	}
	public String getNombre() {
		return nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public String toString() {
		return "(" + nombre + " " + edad + ")";
	}
}
