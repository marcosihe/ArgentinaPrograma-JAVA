package banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuentasTest {

	@Test
	public void creamosUnaCuenta() {
		// Preparaci�n
		
		// Ejecuci�n
		Cuenta miCuenta = new Cuenta();
		
		// Verificaci�n
		assertNotNull(miCuenta);
	}
	
	@Test
	public void alCrearUnaCuentaTieneSaldoCero() {
		// Preparaci�n
		
		// Ejecuci�n
		Cuenta miCuenta = new Cuenta();
		
		// Verificaci�n
		assertEquals(0, miCuenta.getSaldo(), 0.0);
	}
	@Test
	public void primerDepositoFunciona() {
		// Preparaci�n
		Cuenta miCuenta = new Cuenta();
		
		// Ejecuci�n
		miCuenta.depositar(1000);
		
		// Verificaci�n
		assertEquals(1000, miCuenta.getSaldo(),0.0);
	}
	
	@Test
	public void segundoDepositoFunciona() {
		// Preparaci�n
		Cuenta miCuenta = new Cuenta();
		miCuenta.depositar(1000);
		
		// Ejecuci�n
		miCuenta.depositar(350);
		
		// Verificaci�n
		assertEquals(1350, miCuenta.getSaldo(),0.0);
	}
	
	@Test
	public void extraer550DeUnaCuentaCon1000Queda450() {
		// Preparaci�n
		Cuenta miCuenta = new Cuenta();
		miCuenta.depositar(1000);;
		// Ejecuci�n
		miCuenta.extraer(550);
		// Verificaci�n
		assertEquals(450, miCuenta.getSaldo(),0.0);
	}
	
}
