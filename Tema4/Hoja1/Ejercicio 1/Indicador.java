package t4h1e1;

/*
1) Desarrollar un programa en Java que utilice una clase que se llame Indicador que sea la
representación de un indicador de la vida real (indicadores de nivel, de velocidad,
tacómetros, etc).
La clase deberá tener los atributos valorMinimo, valorMaximo, valorActual,
unidades y nombre del indicador. En el momento de la creación de cada objeto se
asignarán todos los elementos salvo el valorActual. Entre los métodos que se
programarán deberán estar el de asignación del valorActual, imprimir el valor, imprimir el
indicador e incrementar y disminuir el valorActual con el que cuentan.
En ese programa (el principal), crearás un vector de elementos de tipo Indicador y se podrá
escoger el indicador a tratar. 
 */
public class Indicador {

	private Integer valorMin;
	private Integer valorMax;
	private Integer valorActual;
	private String unidad;
	private String nombre;

	public Indicador(Integer valorMin, Integer valorMax, String unidad, String nombre) {
		super();
		this.valorMin = valorMin;
		this.valorMax = valorMax;
		this.unidad = unidad;
		this.nombre = nombre;
	}

	public Integer getValorMin() {
		return valorMin;
	}
	public Integer getValorMax() {
		return valorMax;
	}
	public Integer getValorActual() {
		return valorActual;
	}
	public String getUnidad() {
		return unidad;
	}
	public Boolean setValorActual(Integer valorActual) {
		Boolean error = true;
		if (valorActual <= valorMax && valorActual >= valorMin) {
			this.valorActual = valorActual;
			error = false;
		} 
		return error;
	}
	public String toString() {
		return "[Valor Mínimo: " + valorMin + ", Valor Máximo: " + valorMax + ", Valor Actual: " + valorActual + ", Unidad del indicador: " + unidad + " y nombre del indicador: " + nombre + "]";
	}

	public Boolean incrementarValor(int numero) {
		Boolean error = true;
		try {	
			if (valorActual + numero <= valorMax && valorActual + numero >= valorMin) {
				valorActual =+ numero;
				error = false;
			}
		} catch (NullPointerException e) {
			error = true;
		}
		return error;
	}

	public Boolean disminuirValor(int numero) {
		Boolean error = true;
		try {
			if (valorActual - numero >= valorMin && valorActual - numero <= valorMax) {
				valorActual =- numero;
				error = false;
			}
		} catch (NullPointerException e) {
			error = true;
		}
		return error;
	}
}
