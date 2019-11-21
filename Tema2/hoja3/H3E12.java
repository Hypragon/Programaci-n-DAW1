package hoja3;
/*
) Programa que obtenga el producto de dos números enteros positivos dados por teclado mediante
sumas sucesivas y lo muestre en pantalla.  */
public class H3E12 {

	public static void main(String[] args) {
		int operando1, operando2, resultadoMultiplicacion = 0;
		operando1 = Metodo.getInt("Introduce el primer multiplicador");	
		operando2 = Metodo.getInt("Introduce el segundo multiplicador");
		for (int contador = 0; contador < operando2; contador++) {
			resultadoMultiplicacion += operando1;
		}
		System.out.println(operando1 + " * " + operando2 + " = " + resultadoMultiplicacion);
	}

}
