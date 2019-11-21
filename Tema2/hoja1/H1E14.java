package hoja1;

/*
Diseñar un algoritmo que pida un número por teclado y muestre por pantalla el mes
al que corresponde ese número (1 enero, 2 febrero, …, 12 diciembre). Si el número
no corresponde a ningún mes, debe decirlo también. 
 */
public class H1E14 {

	public static void main(String[] args) {
		int mes;
		mes = Metodo.getInt("Introduce un número de mes");
		while (mes != 0) {
			switch (mes) {
			case 1:	
				System.out.println("Ese número corresponde al mes de enero");
				break;
			case 2:	
				System.out.println("Ese número corresponde al mes de febrero");
				break;
			case 3:
				System.out.println("Ese número corresponde al mes de marzo");
				break;
			case 4:
				System.out.println("Ese número corresponde al mes de abril");
				break;
			case 5:	
				System.out.println("Ese número corresponde al mes de mayo");
				break;
			case 6:
				System.out.println("Ese número corresponde al mes de junio");
				break;
			case 7:	
				System.out.println("Ese número corresponde al mes de julio");
				break;
			case 8:
				System.out.println("Ese número corresponde al mes de agosto");
				break;
			case 9:	
				System.out.println("Ese número corresponde al mes de septiembre");	
				break;
				case 10:
				System.out.println("Ese número corresponde al mes de octubre");
				break;
			case 11:
				System.out.println("Ese número corresponde al mes de noviembre");
				break;
			case 12:
				System.out.println("Ese número corresponde al mes de diciembre");
				break;
			}
			mes = Metodo.getInt("Introduce otro número de mes");
		}
	}
}
