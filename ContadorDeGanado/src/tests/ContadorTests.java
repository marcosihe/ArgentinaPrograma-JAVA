package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import contador.Contador;

public class ContadorTests {
	
	Contador contador;
	
	@Before
	public void setup() {
		contador = new Contador();
	}
	
	@After
	public void tearDown() {
		contador = null;
	}
	

	@Test
	public void crearUnContador_deberiaRetornarUnObjeto() {
		assertNotNull(contador);
	}
	
	@Test
	public void queContadorPuedeContar() {
		contador.contar();
		assertEquals(1, contador.mostrar());
	}
	
	@Test
	public void queElContadorSeReiniciaSinHaberContado() {
		contador.reiniciar();
		assertEquals(0, contador.mostrar());
	}
	
	@Test
	public void queElContadorSeReiniciaLuegoDeContar() {
		contador.contar();
		contador.reiniciar();
		assertEquals(0, contador.mostrar());
	}
	
	@Test
	public void queCuenta100Veces() {
		for(int i = 0; i < 100; i++) {
			contador.contar();
		}
		assertEquals(100, contador.mostrar());
	}
	

}
