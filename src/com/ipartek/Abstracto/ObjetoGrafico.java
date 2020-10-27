package com.ipartek.Abstracto;

public abstract class ObjetoGrafico {
	int x;
	int y;

	void mover(int x, int y) {
		this.x = x;
		this.y = y;
	}

	abstract void dibujar();
}
