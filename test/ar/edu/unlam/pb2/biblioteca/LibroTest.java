package ar.edu.unlam.pb2.biblioteca;

import static org.junit.Assert.*;

import org.junit.Test;

public class LibroTest {

	@Test
	public void queSiElLibroEsDeGeografiaOHistoriaSePuedaFotocopiar() {
		Geografia g1 = new Geografia(012, "Geo1", "geo");
		Historia h1 = new Historia(013, "His1", "his");
		
		assertTrue(g1.getFotografiable());
		assertTrue(h1.getFotografiable());
	}
	
	@Test
	public void queSiElLibroEsDeMatematicaNoSePuedaFotocopiar() {
		Matematica m1 = new Matematica(014, "Mate1", "mate");
		
		assertFalse(m1.getFotografiable());
	}
	
	@Test
	public void queSiElLibroEsFotocopiableMuestreElTitulo() {
		Geografia g1 = new Geografia(012, "Geo1", "geo");
		
		String valorEsperado = "Geo1";
		String valorObtenido = g1.libroFotocopiable(g1);
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void queSiElLibroNoEsFotocopiableMuestreVacio() {
		Matematica m1 = new Matematica(014, "Mate1", "mate");
		
		String valorEsperado = "";
		String valorObtenido = m1.libroFotocopiable(m1);
		
		assertEquals(valorEsperado, valorObtenido);
	}

}
