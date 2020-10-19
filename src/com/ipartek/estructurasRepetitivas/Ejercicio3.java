package com.ipartek.estructurasRepetitivas;

import java.util.Scanner;

/**
 * Realizar el siguiente men�: Introduzca una opci�n:
 * <ul>
 * <li>A. Calcular el �rea de un cuadrado</li>
 * <li>B. Calcular el �rea de un tri�ngulo equil�tero</li>
 * <li>C. Calcular el per�metro de un circulo</li>
 * <li>D. Calcular el �rea de un circulo</li>
 * </ul>
 * Hacer que se repita este men� de manera indefinida
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
					System.out.println("Altura por la base para calcular la �rea");
					break;
				case 'B':
					System.out.println("Al ser todos los lados iguales escoger un lado y calcular su cuadrado");
					break;
				case 'C':
					System.out.println("El �rea de un c�rculo es pi multiplicado por el radio al cuadrado");
				case 'D':
					System.out.println("El �rea del pentagono es el perimetro por el apotema divido entre 2");
					break;
				default:
					System.out.println("No existe esa opcion");
					break;
				}// switch

			} while (true);
		}
	}

}
