package com.ipartek.pojo;

public class fotocopiadora {

	private int numeroHojas;
	private int nivelTinta;
	private boolean isLaser;

	public fotocopiadora() {
		super();
		numeroHojas = 0;
		nivelTinta = 0;
		isLaser = false;
	}

	public int getNumeroHojas() {
		return numeroHojas;
	}

	public void setNumeroHojas(int numeroHojas) {
		this.numeroHojas = numeroHojas;
	}

	public int getNivelTinta() {
		return nivelTinta;
	}

	public void setNivelTinta(int nivelTinta) {
		this.nivelTinta = nivelTinta;
	}

	public boolean isLaser() {
		return isLaser;
	}

	public void setLaser(boolean isLaser) {
		this.isLaser = isLaser;
	}

}
