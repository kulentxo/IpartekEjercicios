package com.ipartek.ejercicios.variable;

/**
 * Realizar un programa que realice la siguiente operación: crear tres variables
 * de tipo Byte, llamadas num1, num2, resultado.<br>
 * Asignar los valores 255 y 223. Sumarlas y guardarlo en resultado.<br>
 * Comprueba si el resultado da 478.<br>
 * Si no lo da, buscar una solución al problema para solucionarlo
 * 
 * @author Julen
 *
 */
public class Ejercicio4 {

	public static void main(String[] args) {

		byte num1, num2, resultado;
		num1 = (byte) 255;
		num2 = (byte) 223;
		resultado = (byte) (num1 + num2);
		System.out.println(resultado);
	}

}
