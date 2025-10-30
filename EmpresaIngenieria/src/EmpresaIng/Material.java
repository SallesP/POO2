package EmpresaIng;

public class Material {

	protected int cantidad;
	protected double precio;
	
	public Material(int cantidad, double precio) {
		super();
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public double getPrecio() {
		return precio;
	}
	
	
	
}
