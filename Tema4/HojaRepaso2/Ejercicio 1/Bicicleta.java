package ejercicio;

public class Bicicleta {
	private String color;
	private double precio;
	public Bicicleta(String color, double precio) {
		this.color = color;
		this.precio = precio;
	}
	public void pintar(String color) {
		this.color = color;
	}
	public double getPrecio() {
		return precio;
	}
	public String toString() {
		return "Bicicleta [color=" + color + ", precio=" + precio + "]";
	}
	
}
