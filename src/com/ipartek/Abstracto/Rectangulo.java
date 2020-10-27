package com.ipartek.Abstracto;

public abstract class Rectangulo extends ObjetoGrafico {

	int lado;
	int altura;

	int calcularArea() {
		return x * y * lado * altura;
	}
}
