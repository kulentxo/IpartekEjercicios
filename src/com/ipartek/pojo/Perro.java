package com.ipartek.pojo;

public class Perro {

	private String nombre;
	private String raza;
	private float peso;
	private boolean isVacunado;
	private String historia;

	public Perro() {
		super();
		this.nombre = nombre;
		this.raza = "cruce";
		this.peso = 0f;
		this.isVacunado = false;
		this.historia = historia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		if (peso < 0) {
			peso = 0;
		} else {
			this.peso = peso;
		}

	}

	public boolean isVacunado() {
		return isVacunado;
	}

	public void setVacunado(boolean isVacunado) {
		this.isVacunado = isVacunado;
	}

	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

}
