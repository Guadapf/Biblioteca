package ar.edu.unlam.pb2.biblioteca;

import java.util.ArrayList;
import java.util.LinkedList;

public class Prestamo {
	
	private Integer id = 0;
	private ArrayList<Libro> librosPrestados = new ArrayList<Libro>();
	private LinkedList<Estudiante> alumnos = new LinkedList<Estudiante>();
	
	public Prestamo() {
		this.id++;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public Boolean prestamoLibro(Libro libro, Estudiante estudiante) {
		
		if(libro.getSePrestoElLibro() == false && estudiante.getCantidadLibros() < 2) {
			this.librosPrestados.add(libro);
			estudiante.agregarLibro(libro);
			return true;
		}
		return false;
	}
	
	public Boolean devolucionLibro(Libro libro, Estudiante estudiante) {
		if(librosPrestados.contains(libro)) {
			librosPrestados.remove(libro);
			estudiante.devolverLibro(libro);
			return true;
		}
		return false;
	}
}
