package ejemplo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestEjemploVivienda {

	@Test
	public void testEstaAdjudicada() {
		assertEquals("No Adjudicada", EjemploViviendas.estaAdjudicada("1234567A", "4"));
		assertEquals("Adjudicada", EjemploViviendas.estaAdjudicada("12345678A", "9"));
		assertEquals("Dato no válido", EjemploViviendas.estaAdjudicada("123456A", "2"));
		assertEquals("Dato no válido", EjemploViviendas.estaAdjudicada("1234567890A", "2"));
		assertEquals("Dato no válido", EjemploViviendas.estaAdjudicada("1234ABC5", "2"));
		assertEquals("Dato no válido", EjemploViviendas.estaAdjudicada("ABCD12345", "6"));
		assertEquals("Dato no válido", EjemploViviendas.estaAdjudicada("1234567A", "-5"));
		assertEquals("Dato no válido", EjemploViviendas.estaAdjudicada("1234567A", "20"));
		assertEquals("Dato no válido", EjemploViviendas.estaAdjudicada("1234567A", "7.5"));
	}

}
