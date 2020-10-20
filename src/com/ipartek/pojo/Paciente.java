package com.ipartek.pojo;

public class Paciente {

	private int peso;
	private float altura;

	public Paciente() {
		super();
		this.peso = 0;
		this.altura = 0;
	}

	public Paciente(int peso, float altura) {
		this();
		this.peso = peso;
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

}
