package com.ipartek;

/**
 * Es un ejercicio para aprender a declarar variables.
 * 
 * @author Julen Martin
 * @version 1.0
 */
public class Variables {
	/**
	 * Esto es un comentario para documentar en Javadoc. <br>
	 * Usamos el metodo main para poder ejecutar nuestro codigo.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		String nombre = "Julen";
		int edad = 22;
		float sueldo = 10000.00f;
		char sexo = 'f';
		boolean isCovidAffected = false;
		System.out.println("Hola " + nombre);
		System.out.println("Mi edad es " + edad);
		System.out.println("Mi sueldo es " + sueldo);

		if (isCovidAffected) {
			System.out.println("Cuarentena");
		} else {
			System.out.println("Eres libre");
		}

		switch (sexo) {
		case 'h':
			System.out.println("Eres hombre");
			break;

		case 'm':
			System.out.println("Eres mujer");
			break;

		default:
			System.out.println("Eres algo raro");
			break;
		}
	}

}
