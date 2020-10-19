package com.ipartek.ejercicios.estructuras;

import java.util.Scanner;

/**
 * Mostrar al usuario el siguiente menú: Por favor escoja una opción:
 * <ul>
 * <li>A: calcular área de un triangulo</li>
 * <li>B: calcular el área de un cuadrado</li>
 * <li>C: calcular el área de un circulo</li>
 * <li>D: calcular el área de un pentágono</li>
 * </ul>
 * Realizad las operaciones adecuadas indicadas en cada categoría.<br>
 * En caso de que no se escoja una opción adecuada, se mostrara un mensaje de
 * error.<br>
 * No deberá realizarse este menú en bucle
 * 
 * @author kulen
 *
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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
		}
		sc.close();
	}

}
