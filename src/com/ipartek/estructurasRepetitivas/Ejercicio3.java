package com.ipartek.estructurasRepetitivas;

import java.util.Scanner;

/**
 * Realizar el siguiente menú: Introduzca una opción:
 * <ul>
 * <li>A. Calcular el área de un cuadrado</li>
 * <li>B. Calcular el área de un triángulo equilátero</li>
 * <li>C. Calcular el perímetro de un circulo</li>
 * <li>D. Calcular el área de un circulo</li>
 * </ul>
 * Hacer que se repita este menú de manera indefinida
 * 
 * @author kulen
 *
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			do {
				System.out.println(
						"Por favor escoja una opcion:\nA: calcular area de un triangulo \nB: calcular el area de un cuadrado\nC: calcular el area de un circulo\nD: calcular el are de un pentagono");
				char resp = sc.next().charAt(0);
				switch (Character.toUpperCase(resp)) {
				case 'A':
					System.out.println("Altura por la base para calcular la área");
					break;
				case 'B':
					System.out.println("Al ser todos los lados iguales escoger un lado y calcular su cuadrado");
					break;
				case 'C':
					System.out.println("El área de un círculo es pi multiplicado por el radio al cuadrado");
				case 'D':
					System.out.println("El área del pentagono es el perimetro por el apotema divido entre 2");
					break;
				default:
					System.out.println("No existe esa opcion");
					break;
				}// switch

			} while (true);
		}
	}

}
