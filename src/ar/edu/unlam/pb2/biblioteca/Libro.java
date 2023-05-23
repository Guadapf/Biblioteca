package ar.edu.unlam.pb2.biblioteca;

public class Libro {
	
	private Integer codigo;
	private String nombre;
	private String autor;
	private Boolean estaPrestado;
	private Boolean fotografiable;
	
	public Libro(Integer codigo, String nombre, String autor) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.autor = autor;
		this.estaPrestado = false;
	}
	
	protected String getNombre() {
		return this.nombre;
	}
	protected Boolean getSePrestoElLibro() {
		 return this.estaPrestado;
	}
	
	protected void setSePrestoElLibro(Boolean presto) {
		this.estaPrestado = presto;
	}
	
	protected void setFotografiable(Boolean fotografiable) {
		this.fotografiable = fotografiable;
	}
	
	protected Boolean getFotografiable() {
		return this.fotografiable;
	}
	
	protected String libroFotocopiable(Libro libro) {
		
		if(libro.getFotografiable()) {
			return libro.getNombre();
		}
		return "";
	}
	
}
