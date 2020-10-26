package com.ipartek.Actividades;

import java.util.Scanner;

import com.ipartek.Utilidades;

/**
 * Crear un proyecto en modo consola que nos muestre un menú de 3 opciones
 * <ul>
 * <li>Calcular la letra del dni</li>
 * <li>Calcular medida de cm a pulgadas</li>
 * <li>Salir</li>
 * </ul>
 * Hacer que dicho menú se ejecute en bucle hasta que se pulse salir, y si el
 * usuario escoge cada una de las funciones, que permita introducir los datos
 * correspondientes por teclado para poder dar el resultado
 * 
 * @author Julen Martin
 * @version 1.0
 */
public class Actividad1EjercicioB {

	final static String OPC_DNI = "1";
	final static String OPC_CM = "2";
	final static String OPC_SALIR = "S";
	final static float CALCULAR_PULGADAS = 2.54f;

	static Scanner sc = null;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		String opc;

		do {
			pintarMenu();

			opc = sc.nextLine();

			switch (opc) {
			case OPC_DNI:
				calcularDNI();
				break;
			case OPC_CM:
				calcularCM();

				break;
			default:
				break;
			}
		} while (!opc.equalsIgnoreCase(OPC_SALIR));

		System.out.println("********HASTA OTRA*********");
	}

	private static void calcularDNI() {

		System.out.println("****************CALCULAR LETRA DEL DNI*********************");
		System.out.println("Introduce los 8 numeros de tu dni");
		String dniNumeros = sc.nextLine();

		try {
			String dniCompleto = Utilidades.calcularDNI(dniNumeros);
			System.out.println("Tu dni completo es " + dniCompleto);
		} catch (Exception e) {
			if (e.getMessage() == "Tienes que introducir 8 digitos.") {
				System.out.println(e.getMessage());
			} else if (e.getMessage() == "Tienes que introducir los numeros del dni.") {
				System.out.println(e.getMessage());
			} else {
				System.out.println("Lo sentimos pero tu dni no es valido " + dniNumeros);
			}
		}
	}

	private static void calcularCM() {
		System.out.println("****************CALCULAR PULGADAS*********************");
		try {
			System.out.println("Introduce una distancia en cms: ");
			int distancia = Integer.parseInt(sc.nextLine());
			System.out.println((float) (distancia / CALCULAR_PULGADAS) + " pulgadas");
		} catch (NumberFormatException e) {
			System.out.println("Tienes que introducir un numero valido.");

		} catch (Exception e) {
			System.out.println("Ha ocurrido un error inesperado.");
		}
	}

	private static void pintarMenu() {

		System.out.println("*************MENU*************");
		System.out.println("1.- Caluclar la letra del DNI");
		System.out.println("2.- Calcular medida de cm a pulgadas");
		System.out.println("S - Salir");
		System.out.println("******************************");
	}

}
