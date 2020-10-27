package com.ipartek;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	public void testSuma() {
		int res = Calculadora.suma(3, 2);
		int esperado = 5;
		assertEquals(esperado, res);
	}

	@Test
	public void testResta() {
		int res = Calculadora.resta(3, 2);
		int esperado = 1;
		assertEquals(esperado, res);
	}

	@Test
	public void testUtilidades() {
		Utilidades util = new Utilidades();
		int res = 0;
		try {
			res = (int) util.calcularVueltas(100, 100);
		} catch (Exception e) {

			e.printStackTrace();
		}
		int esperado = 0;
		assertEquals(esperado, res);
	}

}
