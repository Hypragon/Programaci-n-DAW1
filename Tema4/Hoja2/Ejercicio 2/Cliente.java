package ejercicio;

import java.util.Arrays;

public class Cliente {
	private String nombre;
	private CuentaCorriente cuentasCorrientes[];
	public Cliente(String nombre) {
		this.nombre = nombre;
		this.cuentasCorrientes = new CuentaCorriente[0];
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setCuentaCorriente(CuentaCorriente cuentaCorriente) {
		this.cuentasCorrientes = Arrays.copyOf(this.cuentasCorrientes, this.cuentasCorrientes.length + 1);
		this.cuentasCorrientes[this.cuentasCorrientes.length - 1] = cuentaCorriente;
	}
	public String toString() {
		return this.nombre;
	}
	public CuentaCorriente[] getCuentasCorrientes() {
		return this.cuentasCorrientes;
	}
}
