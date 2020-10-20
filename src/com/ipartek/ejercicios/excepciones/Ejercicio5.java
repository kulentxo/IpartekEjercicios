package com.ipartek.ejercicios.excepciones;

import com.ipartek.pojo.excepcionesEjercicio4Clase;

/**
 * Realizar un programa que lance un número aleatorio del 1 al 6.<br>
 * Según el número sacado, se lanzara una excepción u otra de la siguiente
 * lista:<br>
 * <ul>
 * <li>1: ArithmeticException
 * <li>2: NullpointerException
 * <li>3: NumberFormatException
 * <li>4: SecurityException
 * <li>5: NegativeArrayException
 * <li>6: IOException
 * </ul>
 * Haciendo uso del try y del catch, mostrar un mensaje por pantalla y explicar
 * cuál es la excepción ocurrida.<br>
 * Repetir este proceso de manera indefinida, controlando dichas excepciones y
 * sin dar pie a que el programa se cuelgue.
 * 
 * @author kulen
 *
 */
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
				Integer.parseInt(nombre);
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
