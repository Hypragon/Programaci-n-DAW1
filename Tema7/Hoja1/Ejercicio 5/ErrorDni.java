package ejercicio;

public class ErrorDni extends Exception{
	String informeError() {
		return "El DNI introducido es incorrecto";
	}
}
