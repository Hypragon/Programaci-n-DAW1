package t4h1e3;
/*
3) Diseña la clase TragaBolas que tiene los siguientes atributos y métodos:
TragaBolas
- color: String. Color del tragabolas. Sólo puede ser azul, amarillo, rojo o verde.
- bolasComidas: Integer. Número de bolas que ha comido hasta el momento.
- maxBolas: Integer. La cantidad máxima de bolas que puede comer.
+ TragaBolas(String, Integer): Parámetros el color y maxBolas. Las bolasComidas se
inicializan a 0.
+ visualizar(): Muestra los datos del tragabolas por pantalla.
+ comer(): sólo puede comer si bolasComidas es menor que maxBolas, esta acción
sumará 1 a bolasComidas y mostrará por pantalla "He comido una bola".
+ trotar(): sólo puede trotar si bolasComidas es mayor o igual que 1, esta acción
restará 1 de bolasComidas y mostrará por pantalla "Estoy trotando".
+ dormir(): sólo puede dormir si bolasComidas es igual a maxBolas. Mostrará en
pantalla “Tripa llena. ZZZZZZ” y rebajará bolasComidas a la mitad. Si no
cumple la condición para poder dormir mostrará en pantalla: “No quiero
dormir”.
En el método main de la clase GestionTragabolas hay que mostrar un menú con las
siguientes opciones:
1: Crear tragaBolas. (Sólo se puede crear un objeto, por tanto, esta opción sólo se
mostrará si no se ha creado ningún tragabolas).
2: Darle de comer.
3: Trotar
4: Hacerle dormir.
5: Ver estado.
0: Fin. 
 */
public class Main {

	public static void main(String[] args) {
		TragaBolas hipopotamoTragaBolas = null;
		String color;
		Integer maxBolas, option;
		Boolean booleano;
		do {
			option = Metodo.getIntBetween(0, 5, "Elige que quieres hacer:\n1. Crear tragabolas\n2. Darle de comer\n3. Trotar\n4. Hacerle dormir.\n5. Ver estado\n0. Salir");
			switch (option) {
			case 1:
				if (hipopotamoTragaBolas == null) {
					do {
						color = Metodo.getString("Elige un color de hipopótamo. Solo hay hipopótamos azules, amarillos, rojos o verdes");
					} while (color.compareToIgnoreCase("azul") != 0 && color.compareToIgnoreCase("amarillo") != 0 && color.compareToIgnoreCase("rojo") != 0 && color.compareToIgnoreCase("verde") != 0);
					maxBolas = Metodo.getIntPos("Introduce la cantidad de bolas");
					hipopotamoTragaBolas = new TragaBolas(color, maxBolas);
				} else System.out.println("Ya has creado un hipopótamo, no puedes crear más en esta partida.");
				break;
			case 2:
				if (hipopotamoTragaBolas != null) {
					booleano = hipopotamoTragaBolas.comer();
					if (booleano) {
						System.out.println("He comido una bola");
					} else {
						System.out.println("Ya estoy lleno");
					}
				} else {
					System.out.println("Aún no has creado ningun tratabolas");
				}
				break;
			case 3:
				if (hipopotamoTragaBolas != null) {
					booleano = hipopotamoTragaBolas.trotar();
					if (booleano) {
						System.out.println("Estoy trotando");
					} else {
						System.out.println("No tengo energias para trotar");
					}
				} else {
					System.out.println("Aún no has creado ningun tratabolas");
				}
				break;
			case 4:
				if (hipopotamoTragaBolas != null) {
					booleano = hipopotamoTragaBolas.dormir();
					if (booleano) {
						System.out.println("Tripa llena. ZZZZZZZ");
					} else {
						System.out.println("Aún tengo hambre");
					}
				} else {
					System.out.println("Aún no has creado ningun tratabolas");
				}
				break;
			case 5:
				if (hipopotamoTragaBolas != null) {
					System.out.println(hipopotamoTragaBolas);
				} else {
					System.out.println("Aún no has creado ningun tratabolas");
				}
				break;
			default:
				break;
			}
		} while (option != 0);
	}

}
