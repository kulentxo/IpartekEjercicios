package com.ipartek.ejercicios.excepciones;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.pojo.Paciente;

/**
 * Realizar una clase personalizada llamada ExcepcionListaNegra que extienda la
 * clase Exception.<br>
 * Dicha clase constara con un atributo de tipo int llamado codigoError, asi
 * como un constructor completo solamente (sin métodos get ni set ni
 * constructores vacíos).<br>
 * De manera adicional se implementaran los métodos abstractos heredados de la
 * clase, en este caso getMessage().<br>
 * getMessage comprobara el valor del atributo codigoError con una sentencia
 * switch, mostrando el mensaje adecuado al código de error, siguiendo la
 * siguiente tabla:
 * <ul>
 * <li>1. Persona demasiado baja (altura menor de 1.60m)</li>
 * <li>2. Persona demasiado alta (altura mayor de 2.10m)</li>
 * <li>3. Persona en exceso delgada (peso inferior a 35kg)</li>
 * <li>4. Persona en exceso obesa (peso superior a 160kg)</li>
 * <li>5. Persona con los pies planos</li>
 * </ul>
 * En el programa principal, se creara una lista de Pacientes y se solicitara
 * los datos de cada uno de ellos por teclado.<br>
 * Introducir 4 pacientes dentro de los parámetros de salud aceptables e
 * intentar meter 2 de ellos con datos que no permitan las excepciones (por
 * ejemplo peso =225kg y altura = 1.20m)
 * 
 * @author kulen
 *
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Ejercicio saltado con ficheros de execepcioneslistanegra y pacientes

		Scanner sc = new Scanner(System.in);

		ArrayList<Paciente> pacientes = new ArrayList<>();
		Paciente p1 = new Paciente(130, 1.70f);
		Paciente p2 = new Paciente(70, 1.90f);
		Paciente p3 = new Paciente(80, 1.80f);
		Paciente p4 = new Paciente(78, 1.85f);
		Paciente p5 = new Paciente(30, 2.17f);
		Paciente p6 = new Paciente(230, 1.50f);

		sc.close();

	}

}
