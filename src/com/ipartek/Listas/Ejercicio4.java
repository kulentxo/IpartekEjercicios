package com.ipartek.Listas;

import java.util.ArrayList;
import java.util.Collections;

import com.ipartek.pojo.Carta;

/**
 * Crear una lista que contenga las cuarenta cartas de una baraja.<br>
 * Para crear dicha lista se creara una clase de tipo carta, que tendrá un
 * número entero para el valor de la carta, así como un string con el palo de la
 * baraja (copas, espadas, oros, bastos).<br>
 * Crear la baraja con las cartas ordenadas por palos, y luego por números.<br>
 * Barajar dicha baraja y mostrar las cartas.
 * 
 * @author kulen
 *
 */
public class Ejercicio4 {

	public static void main(String[] args) {

		int count = 0;
		ArrayList<Carta> baraja = new ArrayList<>();

		for (int i = 1; i <= 41; i++) {
			count++;
			Carta carta = new Carta();
			if (i <= 10) {
				carta.setNumero(count);
				carta.setPalo("copa");
				baraja.add(carta);
			} else if (i > 10 && i <= 20) {
				carta.setNumero(count);
				carta.setPalo("basto");
				baraja.add(carta);
			} else if (i > 20 && i <= 30) {
				carta.setNumero(count);
				carta.setPalo("espada");
				baraja.add(carta);
			} else {
				carta.setNumero(count);
				carta.setPalo("oro");
				baraja.add(carta);
			}
			if (count == 10) {
				count = 0;
			}
		} // for

		Collections.shuffle(baraja);
		for (Carta carta : baraja) {
			System.out.println("Carta: " + carta.getNumero() + " " + carta.getPalo());
		}
	}

}
