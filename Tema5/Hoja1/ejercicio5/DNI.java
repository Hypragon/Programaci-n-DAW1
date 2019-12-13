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
public class DNI {
	private int numero;
	private char letra;
	public DNI (String dni) {
		this.numero = Integer.parseInt(dni.substring(0, 8));
		this.letra = dni.toUpperCase().charAt(8);
	}
	public char calculaLetra() {
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		int resto = numero % 23;
		return letras.charAt(resto);
	}
	public boolean correcto() {
		if (this.letra == this.calculaLetra()) {
			return true;
		}
		else {
			return false;
		}
	}
	public String toString() {
		return this.numero + "-" + this.letra;
	}
}
