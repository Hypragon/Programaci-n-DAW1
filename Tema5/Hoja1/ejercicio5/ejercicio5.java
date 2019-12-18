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
public class ejercicio5 {
	public static void main(String[] args) {
		String cadena = "";
		DNI dni;
		cadena = Metodo.getStringLim(9, "Introduce un DNI");
		while (!str.equals("*")) {
			if (!str.equals("*")) {
				try{
					dni = new DNI(cadena);
					if (dni.correcto()) System.out.println(dni);
				} catch (StringIndexOutOfBoundsException e) {
					System.out.println("Los dni tienen 8 números y 1 letra");
				} catch (NumberFormatException e) {
					System.out.println("Los 8 primeros caracteres tienen que ser números");
				}
				cadena = Metodo.getStringLim(9, "Introduce un DNI");
			}
		}
	}
}
