package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

import puntos.Punto;

public class PuntoTests {
	
	Punto punto;
	
	@Before
	public void setup() {
		punto = new Punto();
	}

	@Test
	public void crearPunto_debeDevolverUnObjeto() {
		assertNotNull(punto);
	}
	
	@Test
	public void obtenerElValorDeLaCoordenadaX_debeDevolverElValor0() {
		punto.setX(0);
		assertEquals(0, punto.obtenerX(),0);
	}
	
	@Test
	public void obtenerElValorDeLaCoordenadaY_debeDevolverElValor1() {
		punto.setY(1);
		assertEquals(1, punto.obtenerY(),0);
	}
	
	@Test
	public void cambiarCoordenadaY_aElValor0() {
		punto.setY(12);
		punto.cambiarY(0);
		assertEquals(0, punto.obtenerY(),0);
		
	}
	
	@Test
	public void cambiarCoordenadaX_aElValor1() {
		punto.setX(0);
		punto.cambiarX(1);
		assertEquals(1, punto.obtenerX(),0);
	}
	
	@Test
	public void estaEnElEjeX_cuandoElValorDeY_esIgualACero_debeDevolverTrue() {
		punto.setY(0);
		assertTrue(punto.estaSobreEjeX());
	}
	
	@Test
	public void noEstaSobreElEjeX_cuandoElValorDeY_esDiferenteDeCero_devuelveFalse() {
		do {
			punto.setY(Math.random());
		}while(punto.getY() == 0);
	}
	
	@Test
	public void estaEnElEjeY_devuelveTrue_cuandoElValorDeXesCero() {
		punto.setX(0);
		assertTrue(punto.estaSobreEjeY());
	}
	
	@Test
	public void noEstaSobreElEjeY_cuandoElValorDeX_esDiferenteDeCero_devuelveFalse() {
		do {
			punto.setX(Math.random());
		}while(punto.getX() == 0);
	}
	
	@Test
	public void estaEnElOrigen_devuelveTrue_cuandoXeY_valenCero() {
		punto.setX(0);
		punto.setY(0);
		assertTrue(punto.esElOrigen());
	}
	
	@Test
	public void noEstaEnElOrigen_devuelveFalse_cuandoXoY_sonDiferentesDeCero() {
		do {
			punto.setX(Math.random());
		}while(punto.getX() == 0);
		assertFalse(punto.esElOrigen());
	}
}