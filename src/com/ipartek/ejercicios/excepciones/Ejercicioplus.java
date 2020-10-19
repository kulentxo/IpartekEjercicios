package com.ipartek.ejercicios.excepciones;

import java.util.Scanner;

import com.ipartek.Utilidades;

/**
 * Realice un programa que nos solicite el numero del dni y nos calcule la
 * letra.<br>
 * Usar el metodo de la clase utilidades<br>
 * Tenemos que capturar la excepcion que nos lanza la funcion <b>calcularDNI</b>
 * 
 * @author kulen
 *
 */
public class Ejercicioplus {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

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
		sc.close();
	}

}
