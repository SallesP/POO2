package Laboratorio;

import java.util.ArrayList;
import java.util.List;

public class Investigador implements Subject{

	public List<String> temasDeInvestigacion = new ArrayList<String>();
	
	
	
	
	public Investigador(List<String> temasDeInvestigacion) {
		super();
		this.temasDeInvestigacion = temasDeInvestigacion;
	}
	
	public void añadirTemaNuevo(String s) {
		temasDeInvestigacion.add(s);
	}

	public void update(Publicacion p) {
		if (this.esDeInteres(p)) {
			this.notificar(p);
		}
		
	}

	public void notificar(Publicacion p) {
		System.out.println("Nueva publicacion de interes: " + p.getTitulo());
	}
	
	public boolean esDeInteres(Publicacion p) {
		for (String t : temasDeInvestigacion) {
			if (p.getPalabrasClaves().contains(t)) {
				return true;
			}
		}
		return false;
	}
	

}
