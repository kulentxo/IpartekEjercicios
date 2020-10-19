package com.ipartek.excepciones;

import java.util.Scanner;

/**
 * Realice un método que reciba como argumento un String y un número y muestre
 * la letra de la posición indicada.<br>
 * Llámelo pasando como parámetro un String sin inicializar.<br>
 * Dicha llamada se encontrara dentro de un bloque try catch, que en caso de
 * producirse una excepción por un paso de parámetros a null, no acabe con la
 * ejecución del programa.<br>
 * Así mismo, se controlara también que si el numero pasado es mayor que el
 * tamaño del string, capturara el error y nos solicitara meter un numero
 * valido, indicándonos los valores en los que puede estar comprendido (para
 * este apartado se le pasa como string la cadena de texto “La lluvia en Sevilla
 * no es una maravilla”)
 * 
 * @author kulen
 *
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char letra;
		String palabra;
		boolean isCorrecto = true;
		do {
			System.out.println("Introduce una palabra: ");
			palabra = sc.nextLine();

			try {
				System.out.println("Introduce un numero: ");
				int num = Integer.parseInt(sc.nextLine());
				letra = Ejercicio3Metodo.calcularPos(palabra, num);
				System.out.println("Esta es la letra que se ha indicado: " + letra);
			} catch (StringIndexOutOfBoundsException e) {
				System.out.println("El numero introducido es demasiado grande");
				isCorrecto = false;
			} catch (NumberFormatException e) {
				System.out.println("El numero introducido es incorrecto");
				isCorrecto = false;
			} catch (Exception e) {
				System.out.println("Excepcion: " + e.getMessage());
				isCorrecto = false;
			}
		} while (isCorrecto == false);
		sc.close();

	}

}
