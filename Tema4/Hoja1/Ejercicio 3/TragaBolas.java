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
