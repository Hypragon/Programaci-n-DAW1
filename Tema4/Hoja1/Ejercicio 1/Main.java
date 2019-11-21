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

public class Main {

	public static void main(String[] args) {
		Boolean boo = false;
		Integer valorMin[] = {0, -273, 0}, valorMax[] = {180, 100, 1000}, indicadorActual = 0, option = 0;
		String unidad[] = {"km/h", "º", "kg"}, nombre[] = {"velocidad", "temperatura", "peso"};
		Indicador indicadores[] = new Indicador [3];
		for (int contador = 0; contador < indicadores.length; contador++) {
			indicadores[contador] = new Indicador(valorMin[contador], valorMax[contador], unidad[contador], nombre[contador]);
		}
		indicadorActual = Metodo.getIntBetween(0, (indicadores.length - 1), "Elige que indicador quieres utilizar: (0) velocidad, (1) temperatura o (2) peso");
		do {
			option = Metodo.getIntBetween(0, 5, "Elige que quieres hacer: (0) Salir, (1) Indicar el valor actual, (2) Ver el valor actual, (3) Ver todos los datos del indicador, (4) Incrementar el valor actual o (5) Disminuir el valor actual.");
			switch (option) {
			default:
				break;
			case 1:
				boo = indicadores[indicadorActual].setValorActual(Metodo.getInt("Introduce el valor actual"));
				if (boo) {
					System.out.println("El valor actual no se encuentra entre " + indicadores[indicadorActual].getValorMin() + " y " + indicadores[indicadorActual].getValorMax());
				}
				break;
			case 2:
				System.out.println(indicadores[indicadorActual].getValorActual() + indicadores[indicadorActual].getUnidad());
				break;
			case 3:
				System.out.println(indicadores[indicadorActual]);
				break;
			case 4:
				boo = indicadores[indicadorActual].incrementarValor(Metodo.getInt("Introduce cuanto quieres aumentar el valor actual"));
				if (boo) {
					System.out.println("El valor actual no ha podido ser modificado. Los limites actuales son " + indicadores[indicadorActual].getValorMin() + indicadores[indicadorActual].getUnidad() + " y " + indicadores[indicadorActual].getValorMax() + indicadores[indicadorActual].getUnidad() + ". (valor actual " + indicadores[indicadorActual].getValorActual() + indicadores[indicadorActual].getUnidad() + ")");
				} else {
					System.out.println("El valor actual ha sido incrementado a " + indicadores[indicadorActual].getValorActual() + indicadores[indicadorActual].getUnidad());
				}
				break;
			case 5:
				boo = indicadores[indicadorActual].disminuirValor(Metodo.getInt("Introduce cuanto quieres disminuir el valor actual"));
				if (boo) {
					System.out.println("El valor actual no ha podido ser modificado. Los limites actuales son " + indicadores[indicadorActual].getValorMin() + indicadores[indicadorActual].getUnidad() + " y " + indicadores[indicadorActual].getValorMax() + indicadores[indicadorActual].getUnidad() + ". (valor actual " + indicadores[indicadorActual].getValorActual() + indicadores[indicadorActual].getUnidad() + ")");
				} else {
					System.out.println("El valor actual ha sido disminuido a " + indicadores[indicadorActual].getValorActual() + indicadores[indicadorActual].getUnidad());
				}
				break;
			}
		} while (option != 0);
		System.out.println("Adios");
	}

}
