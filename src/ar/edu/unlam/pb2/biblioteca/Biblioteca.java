package ar.edu.unlam.pb2.biblioteca;

import java.util.ArrayList;

public class Biblioteca {
	
	private ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();
	
	public Boolean registrarPrestamo(Prestamo prestamo) {
		return prestamos.add(prestamo);
	}
	
	public ArrayList<Prestamo> getPrestamosRegistrados(){
		return prestamos;
	}

}
