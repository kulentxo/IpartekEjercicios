package com.ipartek.ejercicios.estructurasRepetitivas;

import java.util.Scanner;

/**
 * Realizar un programa que pida por teclado las notas de un alumno.<br>
 * Dichas notas se guardarán en formato entero, en un array de 8 posiciones,
 * totales.<br>
 * Se solicitará la nota del alumno, y se guardará en el array.<br>
 * Una vez introducida se preguntará si se desean introducir más notas.<br>
 * Si la respuesta es si, se continuara metiendo notas en el array Tener
 * cuidado, solo se podrán meter 8 notas.<br>
 * No se deberá dejar meter una novena
 * 
 * @author kulen
 *
 */
public class Ejercicio5 {
	static final int MAX_ARRAY = 8;

	public static void main(String[] args) {
		int[] arrNotas;
		arrNotas = new int[MAX_ARRAY];
		char resp = 0;
		boolean isCorrecto = false;
		int cuenta = 0;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				isCorrecto = true;
				System.out.println("Introduce una nota: ");
				arrNotas[cuenta] = Integer.parseInt(sc.nextLine());
				System.out.println("Escribe una S si quiere introducir otra nota.");
				resp = sc.nextLine().charAt(0);
				cuenta++;
			} catch (StringIndexOutOfBoundsException e) {
				System.out.println("Tienes que dar una respuesta si quiere o no introducir otra nota.");
			} catch (Exception e) {
				System.out.println("Error al introducir la nota");
				isCorrecto = false;
			}

		} while (isCorrecto == false || Character.toUpperCase(resp) == 'S' || cuenta == 8);
		sc.close();
	}

}
