package ar.edu.unlam.pb2.biblioteca;

public class Geografia extends Libro{
	

	public Geografia(Integer codigo, String nombre, String autor) {
		super(codigo, nombre, autor);
		super.setFotografiable(true);
	}

}
