package com.ipartek.modelo;

import java.util.ArrayList;

import com.ipartek.pojo.Perro;

public class PerroDAOArrayList implements PerroDao {

	private ArrayList<Perro> lista = new ArrayList<>();

	/**
	 * Inicializar el ArrayList para simular que existen perros.<br>
	 * En un futuro nos conectaremos a una bbdd
	 */
	@Override
	public ArrayList<Perro> listar() {

		if (lista != null && lista.isEmpty()) {
			lista.add(new Perro("Bubba", "Bulldog"));
			lista.add(new Perro("Laika", "Beagle"));
			lista.add(new Perro("Rintintin", "Husky"));
			lista.add(new Perro("goffy", "Pastor Aleman"));
		}
		return lista;
	}

	@Override
	public Perro recuperar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Perro crear(Perro p) throws Exception {
		int ultimoId = 0;
		boolean isEncontrado = false;
		for (int i = 0; i < lista.size(); i++) {
			if (p.getNombre() == lista.get(i).getNombre()) {
				isEncontrado = true;
			}
			ultimoId = lista.get(i).getId();
		}
		if (isEncontrado != true) {
			throw new Exception("No se a encontrado el perro con ese nombre.");
		}
		p.setId(ultimoId + 1);
		lista.add(p);
		return p;
	}

	@Override
	public Perro modificar(Perro p) throws Exception {
		int id = 0;
		boolean isEncontrado = false;
		for (int i = 0; i < lista.size(); i++) {
			if (p.getNombre() == lista.get(i).getNombre()) {
				isEncontrado = true;
				id = i;
			}
		}
		if (isEncontrado == true) {
			throw new Exception("El nombre del perro ya existe.");
		}

		lista.get(id).setNombre(p.getNombre());
		lista.get(id).setRaza(p.getRaza());
		return lista.get(id);
	}

	@Override
	public boolean eliminar(int id) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
