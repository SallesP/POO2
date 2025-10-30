package EmpresaIng;

import java.util.ArrayList;
import java.util.List;

public class Proyecto implements Composite {

	protected List<Composite> hijos = new ArrayList<Composite>();
	
	
	
	public Proyecto() {
	}

	@Override
	public double costo() {
		double costo = 0;
		for (Composite c : hijos) {
			costo = costo + c.costo();
		}
		return costo * 1.20;
	}
	
	public void agregarHijo(Composite c) {
		hijos.add(c);
	}

	public void removerHijo(Composite c) {
		hijos.remove(c);
	}
	
	
}
