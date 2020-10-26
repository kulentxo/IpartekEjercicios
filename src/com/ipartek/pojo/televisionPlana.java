package com.ipartek.pojo;

public class televisionPlana extends Televisor {

	private String tipoPantalla;

	public televisionPlana(String nombre, float precio, float pulgadas) {
		super(nombre, precio, pulgadas);

	}

	public String getTipoPantalla() {
		return tipoPantalla;
	}

	public void setTipoPantalla(String tipoPantalla) {
		this.tipoPantalla = tipoPantalla;
	}

}
