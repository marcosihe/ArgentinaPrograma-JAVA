package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

import cuentas.Cuenta;
import cuentas.CuentaService;

public class CuentaServiceTests {
	Cuenta cuentaUno, cuentaDos;
	CuentaService cuentaService;
	
	@Before
	public void setup() {
		cuentaUno = new Cuenta();
		cuentaDos = new Cuenta();
		cuentaService = new CuentaService();
	}
	
	@Test
	public void consultarSaldoUnaVezCreadaLaCuenta_debeSerIgualACero() {
		assertEquals(0, cuentaUno.getSaldo(),0);
		assertEquals(0, cuentaDos.getSaldo(),0);
	}
	
	@Test
	public void depositar1000enUnaCuentaConSaldoCero_suSaldoDeberaSerIgualA_1000() {
		cuentaService.depositarDinero(cuentaUno, 1000);
		assertEquals(1000, cuentaUno.getSaldo(),0);
	}
	
	@Test
	public void depositar500enUnaCuentaConSaldode1000_suSaldoDeberaSerIgualA_1500() {
		cuentaService.depositarDinero(cuentaUno, 1000);
		cuentaService.depositarDinero(cuentaUno, 500);
		assertEquals(1500, cuentaUno.getSaldo(), 0);
	}
	
	@Test
	public void extraer1000_deUnaCuentaConSaldo500_deberaContinuarConUnSaldoIgualA_500() {
		cuentaService.depositarDinero(cuentaDos, 500);
		cuentaService.extraerDinero(cuentaDos, 1000);
		assertEquals(500, cuentaDos.getSaldo(), 0);
	}
	
	@Test
	public void transferir500_deUnaCuentaCon_1000aOtraCuentaConSaldo_0_debeDejarAAmbasCuentasConSaldoIgualA_500() {
		cuentaService.depositarDinero(cuentaUno, 1000);
		cuentaService.transferir(cuentaUno, cuentaDos, 500);
		assertEquals(500, cuentaUno.getSaldo(),0);
		assertEquals(500, cuentaDos.getSaldo(),0);
	}
}
