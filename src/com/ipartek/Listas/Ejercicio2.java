package com.ipartek.Listas;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.pojo.Jugador;

/**
 * Crear una lista de jugadores de futbol.<br>
 * En dicha lista se guardaran objetos de la clase Jugador, que tendrá los
 * atributos nombre, de tipo Sting y dorsal de tipo int.<br>
 * Solicitar los datos de los jugadores por teclado, y una vez introducido el
 * primero, se insertara en la lista y se preguntara si se desea introducir otro
 * más, para lo cual el usuario escribirá S o N.<br>
 * En caso afirmativo se volverá a pedir otro más, hasta que el usuario escriba
 * N
 * 
 * @author kulen
 *
 */
public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Jugador> jugadores = new ArrayList<>();

		char resp;

		do {
			Jugador j1 = new Jugador();

			System.out.println("Introduce nombre del jugador");
			j1.setNombre(sc.nextLine());

			System.out.println("Introduce numero del dorsal");
			j1.setDorsal(Integer.parseInt(sc.nextLine()));

			jugadores.add(j1);

			System.out.println("Desea introducir un nuevo jugador?");
			resp = sc.nextLine().charAt(0);
		} while (Character.toUpperCase(resp) == 'S');

		sc.close();
	}

}
