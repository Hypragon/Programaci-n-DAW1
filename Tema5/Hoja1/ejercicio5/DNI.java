package ejercicio5;
/*
Ejercicio 5
Realiza la siguiente clase:
Dni
private int numero;
private char letra;
public Dni(String dni){
//Separa la parte numérica de la letra.
//Como el atributo “numero” es de tipo int, deberás utilizar Integer.parseInt(…) para convertir el
String en entero. El método Integer.parseInt() lanza una excepción cuando lo que recibe como
parámetro no puede convertirse en número. No captures esta excepción aquí, propágala al
método principal.
}
public char calculaLetra(){
//devuelve la letra que se corresponde con la parte numérica que tenemos guardada en el
//atributo numero
}
public boolean correcto() {
//Devuelve true cuando la letra guardada en el atributo “letra”, coincide con la que calculamos
// en el método calcularLetra()
}
public String toString(){
//devuelve el dni en formato “12345678-S”
}
EJERCICIOS EXCEPCIONES. HOJA 1
El método principal debe:
? Pedir números de DNI, hasta que el usuario decida acabar el programa (lo indicará dando como
dni un “*”)
? Comprobará si son correctos o no, en caso de ser correctos, los mostrará por pantalla.
? Todas las excepciones deben gestionarse desde el método principal.
Probad a introducir todo tipo de errores que se os ocurran al probar el programa. El programa debe ser
capaz de continuar su ejecución, sea cual sea el error que suceda.

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
