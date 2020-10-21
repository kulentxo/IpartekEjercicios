package com.ipartek.apps;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.pojo.Perro;

public class AppPerros {

	// Constantes
	final static String OPC_CREAR = "2";
	final static String OPC_LISTA = "1";
	final static String OPC_BAJA = "3";
	final static String OPC_SALIR = "s";
	// variables globales para esta Clase
	static Scanner sc = null;
	static ArrayList<Perro> lista = new ArrayList<Perro>();
	static String opcion = ""; // opcion seleccionada en el menu por el usuario

	public static void main(String[] args) {

		System.out.println("***********  APP  PERRERA   **************");
		sc = new Scanner(System.in);

		incializarDatos();

		do {

			pintarMenu();

			switch (opcion) {
			case OPC_LISTA:
				listar();
				break;
			case OPC_CREAR:
				crear();
				break;
			case OPC_BAJA:
				baja();
				break;
			default:
				break;
			}

		} while (!(OPC_SALIR.equalsIgnoreCase(opcion)));

		System.out.println("***********  ADIOS, nos vemos pronto   **************");
		sc.close();

	}// main

	private static void baja() {

		Perro p1 = null;

		System.out.println("************DAR DE BAJA************");
		try {
			System.out.println("Introduce el nombre del perro que quieras dar de baja: ");
			String nom = sc.nextLine();

			if (nom.equals("")) {
				throw new Exception("Tienes que introducir el nombre.");
			} else {

				for (Perro perro : lista) {
					if (nom.toUpperCase().equals((perro.getNombre()).toUpperCase())) {
						p1 = perro;
					}
				}
			}

		} catch (Exception e) {
			System.out.println("Excepcion: " + e.getMessage());
		}

		lista.remove(p1);

	}

	private static void crear() {

		System.out.println("************CREAR PERRO************");
		try {
			System.out.println("Introduce nombre del perro: ");
			String nombre = sc.nextLine();
			System.out.println("Introduce la raza del perro: ");
			String raza = sc.nextLine();

			if (nombre.equals("") || raza.equals("")) {
				throw new Exception("Tienes que introducir el nombre y la raza");
			} else {
				lista.add(new Perro(nombre, raza));
			}

		} catch (Exception e) {
			System.out.println("Excepcion : " + e.getMessage());
		}

	}

	private static void listar() {

		System.out.println("************LISTA DE LOS PERROS************");
		for (Perro perro : lista) {
			System.out.println(String.format("%-15s [%s]", perro.getNombre(), perro.getRaza()));
		}

	}

	/**
	 * Inicializar el ArrayList para simular que existen perros.<br>
	 * En un futuro nos conectaremos a una bbdd
	 */
	private static void incializarDatos() {

		lista.add(new Perro("Bubba", "Bulldog"));
		lista.add(new Perro("Laika", "Beagle"));
		lista.add(new Perro("Rintintin", "Husky"));
		lista.add(new Perro("goffy", "Pastor Aleman"));

	}

	/**
	 * Se encraga de pintar las pociones del menu.<br>
	 * Fijaros que no aparece {@code @return} porque no retorna nada {@code void}
	 * 
	 */
	private static void pintarMenu() {

		System.out.println("************************************");
		System.out.println(" 1.- Listar todos los perros");
		System.out.println(" 2.- Crear un perro");
		System.out.println(" 3.- Dar de baja un Perro");
		System.out.println(" etc etc ...");
		System.out.println(" ");
		System.out.println(" S - Salir");
		System.out.println("************************************");

		System.out.println("\n Selecciona una opcion del menu:");

		opcion = sc.nextLine();

	}

}// AppPerrera