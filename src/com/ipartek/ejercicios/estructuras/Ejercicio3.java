package com.ipartek.ejercicios.estructuras;

import java.util.Scanner;

/**
 * Pedir por teclado al usuario que introduzca una distancia en cm Una vez
 * introducida, se solicitará que escoja a que unidad se van a convertir,
 * introduciendo la opción por teclado
 * <ul>
 * <li>A: convertir a metros</li>
 * <li>B: convertir a pulgadas</li>
 * <li>C: convertir a pies</li>
 * <li>D:convertir a yardas</li>
 * </ul>
 * 
 * @author kulen
 *
 */
public class Ejercicio3 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Introduce una distancia en cms:");
			int distancia = sc.nextInt();
			System.out.println(
					"Introduce A para convertir a metros, B para convertir a pulgadas, C para convertir a pies y D para convertir a yardas");

			char caracter = sc.next().charAt(0);

			switch (Character.toUpperCase(caracter)) {
			case 'A':
				System.out.println((float) (distancia / 100) + " metros");
				break;
			case 'B':
				System.out.println((float) (distancia / 2.54) + " pulgadas");
				break;
			case 'C':
				System.out.println((float) (distancia / 30.48) + "pies");
				break;
			default:
				System.out.println((float) (distancia / 91.44) + "yardas");
				break;
			}
		}
	}
}
