package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import salaDeCine.SalaDeCine;

public class SalaDeCineTests {
	SalaDeCine sala;
	
	@Before
	public void setup() {		
		sala = new SalaDeCine(4,20);
	}

	@Test
	public void crearSalaDeCineCon$filasY20Butacas_debeDevolverUnObjetoDeTipoArregloBidimensional4x5() {
		assertNotNull(sala);
	}
	
	@Test
	public void verificarSiExisteElAsiento_40_debeDevolverFalse() {
		assertFalse(sala.existeElAsiento(4, 0));
	}
	
	@Test
	public void verificarSiExisteElAsiento_45_debeDevolverFalse() {
		assertFalse(sala.existeElAsiento(4, 0));
	}
	
	@Test
	public void verificarSiExisteElAsiento_35_debeDevolverFalse() {
		assertFalse(sala.existeElAsiento(3, 5));
	}
	
	@Test
	public void verificarSiExisteElAsiento_33_debeDevolverTrue() {
		assertTrue(sala.existeElAsiento(3, 3));
	}
	
	@Test
	public void verificarSiElAsiento00EstaOcupadoLuegoDeCrearLaSalaDeCine_debeDevolverFalse() {
		assertFalse(sala.estaOcupado(0, 0));
	}
	
	@Test
	public void ocuparAsiento00LuegoDeCrearLaSala_debeDevolverTrue() {
		assertTrue(sala.ocuparAsiento(0, 0));
	}
	
	@Test
	public void ocuparUnAsientoQueNoExiste_debeDevolverFalse() {
		assertFalse(sala.ocuparAsiento(4, 0));
	}
	
	@Test
	public void ocuparUnAsientoQueYaEstaOcupado_debeDevolverFalse() {
		sala.ocuparAsiento(0, 0);
		assertFalse(sala.ocuparAsiento(0, 0));
	}
	@Test
	public void ocuparAsiento_22_verificarSiEstaOcupadoDebeDevolverTrue() {
		sala.ocuparAsiento(2,2);
		assertTrue(sala.estaOcupado(2, 2));
	}
	
	@Test
	public void getCantidadDeButacasOcupadas_luegoDeCrearLaSala_debeDevovlerCero() {
		assertEquals(0, sala.getCantidadDeButacasOcupadas());
	}
	
	@Test
	public void getCantidadDeButacasOcupadas_despuesDeOcupar4_debeDevolverCuatro() {
		for(int i = 0; i < 4; i++) {
			sala.ocuparAsiento(i, 0);
		}
		assertEquals(4, sala.getCantidadDeButacasOcupadas());
	}
	
	@Test
	public void hayEspacioPara_3personas_luegoDeCrearLaSala_debeDevolverTrue() {
		assertTrue(sala.hayEspacioPara(3));
	}
	
	@Test
	public void hayEspacioPara_3personas_conLaPrimeraYsegundaColumnaCompleta_debeDevolverTrue() {
		for(int i = 0; i < 4; i++) {
			sala.ocuparAsiento(i, 0);
			sala.ocuparAsiento(i, 1);
		}
		assertTrue(sala.hayEspacioPara(3));
	}
	
	@Test
	public void hayEspacioPara_4personas_con_alMenos_4_lugaresConsecutivosVaciosPeroNoDeLaMismaFila_debeDevolverFalse() {
		for(int i = 0; i < 4; i++ ) {
			sala.ocuparAsiento(i, 1); // Completa la columna 1
			sala.ocuparAsiento(i, 2); // Completa la columna 2
			sala.ocuparAsiento(i, 3); // Completa la columna 3
		}
		assertFalse(sala.hayEspacioPara(4));
	}
}
