package com.ipartek.Listas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Crear una lista de nombres de alumnos, donde se guardaran con strings.<br>
 * Insertar diez nombres de alumnos en la lista<br>
 * Mostrar los diez nombres recorriendo la lista con un foreach
 * 
 * @author kulen
 *
 */
public class Ejercicio1 {
	static final int MAX_ARRAY = 10;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> alumnos = new ArrayList<>();

		for (int i = 0; i < MAX_ARRAY; i++) {
			System.out.println("Introduce nombre de un alumno: ");
			alumnos.add(sc.nextLine());
		}

		for (String nom : alumnos) {
			System.out.println(nom);
		}

		sc.close();
	}

}
