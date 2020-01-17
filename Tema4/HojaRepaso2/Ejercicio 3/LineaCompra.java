package ejercicio;

public class LineaCompra {
	private String nombreArticulo;
	private double precioUnidad;
	private int cantidad;
	public LineaCompra(String nombreArticulo, double precioUnidad, int cantidad) {
		this.nombreArticulo = nombreArticulo;
		this.precioUnidad = precioUnidad;
		this.cantidad = cantidad;
	}
	public String getNombreArticulo() {
		return nombreArticulo;
	}
	public double getPrecioUnidad() {
		return precioUnidad;
	}
	public int getCantidad() {
		return cantidad;
	}
	public String toString() {
		return "\nLineaCompra [nombreArticulo=" + nombreArticulo + ", precioUnidad=" + precioUnidad + ", cantidad="
				+ cantidad + ", precioTotal=" + (precioUnidad * cantidad) + "]";
	}
	
}
