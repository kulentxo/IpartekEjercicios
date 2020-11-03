package com.ipartek.apps;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.modelo.PerroDAOBBDD;
import com.ipartek.pojo.Perro;

public class AppPerros {

	// Constantes
	final static String OPC_CREAR = "2";
	final static String OPC_LISTA = "1";
	final static String OPC_BAJA = "3";
	final static String OPC_ACTUALIZAR = "4";
	final static String OPC_VACUNAR = "5";
	final static String OPC_SALIR = "s";
	// variables globales para esta Clase
	static Scanner sc = null;
	static String opcion = ""; // opcion seleccionada en el menu por el usuario
	static private PerroDAOBBDD modelo = PerroDAOBBDD.getInstance();

	public static void main(String[] args) throws Exception {

		System.out.println("***********  APP  PERRERA   **************");
		sc = new Scanner(System.in);

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
			case OPC_ACTUALIZAR:
				actualizar();
				break;
			case OPC_VACUNAR:
				vacunar();
				break;
			default:
				break;
			}

		} while (!(OPC_SALIR.equalsIgnoreCase(opcion)));

		System.out.println("***********  ADIOS, nos vemos pronto   **************");
		sc.close();

	}// main

	private static void vacunar() throws SQLException {
		ArrayList<Perro> lista = modelo.listar();
		String nom = "";
		boolean isEncontrado = false;

		System.out.println("**************VACUNAR*************");
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).isVacunado()) {
				System.out.println(lista.get(i).getNombre() + " esta vacunado.");
			} else {
				System.out.println(lista.get(i).getNombre() + " no esta vacunado.");
			}
		}
		do {
			System.out.println("Que perro quieres vacunar?");
			nom = sc.nextLine();
			for (int i = 0; i < lista.size(); i++) {
				if (lista.get(i).getNombre().equalsIgnoreCase(nom)) {
					modelo.vacunar(new Perro(lista.get(i).getId(), true));
					isEncontrado = true;
				}
			}
			if (isEncontrado == false) {
				System.out.println("El perro introducido no existe");
			}
		} while (isEncontrado != true);
		System.out.println(String.format("***************%s a sido vacunado***************", nom));
	}

	private static void actualizar() throws Exception {
		ArrayList<Perro> lista = modelo.listar();
		String nomNuevo = "";
		String razaNueva = "";
		int id = 0;
		System.out.println("************ACTUALIZAR DATOS*************");
		System.out.println("Introduce el nombre del perro que quieras actualizar: ");
		String nom = sc.nextLine();
		for (Perro perro : lista) {
			try {
				if (nom.equalsIgnoreCase(perro.getNombre())) {
					id = perro.getId();
					System.out.println("Quieres cambiarle el nombre?");
					String resp = sc.nextLine();
					if (resp.equalsIgnoreCase("SI") || resp.equalsIgnoreCase("SÍ")) {
						System.out.println("Introduce el nombre del perro: ");
						nomNuevo = sc.nextLine();
					}
					System.out.println("Quieres cambiarle la raza?");
					resp = sc.nextLine();
					if (resp.equalsIgnoreCase("SI") || resp.equalsIgnoreCase("SÍ")) {
						System.out.println("Introduce la raza del perro: ");
						razaNueva = sc.nextLine();
					} else {
						razaNueva = perro.getRaza();
					}
				}
			} catch (Exception e) {
				System.out.println("Ha ocurrido un problema.");
			}
		} // for
		modelo.modificar(new Perro(id, nomNuevo, razaNueva));
		System.out.println("*******DATOS ACTUALIZADOS********");

	}

	private static void baja() throws Exception {
		ArrayList<Perro> lista = modelo.listar();
		int id = 0;
		boolean isEncontrado = false;
		String nombre;
		Perro p;

		System.out.println("************DAR DE BAJA************");
		try {
			do {
				System.out.println("Introduce el id del perro que quieres dar de baja: ");
				id = Integer.parseInt(sc.nextLine());

				p = modelo.recuperar(id);
				if (p == null) {
					System.out.println("El perro no existe");
				} else {
					isEncontrado = true;
				}
			} while (!isEncontrado);

			do {
				System.out.println("Si quieres eliminar a " + p.getNombre() + " introduce su nombre");
				nombre = sc.nextLine();
			} while (!nombre.equals(p.getNombre()));

			modelo.eliminar(id);

		} catch (

		Exception e) {
			System.out.println("Excepcion: " + e.getMessage());
		}

	}

	private static void crear() throws SQLException {
		modelo.listar();
		System.out.println("************CREAR PERRO************");
		try {
			System.out.println("Introduce nombre del perro: ");
			String nombre = sc.nextLine();
			System.out.println("Introduce la raza del perro: ");
			String raza = sc.nextLine();
			if (raza.equals("")) {
				raza = "cruce";
			}
			System.out.println("Introduce el peso del perro: ");
			float peso = Float.parseFloat(sc.nextLine());
			System.out.println("Introduce la historia del perro: ");
			String historia = sc.nextLine();
			if (nombre.equals("")) {
				throw new Exception("Tienes que introducir el nombre");
			} else {
				modelo.crear(new Perro(nombre, raza, peso, historia));
			}

		} catch (Exception e) {
			System.out.println("Excepcion : " + e.getMessage());
		}

	}

	private static void listar() throws SQLException {
		ArrayList<Perro> lista = modelo.listar();

		System.out.println("************LISTA DE LOS PERROS************");
		for (Perro perro : lista) {
			System.out.println(String.format("%-15s [%s] %s", perro.getNombre(), perro.getRaza(), perro.isVacunado()));
		}

	}

	/**
	 * Se encraga de pintar las pociones del menu.<br>
	 * Fijaros que no aparece {@code @return} porque no retorna nada {@code void}
	 * 
	 */
	private static void pintarMenu() {
		System.out.println("************************************");
		System.out.println(" " + OPC_LISTA + ".- Listar todos los perros");
		System.out.println(" " + OPC_CREAR + ".- Crear un perro");
		System.out.println(" " + OPC_BAJA + ".- Dar de baja un perro");
		System.out.println(" " + OPC_ACTUALIZAR + ".- Actualizar datos de un perro");
		System.out.println(" " + OPC_VACUNAR + ".- Vacunar un perro");
		System.out.println(" ");
		System.out.println(" " + OPC_SALIR + " - Salir");
		System.out.println("************************************");

		System.out.println("\n Selecciona una opcion del menu:");

		opcion = sc.nextLine();

	}

}// AppPerrera