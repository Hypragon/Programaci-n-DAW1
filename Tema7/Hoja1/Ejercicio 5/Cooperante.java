package ejercicio;

public class Cooperante {
	private String nombre;
	private String dni;
	private String pais;
	public Cooperante(String nombre, String dni, String pais) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.pais = pais;
	}
	public String toString() {
		return nombre + " - " + dni + " - " + pais; 
	}
	public void muestraDatos() {
		System.out.println(this);
	}
}
