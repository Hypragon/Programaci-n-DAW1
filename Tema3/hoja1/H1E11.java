package hoja1;

public class H1E11 {

	public static void main(String[] args) {
		String fraseParaRotar;
		fraseParaRotar = Metodo.getStringLim(20, "Introduce una frase para rotar");
		for (int contador = 0; contador < fraseParaRotar.length(); contador++) {
			fraseParaRotar = fraseParaRotar.substring(fraseParaRotar.length()-1) + fraseParaRotar.substring(0, fraseParaRotar.length()-1);
			System.out.println(fraseParaRotar);
		}
	}

}
