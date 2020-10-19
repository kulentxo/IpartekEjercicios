package com.ipartek.ejercicios.estructurasRepetitivas;

/**
 * Mostrar con bucles for anidados las tablas de multiplicar del 0 al 10
 * 
 * @author kulen
 *
 */
public class Ejercicio2 {
	static final int NUM_MAX = 10;

	public static void main(String[] args) {
		for (int i = 0; i <= NUM_MAX; i++) {
			System.out.println("Tabla de multiplicacion con el numero " + i);
			for (int j = 0; j <= NUM_MAX; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}
	}

}
