package com.ipartek.ejercicios.excepciones;

import com.ipartek.pojo.excepcionesEjercicio4Clase;

public class Ejercicio5 {

	final static int LIMITE_RAND = 6;

	public static void main(String[] args) {

		int numero = (int) (Math.random() * LIMITE_RAND) + 1;

		switch (numero) {
		case 1:
			// ArithmeticException
			try {
				System.out.println(5 / 0);
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			break;

		case 2:
			// NullpointerException
			try {
				excepcionesEjercicio4Clase e = initT();
				e.foo("Hola");
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			break;

		case 3:
			// NumberFormatException
			try {
				String nombre = "pepe";
				int num = Integer.parseInt(nombre);
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			break;

		case 4:
			// SecurityException
			System.out.println("Por ejemplo si se utiliza el nombre del paquete con java.util saltara este error.");
			break;
		case 5:
			// NegativeArrayException
			try {
				int[] arr = new int[-10];
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			break;

		default:
			// IOException
			System.out.println("Este error tiene que ver con la lectura o escritura de ficheros.");
			break;
		}
	}

	private static excepcionesEjercicio4Clase initT() {
		return null;
	}

}
