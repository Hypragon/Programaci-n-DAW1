package t4h1e2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.PatternSyntaxException;

public class Metodo {
	public static Integer getInt(String textoPedirValor) {	//Metodo para pedir un Integer
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
		Integer numeroInt = null;
		Boolean error = true;
		while (error) {
			try {
				System.out.println(textoPedirValor);
				numeroInt = Integer.parseInt(dataIn.readLine());
				error = false;
			} catch (IOException e) {
				System.out.println("Dato erroneo. Vuelve a introducir el dato, por favor.");
				error = true;
			} catch (NumberFormatException e) {
				System.out.println("El dato introducido no es entero.");
				error = true;
			}
		}
		return numeroInt;
	}
	public static Integer getIntBetween(int num1, int num2, String textoPedirValor) {	//Metodo para pedir un número entre num1 y num2
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
		Integer numeroInt = null;
		Boolean error = true;
		while (error || (numeroInt < num1 || numeroInt > num2)) {
			try {
				System.out.println(textoPedirValor);
				numeroInt = Integer.parseInt(dataIn.readLine());
				error = false;
			} catch (IOException e) {
				System.out.println("Dato erroneo. Vuelve a introducir el dato, por favor.");
				error = true;
			} catch (NumberFormatException e) {
				System.out.println("El dato introducido no es entero.");
				error = true;
			}
		}
		return numeroInt;
	}
	public static String getString(String textoPedirValor) {	//Metodo para pedir un String
		BufferedReader dataIn = new BufferedReader (new InputStreamReader(System.in));
		String frase = "";
		Boolean error = true;
		while (error) {
			try {
				System.out.println(textoPedirValor);
				frase = dataIn.readLine();
				error = false;
			} catch (IOException e) {
				System.out.println("Vuelve a introducir el dato, por favor.");
				error = true;
			}
		}
		return frase;
	}
	public static String getString(String textoPedirValor, String regex) {	//Metodo para pedir un String que contiene un valor regex
		BufferedReader dataIn = new BufferedReader( new InputStreamReader(System.in));
		String frase = "";
		Boolean error = true;
		while (error) {
			try {
				System.out.println(textoPedirValor);
				frase = dataIn.readLine();
				if (regex == null) {
					error = false;
				} else {
					error=!frase.matches(regex);
					if (error) {
						System.out.println("Por favor, vuelve a introducir el dato. El dato intorducido no es un valor posible.");
					}
				}
			} catch (IOException e) {	//Captura un error para que la consola no se cierre
				System.out.println("Vuelve a introducir el dato, por favor.");
				error = true;
			} catch (PatternSyntaxException e) {
				System.out.println("La expresion regular no es correcta");
				System.exit(0);
				error = true;
			}
		}
		return frase;
	}
	public static String getStringLim(int limiteCaracteres, String textoPedirValor) {	//Pide un string que no tenga más caracteres de los especificados
		BufferedReader dataIn = new BufferedReader (new InputStreamReader(System.in));
		String frase = "";
		Boolean error = true;
		while (error || frase.length() > limiteCaracteres) {
			try {
				System.out.println(textoPedirValor + " (max " + limiteCaracteres + " chars)");
				frase = dataIn.readLine();
				error = false;
			} catch (IOException e) {
				System.out.println("Vuelve a introducir el dato, por favor.");
				error = true;
			}
		}
		return frase;
	}
	public static Boolean numPri(int numero) {	//dice si un número es primo
		Boolean esPrimo = true;
		if (numero == 1) esPrimo = false;
		for (int contador = 2; contador < numero; contador++) {
			if (numero % contador == 0) {
				esPrimo = false;
				break;
			}
		}
		return esPrimo;
	}
	public static Integer getIntPos(String textoPedirValor) {	//Pide un Integer que sea positivo
		BufferedReader dataIn = new BufferedReader (new InputStreamReader(System.in));
		Integer val = 0;
		Boolean error = true;
		while (error || val < 1) {
			try {
				System.out.println(textoPedirValor);
				val = Integer.parseInt(dataIn.readLine());
				error = false;
			} catch (IOException e) {
				System.out.println("Vuelve a introducir el dato, por favor.");
				error = true;
			} catch (NumberFormatException e) {
				System.out.println("El dato introducido no es entero.");
				error = true;
			}
		}
		return val;	
	}
	public static Integer equationX(int a, int b, int c) {	//ecuacion de segundo grado (x)
		Integer operando1;
		Integer operando2;
		operando1 = (int) Math.pow(b, 2);
		operando2 = 4 * a * c;
		operando1 -= operando2;
		operando1 = (int) Math.sqrt(operando1);
		operando2 = a * 2;
		operando1 = (-b + operando1) / operando2;
		return operando1;
	}
	public static Integer equationXQ(int a, int b, int c) {	//ecuacion de segundo grado (2x)
		Integer operando1;	
		Integer operando2;
		operando1 = (int) Math.pow(b, 2);
		operando2 = 4 * a * c;
		operando1 -= operando2;
		operando1 = (int) Math.sqrt(operando1);
		operando2 = a * 2;
		operando1 = (-b - operando1) / operando2;
		return operando1;
	}
	public static boolean compararArray(char[][] array1, char[][] array2) {				//Metodo para saber si dos arrays tienen el mismo contenido
		if (array1 == null) {
			return (array2 == null);
		}
		if (array2 == null) {
			return false;
		}
		if (array1.length != array2.length) {
			return false;
		}
		for (int i = 0; i < array1.length; i++) {
			if (!Arrays.equals(array1[i], array2[i])) {
				return false;
			}
		}
		return true;
	}
	public static Boolean getBoolean(String textoPedirValor) {				//recibe un boolean
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
		Boolean res = null;
		Boolean error = true;
		String text;
		while (error) {	
			try {
				System.out.println(textoPedirValor);
				text = dataIn.readLine();
				if (text.compareToIgnoreCase("true") == 0 || text.compareToIgnoreCase("false") == 0) {
					res = Boolean.parseBoolean(text);
					error = false;
				}	
			} catch (Throwable e) {
				System.out.println("Introduce un valor booleano");
				error = true;
			}
		}

		return res;
	}
	public static Double getDoublePos(String textoPedirValor) {	//pide un Double positivo
		BufferedReader dataIn = new BufferedReader (new InputStreamReader(System.in));
		Double val = null;
		boolean error = true;
		while (error || val < 1) {
			try {
				System.out.println(textoPedirValor);
				val = Double.parseDouble(dataIn.readLine());
				error = false;
			} catch (IOException e) {
				System.out.println("Vuelve a introducir el dato, por favor.");
				error = true;
			} catch (NumberFormatException e) {
				System.out.println("El dato introducido no es entero.");
				error = true;
			}
		}
		return val;
	}
}