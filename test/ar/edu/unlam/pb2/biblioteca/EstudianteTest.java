package ar.edu.unlam.pb2.biblioteca;

import static org.junit.Assert.*;

import org.junit.Test;

public class EstudianteTest {

	@Test
	public void queSePuedaAgregarUnLibro() {
		Estudiante e1 = new Estudiante(44141095, "Guadalupe", "Fernandez");
		Libro l1 = new Libro(012, "Los 7 maridos de Evelyn Hugo", "Taylor Jenkins Reid");
		
		assertTrue(e1.agregarLibro(l1));
	}
	
	@Test
	public void queNoSePuedanAgregarMasDeDosLibros() {
		Estudiante e1 = new Estudiante(44141095, "Guadalupe", "Fernandez");
		Libro l1 = new Libro(012, "Los 7 maridos de Evelyn Hugo", "Taylor Jenkins Reid");
		Libro l2 = new Libro(012, "Los 7 maridos de Evelyn Hugo", "Taylor Jenkins Reid");
		Libro l3 = new Libro(012, "Los 7 maridos de Evelyn Hugo", "Taylor Jenkins Reid");
		
		assertTrue(e1.agregarLibro(l1));
		assertTrue(e1.agregarLibro(l2));
		assertFalse(e1.agregarLibro(l3));
	}

}
