package ejercicio;

public class Voluntario extends Cooperante {
	private String ong;
	public Voluntario(String nombre, String dni, String pais, String ong) {
		super(nombre, dni, pais);
		this.ong = ong;
	}
	public String muestraDatos() {
		return super.muestraDatos() + " - " + ong;
	}
}
