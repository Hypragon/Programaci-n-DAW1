package ejercicio;


public class Libro {
	private String titulo;
	private Autor autor;
	private Double precio;
	private Integer cantidad;
	public Libro(String titulo, Autor autor, Double precio) {
		this.titulo =  titulo;
		this.autor = autor;
		this.precio = precio;
		this.cantidad = 0;
	}
	public Libro(String titulo, Autor autor, Double precio, Integer cantidad) {
		this.titulo = titulo;
		this.autor = autor;
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
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public String cadenaLibro() {
		 return "Libro [titulo = " +  titulo + "\n"
				+ autor + "\n"
				+ "precio = " + precio + "€\n"
				+ "cantidad = " + cantidad + "]";
	}
}
