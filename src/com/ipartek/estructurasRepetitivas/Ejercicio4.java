package com.ipartek.estructurasRepetitivas;

import java.util.Scanner;

/**
 * Realizar la modificación pertinente al ejercicio 4 para que una vez que el
 * usuario haya escogido una de las opciones y muestre la operación, desea
 * continuar?<br>
 * Si escoje la opción si volverá a mostrar el menú, si escoge no, saldrá de la
 * ejecución del programa
 * 
 * @author kulen
 *
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		char resp;
		try (Scanner sc = new Scanner(System.in)) {
			do {

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
					System.out.println((float) (distancia / 30.48) + " pies");
					break;
				case 'D':
					System.out.println((float) (distancia / 91.44) + " yardas");
					break;
				default:
					System.out.println("Esa opcion no existe");
					break;
				}// switch
				System.out.println("Escribe una S si desea continuar");
				resp = sc.next().charAt(0);

			} while (Character.toUpperCase(resp) == 'S');
		}
	}

}
