package ejercicio;

public class Autor {
	private String nombre;
	private String email;
	private Character genero;
	public Autor(String nombre, String email, Character genero) {
		if (genero == 'm' || genero == 'f') {
			this.nombre = nombre;
			this.email = email;
			this.genero = genero;
		}
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Character getGenero() {
		return genero;
	}
	public String toString() {
		return "Autor[nombre = " + nombre + ", email = " + email + ", genero = " + genero + "]";
	}
}
