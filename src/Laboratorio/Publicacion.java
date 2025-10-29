package Laboratorio;

import java.util.List;

public class Publicacion {

	public String titulo;
	public List<String> autores;
	public List<String> filiaciones;
	public String tipoArticulo;
	public String lugar;
	public List<String> palabrasClaves;
	
	
	public Publicacion(String titulo, List<String> autores, List<String> filiaciones, String tipoArticulo, String lugar,
			List<String> palabrasClaves) {
		this.titulo = titulo;
		this.autores = autores;
		this.filiaciones = filiaciones;
		this.tipoArticulo = tipoArticulo;
		this.lugar = lugar;
		this.palabrasClaves = palabrasClaves;
	}


	public String getTitulo() {
		return titulo;
	}


	public List<String> getAutores() {
		return autores;
	}


	public List<String> getFiliaciones() {
		return filiaciones;
	}


	public String getTipoArticulo() {
		return tipoArticulo;
	}


	public String getLugar() {
		return lugar;
	}


	public List<String> getPalabrasClaves() {
		return palabrasClaves;
	}
	
	
	
	
	
}
