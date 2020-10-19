package com.ipartek.ejercicios.estructuras;
/**
 * Realizar un programa que realice la siguiente funcionalidad
 *<ul>
 *<li>Se crearan 5 variables enteras con los nombres a, b, c, d y e con los valores 6, 8, 0, 8 y 9</li>
 *<li>Comparar las variables a y c, indicar por consola cual es mayor</li>
 *<li>Indicar cual de las variables es la que tiene menor valor y la de mayor valor</li>
 *<li>Compara las variables b y d y comprueba si son iguales</li>
 *<li>Comprobar si se puede realizar la división de a/c si no se puede realizar indicarlo, en caso contrario realizar la división</li>
 *</ul>

 * @author kulen
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		
		int a, b, c, d ,e, max, min;
		a = 6;
		b = 8;
		c = 0;
		d = 8;
		e = 9;
		max = -1;
		min = 10;

		if(a > c) {
			System.out.println("a es mayor que c");
		}else {
			System.out.println("c es mayor que a");
		}
		
		if(a > max) {
			max = a;
		}else if(a < min) {
			min = a;
		}
		if(b > max) {
			max = b;
		}else if(b < min) {
			min = b;
		}
		if(c > max) {
			max = c;
		}else if(c < min) {
			min = c;
		}
		if(d > max) {
			max = d;
		}else if(d < min) {
			min = d;
		}
		if(e > max) {
			max = e;
		}else if(e < min) {
			min = e;
		}
		System.out.println("El minimo es: " + min);
		System.out.println("El maximo es: " + max);
		
		if(b == d) {
			System.out.println("Son iguales");
		}else {
			System.out.println("Son diferentes");
		}
		
		try {
			System.out.println(a/c);
		} catch (Exception e2) {
			
			System.out.println("Imposible");
		}
	}

}
