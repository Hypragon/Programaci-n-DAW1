package hoja3;
/*
Escribe el programa que permita hacer lo siguiente: se dan por teclado una secuencia de
informaciones, cada una de ellas compuesta por un nombre y seis números, correspondientes al
nombre de un alumno y las calificaciones que ha obtenido en sus seis asignaturas. La secuencia termina
al introducir el nombre “FIN”. El programa debe mostrar el nombre del alumno seguido de su nota
media y finalmente la nota media del grupo.  */
public class H3E14 {

	public static void main(String[] args) {
		int contador = 0, mediaTotal = 0, asignatura1, asignatura2, asignatura3, asignatura4, asignatura5, asignatura;
		String alumno;
		alumno = Metodo.getString("Introduce el nombre de un alumno");
		while (!alumno.equalsIgnoreCase("FIN")) {
			asignatura1 = Metodo.getInt("Introduce la nota de la primera asignatura");
			asignatura2 = Metodo.getInt("Introduce la nota de la segunda asignatura");
			asignatura3 = Metodo.getInt("Introduce la nota de la tercera asignatura");
			asignatura4 = Metodo.getInt("Introduce la nota de la cuarta asignatura");
			asignatura5 = Metodo.getInt("Introduce la nota de la quinta asignatura");
			asignatura = Metodo.getInt("Introduce la nota de la sexta asignatura");
			System.out.println("La nota media de " + alumno + " es de " + ((asignatura1+asignatura2+asignatura3+asignatura4+asignatura5+asignatura)/6));
			mediaTotal += (asignatura1+asignatura2+asignatura3+asignatura4+asignatura5+asignatura)/6;
			contador++;
			alumno = Metodo.getString("Introduce el nombre de otro alumno");
		}
		System.out.println("La media de los " + contador + " alumnos es " + (mediaTotal/contador));
	}

}
