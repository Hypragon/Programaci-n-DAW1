package ejercicio5;

/*
Ejercicio 5
Realiza la siguiente clase:
Dni
private int numero;
private char letra;
public Dni(String dni){
//Separa la parte num�rica de la letra.
//Como el atributo �numero� es de tipo int, deber�s utilizar Integer.parseInt(�) para convertir el
String en entero. El m�todo Integer.parseInt() lanza una excepci�n cuando lo que recibe como
par�metro no puede convertirse en n�mero. No captures esta excepci�n aqu�, prop�gala al
m�todo principal.
}
public char calculaLetra(){
//devuelve la letra que se corresponde con la parte num�rica que tenemos guardada en el
//atributo numero
}
public boolean correcto() {
//Devuelve true cuando la letra guardada en el atributo �letra�, coincide con la que calculamos
// en el m�todo calcularLetra()
}
public String toString(){
//devuelve el dni en formato �12345678-S�
}
EJERCICIOS EXCEPCIONES. HOJA 1
El m�todo principal debe:
? Pedir n�meros de DNI, hasta que el usuario decida acabar el programa (lo indicar� dando como
dni un �*�)
? Comprobar� si son correctos o no, en caso de ser correctos, los mostrar� por pantalla.
? Todas las excepciones deben gestionarse desde el m�todo principal.
Probad a introducir todo tipo de errores que se os ocurran al probar el programa. El programa debe ser
capaz de continuar su ejecuci�n, sea cual sea el error que suceda.

 */
public class ejercicio5 {
	public static void main(String[] args) {
		String cadena = "";
		DNI dni;
		cadena = Metodo.getStringLim(9, "Introduce un DNI");
		
		while (cadena != "*") {
			try{
				dni = new DNI(cadena);
				if (dni.correcto()) System.out.println(dni);
			} catch (StringIndexOutOfBoundsException e) {
				System.out.println("Los dni tienen 8 n�meros y 1 letra");
			} catch (NumberFormatException e) {
				System.out.println("Los 8 primeros caracteres tienen que ser n�meros");
			}
			cadena = Metodo.getStringLim(9, "Introduce un DNI");
		}
	}
}
