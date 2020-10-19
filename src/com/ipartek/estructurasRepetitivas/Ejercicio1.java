package com.ipartek.estructurasRepetitivas;

/**
 * Realizar un ejercicio que nos muestre la tabla de multiplicar del 6
 * 
 * @author kulen
 *
 */
public class Ejercicio1 {
	static final int NUM_MULTIPLICAR = 6;
	static final int NUM_MAX = 10;

	public static void main(String[] args) {
		for (int i = 0; i <= NUM_MAX; i++) {
			System.out.printf("%d * %d = %d\n", NUM_MULTIPLICAR, i, NUM_MULTIPLICAR * i);
		}
	}

}
