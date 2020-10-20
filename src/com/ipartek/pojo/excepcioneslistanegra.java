package com.ipartek.pojo;

public class excepcioneslistanegra extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	int codigoError;

	public excepcioneslistanegra() {
		super();
		this.codigoError = 0;
	}

	public void getMessage(int codigoError) {
		switch (codigoError) {
		case 1:
			System.out.println("Persona demasiado baja (altura menor de 1.60m)");
			break;
		case 2:
			System.out.println("Persona demasiado alta (altura mayor de 2.10m)");
			break;
		case 3:
			System.out.println("Persona en exceso delgada (peso inferior a 35kg)");
			break;
		case 4:
			System.out.println("Persona en exceso obesa (peso superior a 160kg)");
			break;
		default:
			System.out.println("Persona con los pies planos");
			break;
		}

	}
}
