package ar.edu.unlam.pb2.biblioteca;

public class Historia extends Libro{

	public Historia(Integer codigo, String nombre, String autor) {
		super(codigo, nombre, autor);
		super.setFotografiable(true);
	}

}
