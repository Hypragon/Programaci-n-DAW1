package ejercicio;

import java.util.Arrays;

public class CarroDeLaCompra {
	private int numLineas;
	private int capacidad;
	private double precioTotal;
	private LineaCompra[] carro;
	public CarroDeLaCompra(int capacidad) {
		this.capacidad = capacidad;
		this.numLineas = 0;
		this.precioTotal = 0;
		this.carro = new LineaCompra[capacidad];
	}
	public void anyadirAlCarro(String nombreArticulo, double precioUnidad, int cantidad) throws IndexOutOfBoundsException{
		this.carro[numLineas] = new LineaCompra(nombreArticulo, precioUnidad, cantidad);
		this.precioTotal += precioUnidad * cantidad;
		numLineas++;
	}
	public void aumentarTamanyo(){
		this.capacidad+=3;
		this.carro = Arrays.copyOf(this.carro, this.capacidad);
	}
	public double getPrecioTotal() {
		return precioTotal;
	}
	public String totalAPagar() {
		return "El total a pagar es " + precioTotal + "€";
	}
	public String toString() {
		String str = "";
		for (int i = 0; i < Metodo.nullFinder(carro); i++) {
			str += carro[i].toString();
		}
		return "CarroDeLaCompra [numLineas=" + numLineas + "\ncapacidad=" + capacidad +  "\ncarro:" + str + "\nprecioTotal=" + precioTotal + "]";
	}
	
}
