package com.ipartek.pojo;

public class Televisor extends Electrodomestico {

	private float pulgadas;

	public Televisor(String nombre, float precio, float pulgadas) {
		super(nombre, precio);
		this.pulgadas = pulgadas;
	}

	public float getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(float pulgadas) {
		this.pulgadas = pulgadas;
	}

}
