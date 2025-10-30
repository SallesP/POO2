package EmpresaIng;

public class Operario {

	protected int cantHoras;
	protected double valorHora;
	protected int antiguedad;
	
	public double costo() {
		return (this.cantHoras * this.valorHora) * montoPorAntiguedad();
	}
	
	private double montoPorAntiguedad() {
		if (this.antiguedad > 5) {
			return 1.10;
		}
		else {
			return 1;
		}
	}
	
}
