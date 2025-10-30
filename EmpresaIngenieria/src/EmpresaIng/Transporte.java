package EmpresaIng;

public class Transporte implements Composite {

	public int distancia;
	public double peso;
	public double precio;
	
	
	public double costo() {
		return this.distancia * this.peso * this.precio;
	}
	
}
