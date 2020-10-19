package com.ipartek.ejercicios.variable;


/**
 * Realizar un programa que cree una variable de cada uno de los tipos de datos simples que podemos encontrar en el lenguaje de programación Java, asignándoles un valor
 * Una vez creadas, se mostraran por pantalla los valores de cada una de ellas
 * De manera adicional, se buscara por internet o otras fuentes, los valores máximos y mínimos que pueden albergar 
 *
 * @author kulen
 *
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		
		/*
		 * Rango maximo y minimos de byte [-128, 127]
		 * Rango maximo y minimos de short [-32.768, 32.767]
		 * Rango maximo y minimos de long [-2 63, 2 63 - 1]
		 * Rango maximo y minimos de int [-2 31, 2 31 -1]
		 * Rango maximo y minimos de float [1.4x10 -45, 3.4028235x10 38]
		 * Rango maximo y minimos de double [4.9x10 -324, 1.7976931348623157x10 308]
		 */
		int numero = 2147483647;
		float sueldoFloat = 10000.01f;
		boolean isApprove = true;
		byte numeroByte = 127;
		long numeroLong = 2147483647;
		short numeroShort = (short) 400000;
		double sueldoDouble = 10000.01d;
		char caracter = 'c';
		
		System.out.println(numero);
		System.out.println(sueldoFloat);
		System.out.println(isApprove);
		System.out.println(numeroByte);
		System.out.println(numeroLong);
		System.out.println(numeroShort);
		System.out.println(sueldoDouble);
		System.out.println(caracter);
		
		//wrappers => son clases que envuelven a las variables primitivas con ciertas utilidades.
		// int     => Integer
		// float   => Float
		// char    => Character
		// boolean => Boolean
		
		System.out.println("Valor maximo de int: " + Integer.MAX_VALUE);
		System.out.println("Valor minimo de int: " + Integer.MIN_VALUE);
		System.out.println("Valor maximo de float: " + Float.MAX_VALUE);
		System.out.println("Valor minimo de float: " + Float.MIN_VALUE);
	}

}
