package github;

public class Sobre {
	private String color;
	private Caramelo caramelo;
	public Sobre(String color, Caramelo caramelo) {
		super();
		this.color = color;
		this.caramelo = caramelo;
	}
	public Sobre(String color, String sabor, Double precio) {
		super();
		this.color = color;
		this.caramelo = new Caramelo(sabor, precio);
	}
	public String datosCaramelo() {
		return "Caramelo de " + this.caramelo.getSabor();
	}
	public Double precio() {
		return caramelo.getPrecio() + 0.1;
	}
	public String toString() {
		return "Caramelo de " + caramelo.getSabor() + " que cuesta " + precio() + "€ y es de color " + color;
	}
}
