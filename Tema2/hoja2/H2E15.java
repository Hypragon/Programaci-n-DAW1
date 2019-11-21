package hoja2;

import hoja1.Metodo;

/*
Realizar un programa que elija mediante un men� un tipo de figura:
Tri�ngulo
Cuadrado
Rect�ngulo
Una vez elegida la opci�n, nos tiene que pedir en cada caso los datos necesarios para
calcular su �rea y mostrarla
 */
public class H2E15 {

	public static void main(String[] args) {
		int menu, base, altura;
		menu = Metodo.getInt("Elige de que figura quieres calcular su area: Triangulo(1), Cuadrado(2) o Rect�ngulo(3). Salir(0)");
		while (menu < 0 || menu > 3) {
			menu = Metodo.getInt("Esa no es una opci�n valida. Vuelve a elegir: Triangulo(1), Cuadrado(2) o Rect�ngulo(3)");
		}
		switch (menu) {
		case 1:
			base = Metodo.getInt("Introduce la base del tri�ngulo");
			altura = Metodo.getInt("Introduce la altura del tri�ngulo");
			System.out.println("El area de un tri�ngulo de base " + base + " y altura " + altura + " es " + ((base * altura) / 2));
		case 2:
			base = Metodo.getInt("Introduce un lado del cuadrado");
			System.out.println("El area de un cuadrado de lado " + base + " es " + Math.pow(base, 2));
		case 3:
			base = Metodo.getInt("Introduce la base del rect�ngulo");
			altura = Metodo.getInt("Introduce la altura del rect�ngulo");
			System.out.println("El area de un rect�ngulo de base " + base + " y altura " + altura + " es " + (base * altura));
		case 0:
			System.out.println("Adios");
		}
	}
}
