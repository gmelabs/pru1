package test;

import static org.junit.Assert.*;

import org.junit.Test;

import acn.b.gmelabs.test.Prueba;

public class TestPrueba {
	
	@Test
	public void testSuma() {
		Prueba prueba = new Prueba();
		int cinco = prueba.suma(2, 3);
		int cero = prueba.suma(2, -2);
		assertEquals("Error al sumar 2 y 3",  5, cinco);
		assertEquals("Error al sumar 2 y -2", 0, cero);
	}
	
	@Test
	public void testResta() {
		Prueba prueba = new Prueba();
		int uno = prueba.resta(6, 5);
		int cero = prueba.resta(4, 4);
		int menosuno = prueba.resta(2, 3);
		int cuatro = prueba.resta(2, -2);
		assertEquals("Error al restar 6 - 5",    1, uno);
		assertEquals("Error al restar 4 - 4",    0, cero);
		assertEquals("Error al restar 2 - 3",   -1, menosuno);
		assertEquals("Error al restar 2 - (-2)", 4, cuatro);
	}
}
