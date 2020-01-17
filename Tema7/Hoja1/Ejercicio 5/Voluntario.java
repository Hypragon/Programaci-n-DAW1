package ejercicio;

public class Voluntario extends Cooperante {
	private String ong;
	public Voluntario(String nombre, String dni, String pais, String ong) {
		super(nombre, dni, pais);
		this.ong = ong;
	}
	public String toString() {
		return super.toString() + " - " + ong;
	}
	public void muestraDatos() {
		System.out.println(this);
	}
}
