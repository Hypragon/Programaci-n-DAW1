package hoja1;

/*
Dise�ar un algoritmo que pida un n�mero por teclado y muestre por pantalla el mes
al que corresponde ese n�mero (1 enero, 2 febrero, �, 12 diciembre). Si el n�mero
no corresponde a ning�n mes, debe decirlo tambi�n. 
 */
public class H1E14 {

	public static void main(String[] args) {
		int mes;
		mes = Metodo.getInt("Introduce un n�mero de mes");
		while (mes != 0) {
			switch (mes) {
			case 1:	
				System.out.println("Ese n�mero corresponde al mes de enero");
				break;
			case 2:	
				System.out.println("Ese n�mero corresponde al mes de febrero");
				break;
			case 3:
				System.out.println("Ese n�mero corresponde al mes de marzo");
				break;
			case 4:
				System.out.println("Ese n�mero corresponde al mes de abril");
				break;
			case 5:	
				System.out.println("Ese n�mero corresponde al mes de mayo");
				break;
			case 6:
				System.out.println("Ese n�mero corresponde al mes de junio");
				break;
			case 7:	
				System.out.println("Ese n�mero corresponde al mes de julio");
				break;
			case 8:
				System.out.println("Ese n�mero corresponde al mes de agosto");
				break;
			case 9:	
				System.out.println("Ese n�mero corresponde al mes de septiembre");	
				break;
				case 10:
				System.out.println("Ese n�mero corresponde al mes de octubre");
				break;
			case 11:
				System.out.println("Ese n�mero corresponde al mes de noviembre");
				break;
			case 12:
				System.out.println("Ese n�mero corresponde al mes de diciembre");
				break;
			}
			mes = Metodo.getInt("Introduce otro n�mero de mes");
		}
	}
}
