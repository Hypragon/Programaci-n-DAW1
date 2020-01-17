package ejercicio;

public class Main {

	public static void main(String[] args) {
		int n;
		String nombre, titulo, departamento;
		double sueldo;
		Empleado empleados[];
		Jefe jefes[];
		n = Metodo.getIntPos("¿Cuántos empleados quieres crear?");
		empleados = new Empleado[n];
		for (int i = 0; i < n; i++) {
			nombre = Metodo.getString("Introduce el nombre del empleado");
			sueldo = Metodo.getDoublePos("Introduce el sueldo del empleado");
			empleados[i] = new Empleado(nombre, sueldo);
		}
		n = Metodo.getIntPos("¿Cuántos jefes quieres crear?");
		jefes = new Jefe[n];
		for (int i = 0; i < n; i++) {
			nombre = Metodo.getString("Introduce el nombre del jefe");
			sueldo = Metodo.getDoublePos("Introduce el sueldo del jefe");
			titulo = Metodo.getString("Introduce el titulo del jefe");
			departamento = Metodo.getString("Introduce el departamento del que es jefe");
			jefes[i] = new Jefe(nombre, sueldo, titulo, departamento);
		}
		for (int i = 0; i < empleados.length; i++) {
			System.out.println(empleados[i]);
		}
		for (int i = 0; i < jefes.length; i++) {
			System.out.println(jefes[i]);
		}
	}

}
