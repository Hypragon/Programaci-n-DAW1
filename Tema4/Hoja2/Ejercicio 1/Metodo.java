package ejercicio;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.PatternSyntaxException;

public class Metodo {
	public static Integer getInt(String texto) {	//pide un Integer
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
		Integer val = 0;
		Boolean error = true;
		while (error) {
			try {
				System.out.println(texto);
				val = Integer.parseInt(dataIn.readLine());
				error = false;
			} catch (IOException e) {
				System.out.println("Dato erroneo. Vuelve a introducir el dato, por favor.");
				error = true;
			} catch (NumberFormatException e) {
				System.out.println("El dato introducido no es entero.");
				error = true;
			}
		}
		return val;
	}
	public static Integer getIntBetween(int num1, int num2, String texto) {	//pide un Integer entre 2 par�metros
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
		Integer val = 0;
		Boolean error = true;
		while (error || (val < num1 || val > num2)) {
			try {
				System.out.println(texto);
				val = Integer.parseInt(dataIn.readLine());
				error = false;
			} catch (IOException e) {
				System.out.println("Dato erroneo. Vuelve a introducir el dato, por favor.");
				error = true;
			} catch (NumberFormatException e) {
				System.out.println("El dato introducido no es entero.");
				error = true;
			}
		}
		return val;
	}
	public static String getString(String texto) {	//pide un string
		BufferedReader dataIn = new BufferedReader (new InputStreamReader(System.in));
		String val = "";
		Boolean error = true;
		while (error) {
			try {
				val = "";
				System.out.println(texto);
				val = dataIn.readLine();
				error = false;
			} catch (IOException e) {
				System.out.println("Vuelve a introducir el dato, por favor.");
				error = true;
			}
		}
		return val;
	}
	public static String getString(String texto, String regex) {	//pide un string con un contenido especificado
		BufferedReader dataIn = new BufferedReader( new InputStreamReader(System.in));
		String val = "";
		Boolean error = true;
		while (error) {
			try {
				val="";
				System.out.println(texto);
				val = dataIn.readLine();
				if (regex == null) {
					error = false;
				} else {
					error=!val.matches(regex);
					if (error) {
						System.out.println("Por favor, vuelve a introducir el dato. El dato intorducido no es un valor posible.");
					}
				}
			} catch (IOException e) {
				System.out.println("Vuelve a introducir el dato, por favor.");
				error = true;
			} catch (PatternSyntaxException e) {
				System.out.println("La expresion regular no es correcta");
				System.exit(0);
				error = false;
			}
		}
		return val;
	}
	public static String getStringLim(int lim, String texto) {	//pide un string con lim caracteres como m�ximo
		BufferedReader dataIn = new BufferedReader (new InputStreamReader(System.in));
		String val = "";
		Boolean error = true;
		while (error || val.length() > lim) {
			try {
				val = "";
				System.out.println(texto + " (max " + lim + " chars)");
				val = dataIn.readLine();
				error = false;
			} catch (IOException e) {
				System.out.println("Vuelve a introducir el dato, por favor.");
				error = true;
			}
		}
		return val;
	}
	public static Boolean numPri(int num) {	//dice si un n�mero es primo
		Boolean pri = true;
		if (num == 1) pri = false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				pri = false;
				break;
			}
		}
		return pri;
	}
	public static Integer getIntPos(String texto) {	//pide un Integer positivo
		BufferedReader dataIn = new BufferedReader (new InputStreamReader(System.in));
		Integer val = 0;
		Boolean error = true;
		while (error || val < 1) {
			try {
				val = 0;
				System.out.println(texto);
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
		Integer op1, op2;
		op1 = (int) Math.pow(b, 2);
		op2 = 4 * a * c;
		op1 -= op2;
		op1 = (int) Math.sqrt(op1);
		op2 = a * 2;
		op1 = (-b + op1) / op2;
		return op1;
	}
	public static Integer equationXQ(int a, int b, int c) {	//ecuacion de segundo grado (2x)
		Integer op1, op2;
		op1 = (int) Math.pow(b, 2);
		op2 = 4 * a * c;
		op1 -= op2;
		op1 = (int) Math.sqrt(op1);
		op2 = a * 2;
		op1 = (-b - op1) / op2;
		return op1;
	}
	public static Boolean getBoolean(String texto) {	//recibe un boolean
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
		Boolean res = null, error = true;
		String text;
		try {
			while (error) {
				System.out.println(texto);
				text = dataIn.readLine();
				if (text.compareToIgnoreCase("true") == 0 || text.compareToIgnoreCase("false") == 0) {
					res = Boolean.parseBoolean(text);
					error = false;
				}	
			}
		} catch (Throwable e) {
			error = true;
		}
		return res;
	}
	public static Double getDoublePos(String texto) {	//pide un Double positivo
		BufferedReader dataIn = new BufferedReader (new InputStreamReader(System.in));
		Double val = null;
		boolean error = true;
		while (error || val < 1) {
			try {
				val = null;
				System.out.println(texto);
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