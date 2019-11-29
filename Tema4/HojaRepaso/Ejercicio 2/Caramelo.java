package github;

public class Caramelo {
	private String sabor;
	private Double precio;
	public Caramelo(String sabor, Double precio) {
		super();
		this.sabor = sabor;
		this.precio = precio;
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String toString() {
		return "Caramelo de " +  sabor + " que cuesta " + precio + "€";
	}
}
