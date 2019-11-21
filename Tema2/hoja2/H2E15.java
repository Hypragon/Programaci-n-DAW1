package hoja2;

import hoja1.Metodo;

/*
Realizar un programa que elija mediante un menú un tipo de figura:
Triángulo
Cuadrado
Rectángulo
Una vez elegida la opción, nos tiene que pedir en cada caso los datos necesarios para
calcular su área y mostrarla
 */
public class H2E15 {

	public static void main(String[] args) {
		int menu, base, altura;
		menu = Metodo.getInt("Elige de que figura quieres calcular su area: Triangulo(1), Cuadrado(2) o Rectángulo(3). Salir(0)");
		while (menu < 0 || menu > 3) {
			menu = Metodo.getInt("Esa no es una opción valida. Vuelve a elegir: Triangulo(1), Cuadrado(2) o Rectángulo(3)");
		}
		switch (menu) {
		case 1:
			base = Metodo.getInt("Introduce la base del triángulo");
			altura = Metodo.getInt("Introduce la altura del triángulo");
			System.out.println("El area de un triángulo de base " + base + " y altura " + altura + " es " + ((base * altura) / 2));
		case 2:
			base = Metodo.getInt("Introduce un lado del cuadrado");
			System.out.println("El area de un cuadrado de lado " + base + " es " + Math.pow(base, 2));
		case 3:
			base = Metodo.getInt("Introduce la base del rectángulo");
			altura = Metodo.getInt("Introduce la altura del rectángulo");
			System.out.println("El area de un rectángulo de base " + base + " y altura " + altura + " es " + (base * altura));
		case 0:
			System.out.println("Adios");
		}
	}
}
