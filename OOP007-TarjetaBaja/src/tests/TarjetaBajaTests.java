package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import tarjetaBaja.TarjetaBaja;

public class TarjetaBajaTests {
	
	TarjetaBaja tarjeta;
	
	@Before
	public void setup() {
		tarjeta = new TarjetaBaja(0);
	}

	@Test
	public void crearTarjetaBaja_debeDevolverUnObjeto() {
		assertNotNull(tarjeta);
	}
	
	@Test
	public void consultarSaldoUnaVezCreadaLaTarjeta_debeSerIgualA_cero() {
		assertEquals(0, tarjeta.obtenerSaldo(),0);
	}
	
	@Test
	public void cargar_100_aUnaTarjetaConSaldoIncialDeCero_ElSaldoDeberaSerIgualA_100() {
		tarjeta.cargar(100);
		assertEquals(100, tarjeta.obtenerSaldo(),0);
	}
	
	@Test
	public void viajarEnSubteConSaldoMayorAlCostoDelPasajeEnSubte_debeDevolverTrue() {
		double saldoInicial = 100;
		tarjeta.cargar(saldoInicial);
		tarjeta.pagarViajeEnSubte();
		assertTrue(tarjeta.obtenerSaldo() < saldoInicial);
		
	}
	
	@Test
	public void viajarEnSubteConSaldoMenorAlCostoDelPasajeEnSubte_debeDevolverFalse() {
		double saldoInicial = tarjeta.obtenerSaldo();
		tarjeta.pagarViajeEnSubte();
		assertFalse(tarjeta.obtenerSaldo() < saldoInicial);
	}
	
	@Test
	public void viajarEnSubteConSaldoIgualAlCostoDelPasajeEnSubte_debeDevolverTrue() {
		tarjeta.cargar(tarjeta.getCostoDelViajeEnSubte());
		double saldoInicial = tarjeta.obtenerSaldo();
		tarjeta.pagarViajeEnSubte();
		assertTrue(tarjeta.obtenerSaldo() < saldoInicial);
	}
	
	@Test
	public void alViajar8vecesEnSubte_laCantidadDeViajesEnSubteDebeSerIgualA_8() {
		tarjeta.cargar(tarjeta.getCostoDelViajeEnSubte() * 8);
		for(int i = 0; i < 8; i++) {
			tarjeta.pagarViajeEnSubte();
		}
		assertEquals(8, tarjeta.contarCantidadDeViajesEnSubte(),0);
	}
	
	@Test
	public void alViajar5vecesEnSubte_y_5VecesEnColectivo_laCantidadDeViajesDebeSerIgualA_10() {
		tarjeta.cargar(tarjeta.getCostoDelViajeEnSubte() * 5 + tarjeta.getCostoDelViajeEncolectivo() * 5);
		for(int i = 0; i < 5; i++) {
			tarjeta.pagarViajeEnColectivo();
			tarjeta.pagarViajeEnSubte();
		}
		assertEquals(10, tarjeta.contarViajes(),0);
	}

}
