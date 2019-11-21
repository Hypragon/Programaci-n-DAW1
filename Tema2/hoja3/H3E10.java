package hoja3;
/*
Haz un programa que pida por teclado el nombre y la edad de 10 alumnos y muestre en pantalla el
número de alumnos que son mayores de edad y el nombre y la edad del mayor. 
 */
public class H3E10 {
	public static void main(String[] args) {
		int edad, mayoresDeEdad = 0, edadDelMayor = 0;
		String nombre, nombreDelMayor = null;
		for (int contador = 0; contador < 9; contador++) {
			nombre = Metodo.getString("Introduce el nombre del alumno");
			edad = Metodo.getInt("Introduce su edad");
			if (edad > 17) {
				mayoresDeEdad++;
			}
			if (edad > edadDelMayor) {
				nombreDelMayor = nombre;
				edadDelMayor = edad;
			}
		}
		System.out.println("Hay " + mayoresDeEdad + " mayores de edad.\nEl mayor alumno es " + nombreDelMayor + ", que tiene " + edadDelMayor + " años.");
	}
}
