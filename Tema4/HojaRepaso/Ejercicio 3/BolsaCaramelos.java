package github;

public class BolsaCaramelos {
	private static Integer maxCaramelos = 10;
	private Sobre sobres[];
	public BolsaCaramelos() {
		super();
		this.sobres = new Sobre[maxCaramelos]; 
	}
	public void setSobres(Sobre[] sobres) {
		if (limite(sobres)) {
			int j = 0;
			for (int i = this.getCantidad(); i < sobres.length; i++) {
				this.sobres[i] = sobres[j];
				j++;
			}
		}
	}
	public void setSobres(Sobre sobre) {
		if (limite(sobre))this.sobres[this.getCantidad()] = sobre;
	}
	public Sobre[] getSobres(){
		return this.sobres;
	}
	public Integer getCantidad() {
		Integer cantidad = 0;
		for (int i = 0; i < this.sobres.length; i++) {
			if (this.sobres[i] != null) cantidad++;
		}
		return cantidad;
	}
	public static Integer getMaxCaramelos() {
		return maxCaramelos;
	}
	public Boolean limite(Sobre[] sobres) {
		if (this.getCantidad() + sobres.length > maxCaramelos) return false;
		else return true;
	}
	public Boolean limite(Sobre sobre) {
		if (this.getCantidad() + 1 > maxCaramelos) return false;
		else return true;
	}
	public Double getPrecio() {
		Double precio = 0.0;
		for (int i = 0; i < this.getCantidad(); i++) {
			precio += this.sobres[i].getPrecio();
		}
		precio += 0.5;
		return precio;
	}
	public String toString() {
		String str = "";
		for (int i = 0; i < this.sobres.length; i++) {
			if (this.sobres[i] !=  null) str += this.sobres[i] + "\n";
		}
		return str;
	}
}
