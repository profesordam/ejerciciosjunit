package ejercicio2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestEjercicio2 {
	
	@Test
	public void testGetSalario() {
		assertEquals("2000", Ejercicio2.getSalario("700", "17", "programador"));
		assertEquals("2500", Ejercicio2.getSalario("990", "", "analista"));
		assertEquals("1500", Ejercicio2.getSalario("101", "30", "diseñador"));
		assertEquals("err1", Ejercicio2.getSalario("40", "78", "programador"));
		assertEquals("err1", Ejercicio2.getSalario("1001", "", "analista"));
		assertEquals("err2", Ejercicio2.getSalario("256", "7", "diseñador"));
		assertEquals("err2", Ejercicio2.getSalario("255", "121", "programador"));
		assertEquals("err3", Ejercicio2.getSalario("257", "12", ""));
	}
	
	@Test(expected = NumberFormatException.class)
	public void testGetSalarioEmpleadoNumberFormatExeption() {
		Ejercicio2.getSalario("pepe", "", "analista");
	}
	
	@Test(expected = NumberFormatException.class)
	public void testGetSalarioDepartamentoNumberFormatExeption() {
		Ejercicio2.getSalario("145", "abc", "programador");
	}
	
}
