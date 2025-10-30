package EmpresaIng;

import java.util.ArrayList;
import java.util.List;

public class Obra implements Composite {

	protected FormaDePago formadepago;
	protected List<Material> materiales = new ArrayList<Material>();
	protected List<Operario> operarios = new ArrayList<Operario>();
	

	public Obra(FormaDePago formadepago, List<Material> materiales, List<Operario> operarios) {
		super();
		this.formadepago = formadepago;
		this.materiales = materiales;
		this.operarios = operarios;
	}

	@Override
	public double costo() {
		double costoMateriales = 0;
		double costoOperarios = 0;
		for (Material m : materiales) {
			costoMateriales = costoMateriales + this.formadepago.monto(m);
		}
		for (Operario o : this.operarios) {
			costoOperarios = costoOperarios + o.costo();
		}
		return costoMateriales + costoOperarios;
	}
	
	public void setFormaPago(FormaDePago formaDePago) {
		this.formadepago = formaDePago;
	}
	
	
}
