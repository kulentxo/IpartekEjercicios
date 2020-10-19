package com.ipartek.excepciones;

public class Ejercicio3Metodo {
	static public char calcularPos(String frase, int num) throws Exception {
		char letra;
		if (frase == null) {
			throw new Exception("No has introducido la frase.");
		}
		letra = frase.charAt(num);
		return letra;
	}
}
