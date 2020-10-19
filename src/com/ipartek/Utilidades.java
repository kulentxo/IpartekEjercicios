package com.ipartek;

/**
 * Calcula la letra del DNI
 * 
 * @param numeros String son los 8 numeros del DNI
 * @return dni completo con los numeros + letra
 * @throws Exception si no pasamos como parametros 8 numeros
 */
public class Utilidades {

	static public String calcularDNI(String numeros) throws Exception {

		if (numeros == null) {
			throw new Exception("Tienes que introducir los numeros del dni.");
		}
		if (numeros.length() != 8) {
			throw new Exception("Tienes que introducir 8 digitos.");
		}
		char letra = 0;
		char arrLetras[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
				'H', 'L', 'C', 'K', 'E' };
		int letranum = (Integer.parseInt(numeros)) % 23;
		for (int i = 0; i < arrLetras.length; i++) {
			if (letranum == i) {
				letra = arrLetras[i];
			}
		}
		return numeros + letra;
	}

}
