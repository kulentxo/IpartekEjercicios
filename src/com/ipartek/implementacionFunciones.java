package com.ipartek;

import java.util.Scanner;

import com.ipartek.pojo.Serie;

public class implementacionFunciones {

	public static void main(String[] args) {
		int opc = 0;
		float dinero = 0;
		float vueltas = 0;
		Scanner sc = new Scanner(System.in);
		Utilidades util = new Utilidades();
		try {
			String nombre = util.pedirNombre();
			System.out.println("Tu nombre es: " + nombre);

			System.out.println("Introduce una de estas opciones: ");
			System.out.println("1.- Euromillones");
			System.out.println("2.- Quiniela");
			System.out.println("3.- Bonoloto");

			opc = Integer.parseInt(sc.nextLine());
			util.imprimirNumeroLoteria(opc);

			System.out.println("El precio del ordenador son 1000€");
			System.out.println("Con cuanto dinero pagas?");
			dinero = Float.parseFloat(sc.nextLine());
			vueltas = util.calcularVueltas(dinero, 1000.0f);
			System.out.printf("Estas son las vueltas %.2f€\n", vueltas);

			Serie s = util.pedirDatosPorConsola();
			System.out.println(s.getNombre());

		} catch (Exception e) {
			System.out.println("Excepcion: " + e.getMessage());
		}
		sc.close();

	}

}
