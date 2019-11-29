package github;

public class Main {

	public static void main(String[] args) {
		Caramelo caramelo = new Caramelo("menta", 1.00);
		Sobre sobre = new Sobre("verde", caramelo);
		System.out.println(caramelo);
		System.out.println(sobre);

	}

}
