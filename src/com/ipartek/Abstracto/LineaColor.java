package com.ipartek.Abstracto;

public class LineaColor extends Linea {
	String color;

	@Override
	void dibujar() {

		super.dibujar();
		System.out.println("El color es: " + color);
	}
}
