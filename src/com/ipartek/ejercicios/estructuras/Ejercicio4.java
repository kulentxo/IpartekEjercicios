package com.ipartek.ejercicios.estructuras;

import java.util.Scanner;

/**
 * Mostrar al usuario el siguiente men�: Por favor escoja una opci�n:
 * <ul>
 * <li>A: calcular �rea de un triangulo</li>
 * <li>B: calcular el �rea de un cuadrado</li>
 * <li>C: calcular el �rea de un circulo</li>
 * <li>D: calcular el �rea de un pent�gono</li>
 * </ul>
 * Realizad las operaciones adecuadas indicadas en cada categor�a.<br>
 * En caso de que no se escoja una opci�n adecuada, se mostrara un mensaje de
 * error.<br>
 * No deber� realizarse este men� en bucle
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
		}
		sc.close();
	}

}
