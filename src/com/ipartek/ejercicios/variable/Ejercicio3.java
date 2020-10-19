package com.ipartek.ejercicios.variable;

/**
 * Realizar un programa que tenga 2 variables enteras, dividendo y divisor.
 * Meterle valores enteros y positivos. Realizar la operación división y mostrar
 * el resultado en pantalla Repetir el mismo código con estas variaciones:
 * entero y real, real y entero, real y real Por ultimo, intentar dividir en los
 * cuatro casos anteriores entre 0 y mostrar el resultado en pantalla
 *
 * @author kulen
 *
 */
public class Ejercicio3 {

	public static void main(String[] args) {

		int numero1 = 9;
		int numero2 = 3;
		float numero3 = 2.5f;
		float numero4 = 9.5f;

		int division1 = numero1 / numero2;
		float division2 = numero1 / numero3;
		float division3 = numero3 / numero1;
		float division4 = numero3 / numero4;

		System.out.println(division1);
		System.out.println(division2);
		System.out.println(division3);
		System.out.println(division4);

		try {
			System.out.println(division1 / 0);
			System.out.println(division2 / 0);
			System.out.println(division3 / 0);
			System.out.println(division4 / 0);

		} catch (Exception e) {
			System.out.println("No se puede realizar la divison");
		}

	}

}
