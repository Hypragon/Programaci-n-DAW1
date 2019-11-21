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
public class TragaBolas {
	private String color;
	private Integer bolasComidas;
	private Integer maxBolas;
	public TragaBolas(String color, Integer maxBolas) {
		super();
		this.color = color;
		this.bolasComidas = 0;
		this.maxBolas = maxBolas;
	}
	public String toString() {
		return "[" + color + ", " + bolasComidas + ", " + maxBolas + "]";
	}
	public Boolean comer() {
		Boolean comido;
		if (bolasComidas < maxBolas) {
			bolasComidas++;
			comido = true;
		} else {
			comido = false;
		}
		return comido;
	}
	public Boolean trotar() {
		Boolean trotado;
		if (bolasComidas > 0) {
			trotado = true;
			bolasComidas--;
		}
		else {
			trotado = false;
		}
		return trotado;
	}
	public Boolean dormir() {
		Boolean dormido;
		if (bolasComidas == maxBolas) {
			dormido = true;
			bolasComidas /= 2;
		} else {
			dormido = false;
		}
		return dormido;
	}
}
