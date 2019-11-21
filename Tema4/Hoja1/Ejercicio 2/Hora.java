package t4h1e2;
/*
2) Desarrollar un programa en Java que utilice una clase que se llame Hora con miembros de
tipo Integer para hora, minutos y segundos. Deberá tener un constructor para inicializar la
hora a 0 y otro para incializar a una hora determinada (hora, minutos, segundos. La hora
deberá ser una hora con valores posibles que hemos de controlar).Se deberá poder sumar
y restar horas, así como imprimir una hora, ver la conversión a segundos de una hora dada,
sumar segundos a una hora dada.
El formato de impresión y lectura será hh:mm:ss, todo en modo 24 horas.
 */
public class Hora {
	private Integer hora;
	private Integer minuto;
	private Integer segundo;

	public Hora() {
		super();
		this.hora = 0;
		this.minuto = 0;
		this.segundo = 0;
	}

	public Hora(Integer hora, Integer minuto, Integer segundo) {
		if (hora <= 23 && hora >= 0)
			this.hora = hora;
		else
			this.hora = null;
		if (hora <= 59 && hora >= 0)
			this.minuto = minuto;
		else
			this.minuto = null;
		if (hora <= 59 && hora >= 0)
			this.segundo = segundo;
		else
			this.segundo = null;
	}

	public Boolean checkHora() {
		Boolean error = false;
		if (hora == null)
			error = true;
		return error;
	}

	public Boolean checkMin() {
		Boolean error = false;
		if (minuto == null)
			error = true;
		return error;
	}

	public Boolean checkSec() {
		Boolean error = false;
		if (segundo == null)
			error = true;
		return error;
	}

	public void sumHora(Integer numero) {
		hora += numero;
		if (hora > 23)
			hora -= 24;
	}

	public void resHora(Integer numero) {
		hora -= numero;
		if (hora < 0)
			hora += 24;
	}

	public String toString() {
		return hora + ":" + minuto + ":" + segundo;
	}

	public Integer conSegundos() {
		Integer n;
		n = (hora * 3600) + (minuto * 60) + segundo;
		return n;
	}

	public void sumSegundos(Integer numero) {
		segundo += numero;
		while (segundo > 59 || minuto > 59 || hora > 23) {
			if (segundo > 59) {
				segundo -= 60;
				minuto++;
			}
			if (minuto > 59) {
				minuto -= 60;
				hora++;
			}
			if (hora > 23)
				hora -= 24;
		}
	}

	public void resSegundos(Integer numero) {
		segundo -= numero;
		while (segundo < 0 || minuto < 0 || hora < 0) {
			if (segundo < 0) {
				segundo += 60;
				minuto--;
			}
			if (minuto < 0) {
				minuto += 60;
				hora--;
			}
			if (hora > 0)
				hora += 24;
		}
	}
}
