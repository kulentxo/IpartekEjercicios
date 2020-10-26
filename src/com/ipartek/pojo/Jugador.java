package com.ipartek.pojo;

public class Jugador {

	private String nombre;
	private int dorsal;

	public Jugador() {
		super();
		this.nombre = "";
		this.dorsal = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

}
