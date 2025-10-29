package Laboratorio;

public interface Observer {

	void addListener(Investigador inv);
	void removeListener(Investigador inv);
	void adviseListener(Publicacion p);
	
}
