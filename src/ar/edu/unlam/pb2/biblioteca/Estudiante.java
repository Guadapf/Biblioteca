package ar.edu.unlam.pb2.biblioteca;

import java.util.ArrayList;

public class Estudiante {
	
	private Integer dni;
	private String nombre;
	private String apellido;
	private ArrayList<Libro> libros = new ArrayList<Libro>();
	
	public Estudiante(Integer dni, String nombre, String apellido) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Integer getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}
	
	public Integer getCantidadLibros() {
		return this.libros.size();
	}
	
	public Boolean agregarLibro(Libro libro) {
		
		if(libros.size() < 2) {
			libro.setSePrestoElLibro(true);
			 return libros.add(libro);
		}
		return false;
	}
	
	public Boolean devolverLibro(Libro libro) {
		libro.setSePrestoElLibro(false);
		return libros.remove(libro);
	}

}
