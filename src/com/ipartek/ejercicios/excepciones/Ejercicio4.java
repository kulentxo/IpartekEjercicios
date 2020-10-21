package com.ipartek.ejercicios.excepciones;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.pojo.excepcionesEjercicio4Clase;

/**
 * Crea una clase Persona con los atributos nombre y edad. En el método setEdad
 * lanzar una excepción si la edad introducida es menor que 0 o mayor que
 * 120.<br>
 * Realiza un programa que al comienzo cree una lista de personas haciendo uso
 * del constructor vacío, y lea los datos por teclado y los asigne a los objetos
 * creados.<br>
 * Solo introducirá las personas en la lista si están en el rango de edad
 * indicado, comprobándolo mediante el uso de excepciones
 *
 */
public class Ejercicio4 {

	static final int MAX_ARRAY = 5;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char resp = 0;
		Boolean isError = false;

		ArrayList<excepcionesEjercicio4Clase> Personas = new ArrayList<>();

		do {

			excepcionesEjercicio4Clase persona = new excepcionesEjercicio4Clase();
			System.out.println("Introduce un nombre: ");
			persona.setNombre(sc.nextLine());

			try {

				isError = false;
				System.out.println("Introduce la edad de la persona: ");
				persona.setEdad(Integer.parseInt(sc.nextLine()));
				Personas.add(persona);
				System.out.println("Quieres introducir alguna otra persona?");
				resp = sc.nextLine().charAt(0);
			} catch (Exception e) {
				isError = true;
				System.out.println("Excepcion: " + e.getMessage());
			}

		} while (isError == true || Character.toUpperCase(resp) == 'S');

		System.out.println("Lista de personas: ");
		System.out.println("----------------------");

		for (excepcionesEjercicio4Clase p : Personas) {
			System.out.println("Nombre: " + p.getNombre() + " Edad: " + p.getEdad());
		}

		sc.close();
	}

}
