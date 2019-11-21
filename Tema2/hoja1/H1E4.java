package hoja1;

//Algoritmo que pida dos números y muestre por pantalla su suma, resta, producto y división. 
public class H1E4 {

	public static void main(String[] args) {
		int operando1, operando2, suma, resta, multipicacion;
		double division;
		operando1 = Metodo.getInt("Introduce el primer operando.");
		operando2 = Metodo.getInt("Introduce el segundo operando.");
		suma = operando1 + operando2;
		resta = operando1 - operando2;
		multipicacion = operando1 * operando2;
		division = (double)(operando1 / operando2);
		System.out.println("La suma de los operandos es " + suma + ", la resta es " + resta + ", la multiplicación es " + multipicacion + " y el cociente es " + division);
	}
}
