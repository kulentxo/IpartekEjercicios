package com.ipartek.Listas;

import java.util.ArrayList;

import com.ipartek.pojo.Baraja;
import com.ipartek.pojo.Carta;

/**
 * Crear una lista que contenga las cuarenta cartas de una baraja.<br>
 * Para crear dicha lista se creara una clase de tipo carta, que tendr� un
 * n�mero entero para el valor de la carta, as� como un string con el palo de la
 * baraja (copas, espadas, oros, bastos).<br>
 * Crear la baraja con las cartas ordenadas por palos, y luego por n�meros.<br>
 * Barajar dicha baraja y mostrar las cartas.
 * 
 * @author kulen
 *
 */
public class Ejercicio4 {

	public static void main(String[] args) {

		ArrayList<Carta> baraja = new ArrayList<>();
		Baraja b = new Baraja();

		b.crear(baraja);

		b.Barajar(baraja);

		b.mostrar(baraja);
	}

}
