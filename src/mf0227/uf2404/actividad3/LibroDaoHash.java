package mf0227.uf2404.actividad3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LibroDaoHash implements LibroDao {
	private int indice = 0;
	private HashMap<Integer, Libro> hmLibros = new HashMap<Integer, Libro>();
	private static LibroDaoHash INSTANCE = null;

	private LibroDaoHash() {
		super();
		hmLibros.put(0, new Libro(0, "COSA", 32));
		hmLibros.put(1, new Libro(1, "SI", 22));
		hmLibros.put(2, new Libro(2, "NO", 12));
		indice = 3;

	}

	public static synchronized LibroDaoHash getInstance() {

		if (INSTANCE == null) {
			INSTANCE = new LibroDaoHash();
		}

		return INSTANCE;
	}

	@Override
	public List<Libro> getAll() {
		return new ArrayList<Libro>(hmLibros.values());
	}

	@Override
	public Libro getById(int id) {
		return hmLibros.get(id);
	}

	@Override
	public boolean delete(int id) {
		boolean isBorrado;

		hmLibros.remove(id);
		if (hmLibros.get(id) == null) {
			isBorrado = true;
		} else {
			isBorrado = false;
		}
		return isBorrado;
	}

	@Override
	public boolean insert(Libro l) {
		boolean isInsertado;

		l.setId(indice);
		hmLibros.put(indice, l);
		if (hmLibros.get(indice) != null) {
			isInsertado = true;
			indice++;
		} else {
			isInsertado = false;
		}

		return isInsertado;
	}

}
