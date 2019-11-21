package t4h1e4;

public class CuentaCorriente {
	private Integer numCuenta;
	private Double saldo;
	private String cliente;
	private static Integer numSiguiente = 0;
	public CuentaCorriente(Double saldo, String cliente) {
		this.numCuenta = getNumSiguiente();
		this.saldo = saldo;
		this.cliente = cliente;
		numSiguiente++;
	}
	public static Integer getNumSiguiente() {
		return numSiguiente;
	}
	public void ingresaEfectivo(Double dinero) {
		this.saldo += dinero;
	}
	public Boolean retiraEfectivo(Double dinero) {
		Boolean retirar;
		if (dinero > this.saldo) {
			retirar = false;
		} else {
			this.saldo -= dinero;
			retirar = true;
		}
		return retirar;
	}
	public String visualizar() {
		return "Número de cuenta: " + numCuenta + "\nSaldo de la cuenta: " + saldo + "€\nNombre de cliente: " + cliente;
	}
	public Double getSaldo() {
		return this.saldo;
	}
}
