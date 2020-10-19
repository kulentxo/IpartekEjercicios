package com.ipartek.ejercicios.excepciones;

import java.util.Scanner;

/**
 * Implemente un programa que lea un número ‘a’ y otro número ‘b’ y luego
 * calcule “a/b”.<br>
 * Pruebe a introducir b=0 y ver que hace el programa con la división por
 * cero.<br>
 * Pruebe a introducir b=”Carlos” para ver cómo se comporta el programa.<br>
 * Añada excepciones para recoger estas excepciones y avisar del problema al
 * usuario
 * 
 * 
 * @author kulen
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isCorrecto = true;
		int a, b;
		do {
			isCorrecto = true;
			try {
				System.out.println("Introduce un numero: ");
				a = Integer.parseInt(sc.nextLine());
				System.out.println("Introduce otro numero: ");
				b = Integer.parseInt(sc.nextLine());
				try {
					int resultado = a / b;
					System.out.println("El resultado de la division es " + resultado);
				} catch (Exception e) {
					System.out.println("No se puede dividir entre 0");
					isCorrecto = false;
				}
			} catch (Exception e) {
				System.out.println("Ha habido algun dato mal introducido, por favor introduce un numero");
				isCorrecto = false;
			}
		} while (isCorrecto == false);
		sc.close();
	}

}
