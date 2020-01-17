package ejercicio;

public class Atleta {
	private static int n = 0;
	private String nombre;
	private int dorsal;
	private double mm19;
	private double mm18;
	private double mm17;
	public Atleta(String nombre, double mm19, double mm18, double mm17) {
		this.nombre = nombre;
		this.dorsal = n;
		this.mm19 = mm19;
		this.mm18 = mm18;
		this.mm17 = mm17;
		n++;
	}
	public String getNombre() {
		return nombre;
	}
	public int getDorsal() {
		return dorsal;
	}
	public double getMm19() {
		return mm19;
	}
	public double getMm18() {
		return mm18;
	}
	public double getMm17() {
		return mm17;
	}
	@Override
	public String toString() {
		return "Atleta [nombre=" + nombre + ", dorsal=" + dorsal + ", mm19=" + mm19 + ", mm18=" + mm18 + ", mm17="
				+ mm17 + "]";
	}
	
}
