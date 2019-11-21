package t4h1e5;
public class Fecha {
	private Integer dia;
	private Integer mes;
	private Integer anyo;
	public Fecha(Integer dia, Integer mes, Integer anyo) /*throws IllegalArgumentException*/ {
		Boolean booleano;
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
		booleano = this.esCorrecta();
		if (!booleano) { //Forma de hacerlo con conocimientos actuales
			this.dia = null;
			this.mes = null;
			this.anyo = null;
		}
		//if (!booleano) throw new IllegalArgumentException(); //Forma de hacerlo avanzada
	}
	public Fecha(Fecha fecha) {
		this.dia = fecha.getDia();
		this.mes = fecha.getMes();
		this.anyo = fecha.getAnyo();
	}
	public Integer getDia() {
		return dia;
	}

	public void setDia(Integer dia) {
		this.dia = dia;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Integer getAnyo() {
		return anyo;
	}

	public void setAnyo(Integer anyo) {
		this.anyo = anyo;
	}

	public Boolean esBisiesto() {
		Boolean esBisiesto;
		if (anyo % 4 == 0) esBisiesto = true;
		else esBisiesto = false;
		return esBisiesto;
	}
	public static Boolean esBisiesto(Integer anyo) {
		Boolean esBisiesto;
		if (anyo % 4 == 0) esBisiesto = true;
		else esBisiesto = false;
		return esBisiesto;
	}
	public Boolean esCorrecta() {
		Boolean booleano = true;
		if (mes < 1 || mes > 12) {
			booleano = false;
		} else {
			if (this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10 || this.mes == 12) {
				if (this.dia < 1 || this.dia > 31) booleano = false;
			} else if (this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11) {
				if (this.dia < 1 || this.dia > 30) booleano = false;
			} else if (this.mes == 2) {
				if (Fecha.esBisiesto(this.anyo)) {
					if (this.dia < 1 && this.dia > 29) booleano = false;
				} else {
					if (this.dia < 1 && this.dia > 28) booleano = false;
				}
			}
		}
		return booleano;
	}
	public String getCadenaMes() {
		String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		return meses[this.mes - 1];
	}
	public Integer getDiasMes() {
		Integer dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (this.esBisiesto() && this.mes == 2) {
			return dias[this.mes - 1] + 1;
		} else {
			return dias[this.mes - 1];
		}
	}
	public static Integer getDiasMes(Integer mes, Integer anyo) {
		Integer dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (Fecha.esBisiesto(anyo) && mes == 2) {
			return dias[mes - 1] + 1;
		} else {
			return dias[mes - 1];
		}
	}
	public String getCadenaFecha1() {
		return this.dia + "-" + this.mes + "-" + this.anyo;
	}
	public String getCadenaFecha2() {
		return this.dia + " de " + this.getCadenaMes().toLowerCase() + " de " + this.anyo;
	}
	public static Integer diferenciaFecha(Fecha fecha1, Fecha fecha2) {
		Integer diasDiferencia = null, diasFecha1, diasFecha2;
		diasFecha1 = Fecha.dateToDay(fecha1);
		diasFecha2 = Fecha.dateToDay(fecha2);
		diasDiferencia = Math.abs(diasFecha1 - diasFecha2);
		return diasDiferencia;
	}
	public static Integer dateToDay(Fecha fecha) {
		Integer fechaEnDias =  null;
		fechaEnDias = fecha.getDia();
		for (int i = 1; i <= fecha.getMes(); i++) {
			fechaEnDias += Fecha.getDiasMes(i, fecha.getAnyo());
		}
		if (fecha.getAnyo() >= 0) {
			for (int i = 0; i <= fecha.getAnyo(); i++) {
				if (Fecha.esBisiesto(i)) fechaEnDias += 366;
				else fechaEnDias += 365;
			}
		} else {
			for (int i = 0; i >= fecha.getAnyo(); i--) {
				if (Fecha.esBisiesto(i)) fechaEnDias += 366;
				else fechaEnDias += 365;
			}
		}
		return fechaEnDias;
	}
	public Fecha sumaDias(Integer dias) {
		Fecha date = new Fecha(this);
		date.setDia(date.getDia() + dias);
		while (date.getDia() > date.getDiasMes()) {
			date.setDia(date.getDia()-date.getDiasMes());
			date.setMes(date.getMes() + 1);
			if (date.getMes() > 12) {
				date.setMes(date.getMes() - 12);
				date.setAnyo(date.getAnyo() + 1);
			}
		}
		return date;
	}
}
