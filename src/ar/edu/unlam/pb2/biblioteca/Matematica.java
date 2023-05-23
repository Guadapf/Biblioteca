package ar.edu.unlam.pb2.biblioteca;

public class Matematica extends Libro{

	public Matematica(Integer codigo, String nombre, String autor) {
		super(codigo, nombre, autor);
		super.setFotografiable(false);
	}

}
