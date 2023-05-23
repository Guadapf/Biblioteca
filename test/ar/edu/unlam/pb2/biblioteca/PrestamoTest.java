package ar.edu.unlam.pb2.biblioteca;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrestamoTest {

	@Test
	public void queSePuedaAlquilarUnLibro() {
		Prestamo p1 = new Prestamo();
		Matematica m1 = new Matematica(014, "mate1", "mate");
		Estudiante e1 = new Estudiante(44141095, "Guadalupe", "Fernandez");
		
		assertTrue(p1.prestamoLibro(m1, e1));
	}
	
	@Test
	public void queSePuedaDevolverUnLibroDespuesDeAlquilarlo() {
		Prestamo p1 = new Prestamo();
		Matematica m1 = new Matematica(014, "mate1", "mate");
		Estudiante e1 = new Estudiante(44141095, "Guadalupe", "Fernandez");
		
		p1.prestamoLibro(m1, e1);
		
		assertTrue(p1.devolucionLibro(m1, e1));
	}
	
	@Test
	public void queSePuedanAlquilarDosLibrosSimultaneamente() {
		Prestamo p1 = new Prestamo();
		Matematica m1 = new Matematica(014, "mate1", "mate");
		Historia h1 = new Historia(013, "his1", "his");
		Estudiante e1 = new Estudiante(44141095, "Guadalupe", "Fernandez");
		
		assertTrue(p1.prestamoLibro(h1, e1));
		assertTrue(p1.prestamoLibro(m1, e1));
	}
	
	@Test
	public void queAlIntentarAlquilarUnTercerLibroNoSeaPosible() {
		Prestamo p1 = new Prestamo();
		Matematica m1 = new Matematica(014, "mate1", "mate");
		Historia h1 = new Historia(013, "his1", "his");
		Geografia g1 = new Geografia(012, "geo1", "geo");
		Estudiante e1 = new Estudiante(44141095, "Guadalupe", "Fernandez");
		
		assertTrue(p1.prestamoLibro(h1, e1));
		assertTrue(p1.prestamoLibro(m1, e1));
		assertFalse(p1.prestamoLibro(g1, e1));
	}
	
	@Test
	public void queAlIntentarAlquilarUnLibroYaPrestadoNoSePueda() {
		Prestamo p1 = new Prestamo();
		Matematica m1 = new Matematica(014, "mate1", "mate");
		Estudiante e1 = new Estudiante(44141095, "Guadalupe", "Fernandez");
		Estudiante e2 = new Estudiante(44141095, "Guadalupe", "Fernandez");
		
		assertTrue(p1.prestamoLibro(m1, e1));
		assertFalse(p1.prestamoLibro(m1, e2));
	}
	
	@Test
	public void queAlAlquilarDosLibrosYDevolverUnoSePuedaAlquilarOtro() {
		Prestamo p1 = new Prestamo();
		Matematica m1 = new Matematica(014, "mate1", "mate");
		Historia h1 = new Historia(013, "his1", "his");
		Geografia g1 = new Geografia(012, "geo1", "geo");
		Estudiante e1 = new Estudiante(44141095, "Guadalupe", "Fernandez");
		
		p1.prestamoLibro(g1, e1);
		p1.prestamoLibro(h1, e1);
		p1.devolucionLibro(g1, e1);
		
		assertTrue(p1.prestamoLibro(m1, e1));
	}
	
	@Test
	public void queSiUnAlumnoAlquilaUnLibroLuegoDeSerDevueltoPuedaHacerlo() {
		Prestamo p1 = new Prestamo();
		Matematica m1 = new Matematica(014, "mate1", "mate");
		Estudiante e1 = new Estudiante(44141095, "Guadalupe", "Fernandez");
		Estudiante e2 = new Estudiante(44141095, "Guadalupe", "Fernandez");
		
		p1.prestamoLibro(m1, e1);
		p1.devolucionLibro(m1, e1);
		
		assertTrue(p1.prestamoLibro(m1, e2));
	}
	

}
