package hoja1;

//Algoritmo que lea tres n�meros distintos y nos diga cu�l de ellos es el mayor. 
public class H1E10 {

	public static void main(String[] args) {
		int numero1, numero2, numero3;
		numero1 = Metodo.getInt("Introduce un n�mero");
		numero2 = Metodo.getInt("Introduce un segundo n�mero");	
		numero3 = Metodo.getInt("Introduce un tercer n�mero");
		if (numero1 > numero2) {
			if (numero1 > numero3) {
				System.out.println("El mayor n�mero es " + numero1);
			} else {
				System.out.println("El mayor n�mero es " + numero3);
			}
		} else {
			if (numero2 > numero3) {
				System.out.println("El mayor n�mero es " + numero2);
			} else {
				System.out.println("El mayor n�mero es " + numero3);
			}
		}
	}
}
