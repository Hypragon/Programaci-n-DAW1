package ejercicio;

import java.util.ArrayList;

public class Pila {
	ArrayList<Integer> pila;
	public Pila() {
		this.pila = new ArrayList<>();
	}
	
	public void push(Integer n) {
		pila.add(n);
	}
	public Integer pop() {
		return pila.remove(pila.size()-1);
	}
	public Integer size() {
		return pila.size();
	}
	public boolean isEmpty() {
		return pila.size() == 0;
	}
}
