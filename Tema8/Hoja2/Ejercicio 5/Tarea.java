package ejercicio;

public class Tarea {
	private int minutos;
	public Tarea(int minutos) {
		this.minutos = minutos;
	}
	public void tiempo() {
		this.minutos--;
	}
	public int getMinutos() {
		return minutos;
	}
}
