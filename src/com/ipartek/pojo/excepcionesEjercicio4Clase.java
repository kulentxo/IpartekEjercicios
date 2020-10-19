package com.ipartek.pojo;

public class excepcionesEjercicio4Clase {
	private String nombre;
	private int edad;

	final static int EDAD_MAX = 120;
	final static int EDAD_MIN = 0;

	public excepcionesEjercicio4Clase() {
		super();
		this.nombre = "Sin nombre";
		this.edad = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) throws Exception {
		if (edad > EDAD_MAX || edad < EDAD_MIN) {
			throw new Exception("Introduce bien la edad");
		}
		this.edad = edad;
	}

}