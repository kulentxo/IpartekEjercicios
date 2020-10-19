package com.ipartek.excepciones;

import java.util.Scanner;

/**
 * Realice un programa que nos solicite por teclado dos n�meros, y leerlos
 * usando la clase Scanner mediante la funci�n nextLine().<br>
 * Transformar ambos strings a n�meros enteros usando la siguiente sentencia
 * Integer.parseInt(numeroLeido).<br>
 * Agrupar el c�digo entre un bloque try catch y procesar para que no se
 * produzca una interrupci�n y finalizaci�n del programa si alguno de los
 * n�meros le�dos no puede convertirse, retomando el control en el punto del
 * fallo, hasta que se solucione
 * 
 * @author kulen
 *
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		boolean isCorrecto = true;
		do {
			isCorrecto = true;
			try {
				System.out.println("Introduce un numero: ");
				num1 = Integer.parseInt(sc.nextLine());
				System.out.println("Introduce otro numero: ");
				num2 = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Por favor introduce un numero");
				isCorrecto = false;
			} catch (Exception e) {
				System.out.println("Ha habido un error");
				isCorrecto = false;
			}
		} while (isCorrecto == false);
		sc.close();
	}

}
