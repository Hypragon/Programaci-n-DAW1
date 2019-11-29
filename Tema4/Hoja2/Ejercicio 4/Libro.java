package ejercicio;

public class Libro {
	private String titulo;
	private Autor autores[];
	private Double precio;
	private Integer cantidad;
	public Libro(String titulo, Autor autores[], Double precio) {
		this.titulo =  titulo;
		this.autores = autores;
		this.precio = precio;
		this.cantidad = 0;
	}
	public Libro(String titulo, Autor autores[], Double precio, Integer cantidad) {
		this.titulo = titulo;
		this.autores = autores;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Autor[] getAutores() {
		return autores;
	}
	public void setAutores(Autor autores[]) {
		this.autores = autores;
	}
	public String cadenaLibro() {
		 return "Libro [titulo = " +  titulo + "\n"
				+ this.cadenaAutores()
				+ "\nprecio = " + precio + "€\n"
				+ "cantidad = " + cantidad + "]";
	}
	public String cadenaAutores() {
		String cadena = "";
		for(int i = 0; i < this.autores.length; i++) {
			if (i != 0) {
				cadena += "\n";
			}
			cadena += this.autores[i];
		}
		return cadena;
	}
}
