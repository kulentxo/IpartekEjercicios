package com.ipartek;

import com.ipartek.pojo.Serie;

/**
 * Interfaz para obligar a implementar funciones
 * 
 * @author kulen
 *
 */
public interface iFunciones {

	final int LOTERIA_EUROMILLON = 1;
	final int LOTERIA_QUINIELA = 2;
	final int LOTERIA_BONOLOTO = 3;

	/**
	 * pedir nombre por scanner
	 * 
	 * @throws si el nombre es menor de una letra o si son numeros
	 * @return nombre escrito
	 */
	String pedirNombre() throws Exception;

	/**
	 * imprime los numeros de la loteria
	 * 
	 * @throws si el tipoLoteria no existe
	 * @param tipoLoteria
	 */
	void imprimirNumeroLoteria(int tipoLoteria) throws Exception;

	/**
	 * calcula las vueltas
	 * 
	 * @param dineroEntregado
	 * @param precioProducto
	 * @return el resultado de la resta
	 * @throws Exception
	 */
	float calcularVueltas(float dineroEntregado, float precioProducto) throws Exception;

	/**
	 * Pedimos todos los datos de una serie por consola
	 * 
	 * @return Serie
	 */
	Serie pedirDatosPorConsola();
}
