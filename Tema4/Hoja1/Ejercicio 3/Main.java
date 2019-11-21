package t4h1e3;
/*
3) Dise�a la clase TragaBolas que tiene los siguientes atributos y m�todos:
TragaBolas
- color: String. Color del tragabolas. S�lo puede ser azul, amarillo, rojo o verde.
- bolasComidas: Integer. N�mero de bolas que ha comido hasta el momento.
- maxBolas: Integer. La cantidad m�xima de bolas que puede comer.
+ TragaBolas(String, Integer): Par�metros el color y maxBolas. Las bolasComidas se
inicializan a 0.
+ visualizar(): Muestra los datos del tragabolas por pantalla.
+ comer(): s�lo puede comer si bolasComidas es menor que maxBolas, esta acci�n
sumar� 1 a bolasComidas y mostrar� por pantalla "He comido una bola".
+ trotar(): s�lo puede trotar si bolasComidas es mayor o igual que 1, esta acci�n
restar� 1 de bolasComidas y mostrar� por pantalla "Estoy trotando".
+ dormir(): s�lo puede dormir si bolasComidas es igual a maxBolas. Mostrar� en
pantalla �Tripa llena. ZZZZZZ� y rebajar� bolasComidas a la mitad. Si no
cumple la condici�n para poder dormir mostrar� en pantalla: �No quiero
dormir�.
En el m�todo main de la clase GestionTragabolas hay que mostrar un men� con las
siguientes opciones:
1: Crear tragaBolas. (S�lo se puede crear un objeto, por tanto, esta opci�n s�lo se
mostrar� si no se ha creado ning�n tragabolas).
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
						color = Metodo.getString("Elige un color de hipop�tamo. Solo hay hipop�tamos azules, amarillos, rojos o verdes");
					} while (color.compareToIgnoreCase("azul") != 0 && color.compareToIgnoreCase("amarillo") != 0 && color.compareToIgnoreCase("rojo") != 0 && color.compareToIgnoreCase("verde") != 0);
					maxBolas = Metodo.getIntPos("Introduce la cantidad de bolas");
					hipopotamoTragaBolas = new TragaBolas(color, maxBolas);
				} else System.out.println("Ya has creado un hipop�tamo, no puedes crear m�s en esta partida.");
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
					System.out.println("A�n no has creado ningun tratabolas");
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
					System.out.println("A�n no has creado ningun tratabolas");
				}
				break;
			case 4:
				if (hipopotamoTragaBolas != null) {
					booleano = hipopotamoTragaBolas.dormir();
					if (booleano) {
						System.out.println("Tripa llena. ZZZZZZZ");
					} else {
						System.out.println("A�n tengo hambre");
					}
				} else {
					System.out.println("A�n no has creado ningun tratabolas");
				}
				break;
			case 5:
				if (hipopotamoTragaBolas != null) {
					System.out.println(hipopotamoTragaBolas);
				} else {
					System.out.println("A�n no has creado ningun tratabolas");
				}
				break;
			default:
				break;
			}
		} while (option != 0);
	}

}
