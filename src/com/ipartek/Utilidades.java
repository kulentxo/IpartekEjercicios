package com.ipartek;

import java.util.Scanner;

import com.ipartek.pojo.Serie;

/**
 * Calcula la letra del DNI
 * 
 * @param numeros String son los 8 numeros del DNI
 * @return dni completo con los numeros + letra
 * @throws Exception si no pasamos como parametros 8 numeros
 */
public class Utilidades implements iFunciones {

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

	@Override
	public String pedirNombre() throws Exception {
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		System.out.println("Introduce un nombre");
		nombre = sc.nextLine();
		if (nombre.length() <= 1) {
			throw new Exception("El nombre debe contener mas de una letra");
		} else if (nombre.matches("[0-9]*")) {
			throw new Exception("El nombre no puede ser un numero");
		}

		return nombre;
	}

	@Override
	public void imprimirNumeroLoteria(int tipoLoteria) throws Exception {

		switch (tipoLoteria) {
		case LOTERIA_EUROMILLON:
			System.out.println("Numero de euromillones 05061537420304");
			break;
		case LOTERIA_BONOLOTO:
			System.out.println("Numero de bonoloto 0104051623431500");
			break;
		case LOTERIA_QUINIELA:
			System.out.println("Numero de quiniela 0509323839");
			break;
		default:
			throw new Exception("El tipo de loteria no existe");
		}
	}

	@Override
	public float calcularVueltas(float dineroEntregado, float precioProducto) throws Exception {

		float resultado = dineroEntregado - precioProducto;
		if (resultado < 0) {
			throw new Exception("No puede salir resultado negativo");
		}
		return resultado;
	}

	@Override
	public Serie pedirDatosPorConsola() {

		Scanner sc = new Scanner(System.in);
		Serie s1 = new Serie();
		System.out.println("Introduce nombre de la serie: ");
		s1.setNombre(sc.nextLine());
		System.out.println("Introduce numero de temporada de la serie: ");
		s1.setNumTemporadas(Integer.parseInt(sc.nextLine()));
		System.out.println("Introduce duracion de la serie: ");
		s1.setDuracion(Integer.parseInt(sc.nextLine()));
		System.out.println("Introduce la plataforma de la serie: ");
		s1.setPlataforma(sc.nextLine());

		return s1;
	}
}
