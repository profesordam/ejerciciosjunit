import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class HuchaTest {
	
	private Hucha hucha;
	
	public HuchaTest() {
		hucha = new Hucha("contraseña", 135);
	}
	
	@Test
	public void testAñadirAbierta() {
		assertTrue(hucha.añadir(80));
	}
	
	@Test
	public void testAñadirCerrada() {
		hucha.cerrar();
		assertFalse(hucha.añadir(80));
	}

}
