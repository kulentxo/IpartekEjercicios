package mf0227.uf2404.actividad3;

import java.util.Comparator;

public class Libro {

	private int id;
	private String nombre;
	private int numeroPaginas;

	public Libro() {
		super();
		id = 0;
		nombre = "";
		numeroPaginas = 0;
	}

	public Libro(int id, String nombre, int numeroPaginas) {
		this.id = id;
		this.nombre = nombre;
		this.numeroPaginas = numeroPaginas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", nombre=" + nombre + ", numeroPaginas=" + numeroPaginas + "]";
	}

	// Metodo para ordenar alfabeticamente los libros
	public static Comparator<Libro> LibNomComparator = new Comparator<Libro>() {

		public int compare(Libro l1, Libro l2) {
			String nombre1 = l1.getNombre().toUpperCase();
			String nombre2 = l2.getNombre().toUpperCase();

			return nombre1.compareTo(nombre2);

		}
	};

}
