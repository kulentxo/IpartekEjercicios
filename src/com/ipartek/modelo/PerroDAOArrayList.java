package com.ipartek.modelo;

import java.sql.SQLException;
import java.util.ArrayList;

import com.ipartek.pojo.Perro;

public class PerroDAOArrayList implements PerroDao {

	private ArrayList<Perro> lista = new ArrayList<>();
	private int indice = 0;
	private static PerroDAOArrayList INSTANCE = null;

	/**
	 * Inicializar el ArrayList para simular que existen perros.<br>
	 * En un futuro nos conectaremos a una bbdd
	 */

	private PerroDAOArrayList() {
		super();
		lista.add(new Perro(1, "Bubba", "Bulldog"));
		lista.add(new Perro(2, "Laika", "Beagle"));
		lista.add(new Perro(3, "Rintintin", "Husky"));
		lista.add(new Perro(4, "goffy", "Pastor Aleman"));
		indice = 5;
	}

	public static synchronized PerroDAOArrayList getInstance() {

		if (INSTANCE == null) {
			INSTANCE = new PerroDAOArrayList();
		}

		return INSTANCE;
	}

	@Override
	public ArrayList<Perro> listar() {

		return lista;
	}

	@Override
	public Perro recuperar(int id) {
		Perro p = null;

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) == lista.get(id)) {
				p = lista.get(id);
			}
		}
		return p;
	}

	@Override
	public Perro crear(Perro p) throws Exception {

		p.setId(indice);
		lista.add(p);
		indice++;

		return p;
	}

	@Override
	public Perro modificar(Perro p) throws Exception {
		int id = 0;
		boolean isEncontrado = false;
		for (int i = 0; i < lista.size(); i++) {
			if (p.getId() == lista.get(i).getId()) {
				lista.get(id).setNombre(p.getNombre());
				lista.get(id).setRaza(p.getRaza());
				isEncontrado = true;
				id = i;
			}
		}
		if (isEncontrado == false) {
			throw new Exception("No se a encontrado el perro");
		}

		return lista.get(id);
	}

	@Override
	public boolean eliminar(int id) throws Exception {
		int indice = 0;
		boolean isEncontrado = false;

		for (int i = 0; i < lista.size(); i++) {
			if (id == lista.get(i).getId()) {
				lista.remove(id);
				isEncontrado = true;
			}
		}
		return isEncontrado;
	}

	@Override
	public Perro vacunar(Perro p) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
