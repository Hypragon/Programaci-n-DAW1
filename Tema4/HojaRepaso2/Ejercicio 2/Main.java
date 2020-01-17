package ejercicio;

public class Main {
	public static void main(String[] args) {
		Atleta[] atletas = new Atleta[10];
		int option;
		double di, dj, dk;
		String str;
		do {
			option = Metodo.getIntBetween(0, 3, "1- Inscribir un participante.\r\n" + 
					"2- Mostrar listado de datos de los participantes.\r\n" + 
					"3- Mostrar listado por marcas.\r\n" + 
					"0- Finalizar el programa.");
			switch (option) {
			case 1:
				str = Metodo.getString("Introduce el nombre del atleta");
				di = Metodo.getDoublePos("Introduce su record de 2019");
				dj = Metodo.getDoublePos("Introduce su record de 2018");
				dk = Metodo.getDoublePos("Introduce su record de 2017");
				atletas[Metodo.nullFinder(atletas)] = new Atleta (str, di, dj, dk);
				break;
			case 2:
				atletas = ordenarDorsal(atletas);
				Metodo.printArray(atletas);
				break;
			case 3:
				atletas = ordenarMarca(atletas);
				Metodo.printArray(atletas);
				break;
			default:
				break;
			}
		} while (option != 0);
	}
	public static Atleta[] ordenarDorsal(Atleta[] arr) {
		Atleta aux;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < (arr.length - 1) - i; j++) {
				if (arr[j + 1] != null && arr[j].getDorsal() > arr[j + 1].getDorsal()) {
					aux = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = aux;
				}
			}
		}
		return arr;
	}
	public static Atleta[] ordenarMarca(Atleta[] arr) {
		Atleta aux;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < (arr.length - 1) - i; j++) {
				if (arr[j + 1] != null && arr[j].getMm19() < arr[j + 1].getMm19()) {
					aux = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = aux;
				}
			}
		}
		return arr;
	}
}
