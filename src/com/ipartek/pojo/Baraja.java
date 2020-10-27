package com.ipartek.pojo;

import java.util.ArrayList;
import java.util.Collections;

import com.ipartek.Interfaces.IBaraja;

public class Baraja implements IBaraja {

	@Override
	public void crear(ArrayList<Carta> baraja) {

		int count = 0;
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
	}

	@Override
	public void Barajar(ArrayList<Carta> baraja) {

		Collections.shuffle(baraja);
	}

	@Override
	public void mostrar(ArrayList<Carta> baraja) {

		for (Carta carta : baraja) {
			System.out.println("Carta: " + carta.getNumero() + " " + carta.getPalo());
		}
	}

}
