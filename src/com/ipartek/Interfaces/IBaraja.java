package com.ipartek.Interfaces;

import java.util.ArrayList;

import com.ipartek.pojo.Carta;

public interface IBaraja {

	void crear(ArrayList<Carta> baraja);

	void Barajar(ArrayList<Carta> baraja);

	void mostrar(ArrayList<Carta> baraja);
}
