package Laboratorio;

import java.util.ArrayList;
import java.util.List;

public class Articulo implements Observer {

	private List<Investigador> investigadores = new ArrayList<Investigador>();
	private List<Publicacion> publicaciones = new ArrayList<Publicacion>();
	
	
	public List<Investigador> getInvestigadores() {
		return investigadores;
	}
	
	public void setInvestigadores(List<Investigador> investigadores) {
		this.investigadores = investigadores;
	}
	
	public List<Publicacion> getPublicaciones() {
		return publicaciones;
	}
	
	public void agregarPublicacion(Publicacion p) {
		this.publicaciones.add(p);
		this.adviseListener(p);
	}
	
	@Override
	public void addListener(Investigador inv) {
		investigadores.add(inv);
	}
	@Override
	public void removeListener(Investigador inv) {
		investigadores.remove(inv);
	}
	
	@Override
	public void adviseListener(Publicacion p) {
		for (Investigador i : investigadores) {
			i.update(p);
		}
	}

	
}
