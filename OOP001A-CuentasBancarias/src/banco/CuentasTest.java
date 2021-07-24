package banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuentasTest {

	@Test
	public void creamosUnaCuenta() {
		// Preparación
		
		// Ejecución
		Cuenta miCuenta = new Cuenta();
		
		// Verificación
		assertNotNull(miCuenta);
	}
	
	@Test
	public void alCrearUnaCuentaTieneSaldoCero() {
		// Preparación
		
		// Ejecución
		Cuenta miCuenta = new Cuenta();
		
		// Verificación
		assertEquals(0, miCuenta.getSaldo(), 0.0);
	}
	@Test
	public void primerDepositoFunciona() {
		// Preparación
		Cuenta miCuenta = new Cuenta();
		
		// Ejecución
		miCuenta.depositar(1000);
		
		// Verificación
		assertEquals(1000, miCuenta.getSaldo(),0.0);
	}
	
	@Test
	public void segundoDepositoFunciona() {
		// Preparación
		Cuenta miCuenta = new Cuenta();
		miCuenta.depositar(1000);
		
		// Ejecución
		miCuenta.depositar(350);
		
		// Verificación
		assertEquals(1350, miCuenta.getSaldo(),0.0);
	}
	
	@Test
	public void extraer550DeUnaCuentaCon1000Queda450() {
		// Preparación
		Cuenta miCuenta = new Cuenta();
		miCuenta.depositar(1000);;
		// Ejecución
		miCuenta.extraer(550);
		// Verificación
		assertEquals(450, miCuenta.getSaldo(),0.0);
	}
	
}
