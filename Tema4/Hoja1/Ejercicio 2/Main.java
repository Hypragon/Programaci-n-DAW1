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
public class Main {

	public static void main(String[] args) {
		Hora tiempo = new Hora();
		Boolean select;
		Integer hora = 0, minuto = 0, segundo = 0, option = 0, numero = 0;
		select = Metodo.getBoolean("Quieres elegir una hora específica para empezar? Por defecto: 0:0:0");
		if (select) {
			hora = Metodo.getInt("Elige la hora");
			minuto = Metodo.getInt("Elige el minuto");
			segundo = Metodo.getInt("Elige el segundo");
			tiempo = new Hora(hora, minuto, segundo);
			while (tiempo.checkHora() || tiempo.checkMin() || tiempo.checkSec()) {
				System.out.println("Se te van a volver a pedir los datos erroneos");
				if (tiempo.checkHora()) {
					hora = Metodo.getInt("Elige la hora");
				}
				if (tiempo.checkMin()) {
					minuto = Metodo.getInt("Elige el minuto");
				}
				if (tiempo.checkSec()) {
					segundo = Metodo.getInt("Elige el segundo");
				}
				tiempo = new Hora(hora, minuto, segundo);
			}
		} else {
			tiempo = new Hora();
		}
		do {
			option = Metodo.getIntBetween(0, 6,
					"Elige una opción: (0) Salir\n"
					+ "(1) Sumar horas\n"
					+ "(2) Restar horas\n"
					+ "(3) Mostrar hora\n"
					+ "(4) Mostrar la hora en segundos\n"
					+ "(5) Sumar segundos a la hora actual\n"
					+ "(6) Restar segundos a la hora actual.");
			switch (option) {
			default:
				break;
			case 1:
				numero = Metodo.getIntPos("Elige cuantas horas quieres sumar");
				tiempo.sumHora(numero);
				break;
			case 2:
				numero = Metodo.getIntPos("Elige cuantas horas quieres restar");
				tiempo.resHora(numero);
				break;
			case 3:
				System.out.println(tiempo);
				break;
			case 4:
				System.out.println(tiempo.conSegundos() + " segundos");
				break;
			case 5:
				numero = Metodo.getIntPos("Elige cuantos segundos quieres sumar");
				tiempo.sumSegundos(numero);
				break;
			case 6:
				numero = Metodo.getIntPos("Elige cuantos segundos quieres restar");
				tiempo.resSegundos(numero);
				break;
			}
		} while (option != 0);
	}

}
