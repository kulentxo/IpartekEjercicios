package com.ipartek.Actividades;

import java.util.Scanner;

/**
 * Realizar un programa en java que realice la siguiente función:<br>
 * Crear un array de 5 notas que almacenara en formato double.<br>
 * Una vez creado dicho array se rellenaran dichos elementos leyéndolo desde el
 * teclado.<br>
 * Una vez creado el contenido, se calculara la media de las notas así como se
 * mostraran las notas más altas y más bajas de dicho array.
 * 
 * @author Julen Martin
 * @version 1.0
 */
public class Actividad1EjercicioA {

	// Globales
	final static int MAX_ARRAY = 5;
	final static int MAX_NOTAS = 10;
	final static int MIN_NOTAS = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double media = 0;
		double min = 11;
		double max = -1;
		double[] arrNotas = new double[MAX_ARRAY];
		boolean isError = false;

		for (int i = 0; i < arrNotas.length; i++) {

			do {
				try {
					isError = false;
					System.out.println("Introduce una nota: ");
					arrNotas[i] = Double.parseDouble(sc.nextLine());
					if (arrNotas[i] > MAX_NOTAS || arrNotas[i] < MIN_NOTAS) {
						throw new Exception("Tienes que introducir una nota entre 0 y 10");
					}
				} catch (NumberFormatException e) {
					System.out.println("Introduce una nota correcta.");

				} catch (Exception e) {
					isError = true;
					System.out.println("Excepcion: " + e.getMessage());

				}
			} while (isError == true);

			media += arrNotas[i];

			if (arrNotas[i] < min) {
				min = arrNotas[i];

			} else if (arrNotas[i] > max) {
				max = arrNotas[i];

			}
		}
		sc.close();

		System.out.println("Estas son las notas introducidas.");

		for (int i = 0; i < arrNotas.length; i++) {
			System.out.println(arrNotas[i]);
		}

		media = media / MAX_ARRAY;

		System.out.printf("La media de las notas es: %.2f, la nota mas alta es: %.2f y la nota mas baja es: %.2f",
				media, max, min);

	}

}
