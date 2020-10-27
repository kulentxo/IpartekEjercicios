package com.ipartek.Abstracto;

public class Linea extends ObjetoGrafico {

	int longitud;

	@Override
	void dibujar() {

		System.out.println("Dibujamos una linea de longitud: " + longitud);
	}

}
