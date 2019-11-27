package ejercicio;

public class CuentaCorriente{
	private Integer numCuenta;
	private Double saldo;
	private Cliente cliente;
	private Boolean cerrado;
	private static Integer numSiguiente = 0;
	public CuentaCorriente(Double saldo, Cliente cliente) { 
		this.numCuenta = contador();
		this.saldo = saldo;
		this.cliente = cliente;
		this.cerrado = false;
		numSiguiente++;
	}
	public static Integer contador() { 
		return numSiguiente;
	}
	public Double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return this.cliente;
	}
	public Integer getNumCuenta() {
		return this.numCuenta;
	}
	public void ingresaEfectivo(Double dinero) {
		this.saldo += dinero;
	}
	public Boolean retiraEfectivo(Double dinero) {
		Boolean retirar;
		if (dinero > this.saldo) retirar = false;
		else {
			this.saldo -= dinero;
			retirar = true;
		}
		return retirar;
	}
	public String toString() {
		String estado;
		if (this.cerrado) {
			estado = "Cuenta cerrada";
		} else {
			estado = "Cuenta abierta";
		}
		return "Número de cuenta: " + numCuenta + "\nSaldo de la cuenta: " + saldo + "€\nNombre de cliente: " + cliente + "\nEstado de cuenta: " + estado;
	}
	public void cerrarCuenta() {
		this.cerrado = true;
		this.saldo = 0.00;
	}
	public static CuentaCorriente fusionar(CuentaCorriente cuenta1, CuentaCorriente cuenta2) {
		Double saldo;
		CuentaCorriente cuentafinal = null;
		if (cuenta1.getCliente() == (cuenta2.getCliente()) && cuenta1.getNumCuenta() != cuenta2.getNumCuenta()) {
			saldo = cuenta1.getSaldo() + cuenta2.getSaldo();
			cuenta1.cerrarCuenta();
			cuenta2.cerrarCuenta();
			cuentafinal = new CuentaCorriente(saldo, cuenta1.getCliente());
			cuenta1.getCliente().setCuentaCorriente(cuentafinal);
		}
		return cuentafinal;
	}
}
