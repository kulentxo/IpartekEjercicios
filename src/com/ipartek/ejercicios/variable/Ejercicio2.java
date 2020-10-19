package com.ipartek.ejercicios.variable;

/**
 * Realizar una pequeña calculadora. Para ello se crearan 10 variables de
 * distintos tipos numéricos. Una vez creadas dichas variables y asignadas desde
 * código valores (se recomienda valores entre -10 y 10) realizar las siguientes
 * operaciones:
 * <ul>
 * <li>La suma de todos los números</li>
 * <li>La resta de todos los números</li>
 * <li>La media de todos los números</li>
 * </ul>
 * 
 * @author kulen
 *
 */
public class Ejercicio2 {

	public static void main(String[] args) {

		int numero1 = 9;
		float numero2 = 5.5f;
		double numero3 = -3.2d;
		short numero4 = 4;
		long numero5 = -6;
		byte numero6 = 3;
		int numero7 = -4;
		float numero8 = -2.4f;
		double numero9 = 7.1d;
		short numero10 = 2;

		int suma = (int) (numero1 + numero2 + numero3 + numero4 + numero5 + numero6 + numero7 + numero8 + numero9
				+ numero10);
		int resta = (int) (numero1 - numero2 - numero3 - numero4 - numero5 - numero6 - numero7 - numero8 - numero9
				- numero10);
		float media = (float) (numero1 + numero2 + numero3 + numero4 + numero5 + numero6 + numero7 + numero8 + numero9
				+ numero10) / 10;

		System.out.println(suma);
		System.out.println(resta);
		System.out.println(media);

		media = 0;

		int temperaturaSemanal[] = { 4, 5, 6, 9, 12, 7, 8 };

		for (int i = 0; i < temperaturaSemanal.length; i++) {
			media += temperaturaSemanal[i];
		}
		media = media / temperaturaSemanal.length;
		System.out.printf("%.2f", media);

	}

}
