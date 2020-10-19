package com.ipartek.ejercicios.excepciones;

import java.util.Scanner;

import com.ipartek.pojo.excepcionesEjercicio4Clase;

public class Ejercicio4 {

	static final int MAX_ARRAY = 5;

	public static void main(String[] args) throws NumberFormatException, Exception {
		Scanner sc = new Scanner(System.in);
		int cuenta = 0;
		char resp = 0;
		Boolean isError = false;
		String arrPersonas[];
		arrPersonas = new String[MAX_ARRAY];
		excepcionesEjercicio4Clase persona = new excepcionesEjercicio4Clase();
		do {
			System.out.println("Introduce un nombre: ");
			persona.setNombre(sc.nextLine());
			try {
				isError = false;
				System.out.println("Introduce la edad de la persona: ");
				persona.setEdad(Integer.parseInt(sc.nextLine()));
				arrPersonas[cuenta] = persona.getNombre();
				cuenta++;
				System.out.println("Quieres introducir alguna otra persona?");
				resp = sc.nextLine().charAt(0);
			} catch (Exception e) {
				isError = true;
				System.out.println("Excepcion: " + e.getMessage());
			}
		} while (isError == true || resp == 'S');

		System.out.println("Lista de personas: ");
		System.out.println("----------------------");
		for (int i = 0; i < arrPersonas.length; i++) {
			if (arrPersonas[i] != null)
				System.out.println(arrPersonas[i]);
		}
		sc.close();
	}

}
