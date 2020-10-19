package com.ipartek.ejercicios.estructuras;

import java.util.Scanner;

/**
 * Realiza un programa que pida un numero por consola. En caso de que el numero
 * sea mayor que 50, o menor que 0, indicar que el numero introducido no es
 * valido
 * 
 * @author kulen
 *
 */
public class Ejercicio2 {
	static final int NUMERO_MAX = 50;
	static final int NUMERO_MIN = 0;
	static final int MAXIMO_ERRORES = 3;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero entre 50 y 0");
		int num = sc.nextInt();
		int intentos = 0;
		while (num < NUMERO_MAX && num > NUMERO_MIN) {
			intentos++;
			if (intentos > MAXIMO_ERRORES) {
				System.out.println("Aprende a leer");
			} else {
				System.out.println("El numero introducido no es valdio, introduce un numero entre 50 y 0");
			}
			System.out.println("Vuelve a introducir un numero");
			num = sc.nextInt();
		}
		System.out.println("El numero introducido es valido");
		sc.close();
	}
}
