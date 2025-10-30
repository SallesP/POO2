package EmpresaIng;

public abstract class FormaDePago {

	protected int cuotas;
	
	public FormaDePago(int cuotas) {
        this.cuotas = cuotas;
    }
	
	public double monto(Material material) {
		return material.getPrecio() * material.getCantidad();
	};
}
