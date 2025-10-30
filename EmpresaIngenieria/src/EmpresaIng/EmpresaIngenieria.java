package EmpresaIng;

import java.util.List;

public class EmpresaIngenieria {

	protected String razonSocial;
	protected long cuit;
	protected Proyecto proyecto;
	
	
	public EmpresaIngenieria(String razonSocial, long cuit, Proyecto proyecto, List<Proyecto> proyectos) {
		super();
		this.razonSocial = razonSocial;
		this.cuit = cuit;
		this.proyecto = proyecto;
	}
	
	public double costoProyecto() {
		return this.proyecto.costo();
	}
	
	
	
}
